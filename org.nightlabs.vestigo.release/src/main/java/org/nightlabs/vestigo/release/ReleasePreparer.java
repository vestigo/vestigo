package org.nightlabs.vestigo.release;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.nightlabs.util.IOUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class ReleasePreparer {

	// Set 'newMavenVersion' to the new desired  version. Then run the main method. It will update
	// all files accordingly. See HOWTO-release.txt in project 'org.nightlabs.vestigo.parent'.
	protected String newMavenVersion = "0.9.0";

	protected String copyrightURL = "http://vestigo.nightlabs.com/${project.version}/about/imprint.html";
	protected String copyrightNotice = "© 2011-2012 NightLabs Consulting GmbH. All rights reserved.";

	protected String licenceURL = "http://vestigo.nightlabs.com/${project.version}/about/licence.html";

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// DO NOT CHANGE ANYTHING BELOW THIS POINT, if you don't really want to improve this program.
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static final Logger logger = LoggerFactory.getLogger(ReleasePreparer.class);

	public static final String PROPERTIES_BEGIN_MARKER = "###PROPERTIES_BEGIN###";
	public static final String PROPERTIES_END_MARKER = "###PROPERTIES_END###";

	protected Pattern[] excludePathPatterns = {
		Pattern.compile(".*\\/target\\/.*")
	};

	protected String artifactIdPrefix = "org.nightlabs.vestigo.";

	protected String newOsgiVersionWithoutSuffix;
	protected String newOsgiVersionWithQualifier;
	protected String newOsgiVersionWithSnapshot;

	protected String rootDir = "..";

	protected Properties properties;

	protected List<File> pomFiles;
	protected List<File> featureFiles;
	protected List<File> categoryFiles;
	protected List<File> manifestFiles;

	protected String licenceText;

	protected ReleasePreparer() { }

	public static void main(String[] args) throws Exception {
		new ReleasePreparer().run();
	}

	public void run() throws Exception {
		logger.info("run: Entered.");
		determineNewOsgiVersion();

		readLicenceText();

		initProperties();

		logger.info("run: Collecting files.");
		File rootDir = new File(this.rootDir);
		collectFiles(rootDir);
		logger.info("run: Files collected.");

		logger.info("run: Updating files.");
		updateCategoryFiles();
		updateFeatureFiles();
		updatePomFiles();
		updateManifestFiles();
		logger.info("run: Completed.");
	}

	protected void initProperties() {
		properties = new Properties();
		properties.setProperty("project.version", newMavenVersion);
	}

	protected void readLicenceText() throws Exception {
		licenceText = IOUtil.readTextFile(new File("src/main/resources/LICENCE.txt"));
	}

	protected void updateManifestFiles() throws Exception {
		for (File  f : manifestFiles) {
			File tmpFile = new File(f.getParentFile(), f.getName() + ".tmp");
			InputStream in = null;
			OutputStream out = null;
			try {
				boolean replaceFile = false;
				in = new FileInputStream(f);
				out = new FileOutputStream(tmpFile);
				BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
				Writer writer = new OutputStreamWriter(out, "UTF-8");
				String line;
				while (null != (line = reader.readLine())) {
					if (line.startsWith("Bundle-SymbolicName:")) {
						String bundleName = line.substring("Bundle-SymbolicName:".length()).trim();
						if (bundleName.startsWith(artifactIdPrefix))
							replaceFile = true;
					}
					else if (line.startsWith("Bundle-Version:")) {
						line = "Bundle-Version: " + newOsgiVersionWithSnapshot;
					}
					writer.write(line);
					writer.write("\r\n");
				}
				reader.close();
				writer.close();

				if (replaceFile) {
					f.delete();
					if (!tmpFile.renameTo(f))
						throw new IOException("Failed to rename '" + tmpFile.getAbsolutePath() + "' to '" + f.getAbsolutePath() + "'!!!");
				}
			} finally {
				if (in != null)
					in.close();

				if (out != null)
					out.close();

				tmpFile.delete();
			}
		}
	}

	protected void updatePomFiles() throws Exception {
		for (File  f : pomFiles) {
			new PomUpdater(f).setArtifactIdPrefix(artifactIdPrefix).setNewMavenVersion(newMavenVersion).update();
		}
	}

	protected void updateFeatureFiles() throws Exception {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer = tFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");

		for (File  f : featureFiles) {
			logger.info("updateFeatureFiles: file={}", f.getAbsolutePath());
			Document document = dBuilder.parse(f);
			updateFeatureFileDocument(document);

			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(f);
			transformer.transform(source, result);
		}
	}

	protected Map<String, String> getFeatureProperties(Document document) throws Exception {
		Properties properties = new Properties();
		properties.putAll(this.properties);

		NodeList featureList = document.getElementsByTagName("feature");
		for (int i = 0; i < featureList.getLength(); ++i) {
			Node node = featureList.item(i);

			NodeList childNodes = node.getChildNodes();
			for (int a = 0; a < childNodes.getLength(); ++a) {
				Node childNode = childNodes.item(a);
				if (Node.COMMENT_NODE == childNode.getNodeType()) {
					String comment = childNode.getTextContent();
					if (comment != null) {
						int beginMarkerIdx = comment.indexOf(PROPERTIES_BEGIN_MARKER);
						if (beginMarkerIdx >= 0) {
							int endMarkerIdx = comment.indexOf(PROPERTIES_END_MARKER);
							if (endMarkerIdx < 0)
								throw new IllegalStateException(String.format("File has begin marker '%s', but end marker '%s' is missing!", PROPERTIES_BEGIN_MARKER, PROPERTIES_END_MARKER));

							String propertiesString = comment.substring(
									beginMarkerIdx + PROPERTIES_BEGIN_MARKER.length(), endMarkerIdx);

							StringReader r = new StringReader(propertiesString);
							properties.load(r);
							logger.trace("{}", properties);
						}
					}
				}
			}
		}

		return resolveProperties(properties, 3);
	}

	protected void updateFeatureFileDocument(Document document) throws Exception {
		NodeList featureList = document.getElementsByTagName("feature");
		for (int i = 0; i < featureList.getLength(); ++i) {
			Node node = featureList.item(i);
			if (node instanceof Element) {
				Element element = (Element) node;
				element.setAttribute("version", newOsgiVersionWithQualifier);
			}

			NodeList childNodes = node.getChildNodes();
			for (int a = 0; a < childNodes.getLength(); ++a) {
				Node childNode = childNodes.item(a);
				if ("description".equals(childNode.getNodeName())) {
					Map<String, String> featureProperties = getFeatureProperties(document);
					String descriptionText = featureProperties.get("description.text");
					if (descriptionText == null)
						descriptionText = "!!!Property description.text missing!!!";

					setTagValue(document, childNode, descriptionText, featureProperties);

					if (childNode instanceof Element) {
						Element element = (Element) childNode;
						String descriptionURL = featureProperties.get("description.url");
						if (descriptionURL == null)
							descriptionURL = "!!!Property description.url missing!!!";
						element.setAttribute("url", IOUtil.replaceTemplateVariables(descriptionURL, properties));
					}
				}
				else if ("copyright".equals(childNode.getNodeName())) {
					setTagValue(document, childNode, copyrightNotice, properties);

					if (childNode instanceof Element) {
						Element element = (Element) childNode;
						element.setAttribute("url", IOUtil.replaceTemplateVariables(copyrightURL, properties));
					}
				}
				else if ("license".equals(childNode.getNodeName())) {
					setTagValue(document, childNode, licenceText); // MUST be final (without variables!!!), because LICENCE.txt is packaged as is.

					if (childNode instanceof Element) {
						Element element = (Element) childNode;
						element.setAttribute("url", IOUtil.replaceTemplateVariables(licenceURL, properties));
					}
				}
				else if ("requires".equals(childNode.getNodeName())) {
					NodeList childNodes2 = childNode.getChildNodes();
					for (int b = 0; b < childNodes2.getLength(); ++b) {
						Node childNode2 = childNodes2.item(b);
						if ("import".equals(childNode2.getNodeName()) && (childNode2 instanceof Element)) {
							Element element = (Element) childNode2;
							String feature = element.getAttribute("feature");
							if (feature != null && feature.startsWith(artifactIdPrefix))
								element.setAttribute("version", newOsgiVersionWithoutSuffix);
						}
					}
				}
			}
		}
	}

	protected void determineNewOsgiVersion() {
		if (newMavenVersion.endsWith("-SNAPSHOT")) {
			String versionWithoutSuffix = newMavenVersion.substring(0, newMavenVersion.length() - "-SNAPSHOT".length());
			newOsgiVersionWithoutSuffix = versionWithoutSuffix;
			newOsgiVersionWithQualifier = versionWithoutSuffix + ".qualifier";
			newOsgiVersionWithSnapshot = versionWithoutSuffix + ".SNAPSHOT";
		}
		else  {
			if (newMavenVersion.contains("-"))
				throw new IllegalStateException("Maven version must not contain a suffix other than '-SNAPSHOT'!!! Other suffixes are not supported by tycho!");

			newOsgiVersionWithoutSuffix = newMavenVersion;
			newOsgiVersionWithQualifier = newMavenVersion;
			newOsgiVersionWithSnapshot = newMavenVersion;
		}
	}

	protected void updateCategoryFiles() throws Exception {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer = tFactory.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");

		for (File  f : categoryFiles) {
			Document document = dBuilder.parse(f);
			updateCategoryFileDocument(document);

			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(f);
			transformer.transform(source, result);
		}
	}

	protected void updateCategoryFileDocument(Document document) {
		NodeList featureList = document.getElementsByTagName("feature");
		for (int i = 0; i < featureList.getLength(); ++i) {
			Node node = featureList.item(i);
			if (node instanceof Element) {
				Element element = (Element) node;
				String url = element.getAttribute("url");
				String suffix = ".jar";
				if (!url.endsWith(suffix))
					throw new IllegalStateException("url does not end on '" + suffix + "': " + url);

				String newUrl = url.substring(0, url.length() - suffix.length());
				int lastUnderscoreIdx = newUrl.lastIndexOf('_');
				if (lastUnderscoreIdx < 0)
					throw new IllegalStateException("url does not contain '_': " + url);

				newUrl = newUrl.substring(0, lastUnderscoreIdx + 1);
				newUrl = newUrl + newOsgiVersionWithQualifier + suffix;
				element.setAttribute("url", newUrl);
				element.setAttribute("version", newOsgiVersionWithQualifier);
			}
		}
	}

	protected void collectFiles(File dir) throws IOException {
		pomFiles = new ArrayList<File>();
		featureFiles = new ArrayList<File>();
		categoryFiles = new ArrayList<File>();
		manifestFiles = new ArrayList<File>();
		_collectFiles(dir.getCanonicalFile());
	}
	protected void _collectFiles(File dirOrFile) {
		if (dirOrFile.getName().startsWith("."))
			return;

		for (Pattern excludePathPattern : excludePathPatterns) {
			if (excludePathPattern.matcher(dirOrFile.getAbsolutePath()).matches()) {
				logger.debug("_collectFiles: excludePathPattern '{}' matches '{}'. Skipping.", excludePathPattern, dirOrFile);
				return;
			}
		}

		if ("pom.xml".equals(dirOrFile.getName())) {
			pomFiles.add(dirOrFile);
			return;
		}

		if ("feature.xml".equals(dirOrFile.getName())) {
			featureFiles.add(dirOrFile);
			return;
		}

		if ("category.xml".equals(dirOrFile.getName())) {
			categoryFiles.add(dirOrFile);
			return;
		}

		if ("MANIFEST.MF".equals(dirOrFile.getName())) {
			manifestFiles.add(dirOrFile);
			return;
		}

		File[] listFiles = dirOrFile.listFiles();
		if (listFiles != null) {
			for (File child : listFiles)
				_collectFiles(child);
		}
	}

	protected static void setTagValue(Document document, Node node, String value) {
		setTagValue(document, node, value, null);
	}

	protected static void setTagValue(Document document, Node node, String value, Map<?, ?> valueVariables) {
		while (node.getFirstChild() != null)
			node.removeChild(node.getFirstChild());

		String v = (valueVariables == null || valueVariables.isEmpty()) ?
				value : IOUtil.replaceTemplateVariables(value, valueVariables);

		Text textNode = document.createTextNode(v);
		node.appendChild(textNode);
	}

	protected static Map<String, String> resolveProperties(Map<?, ?> properties, int depth) {
		if (depth < 1)
			throw new IllegalArgumentException("depth < 1");

		Map<String, String> result = null;
		for (int i = 0; i < depth; ++i) {
			result = resolveProperties(result == null ? properties : result);
		}
		return result;
	}

	protected static Map<String, String> resolveProperties(Map<?, ?> properties) {
		Map<String, String> result = new HashMap<String, String>(properties.size());
		for (Map.Entry<?, ?> me : properties.entrySet()) {
			String key = me.getKey().toString();
			String value = IOUtil.replaceTemplateVariables(me.getValue().toString(), properties);
			result.put(key, value);
		}
		return result;
	}
}
