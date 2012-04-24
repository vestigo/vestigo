package org.nightlabs.vestigo.release;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class VersionUpdater {

	private String newMavenVersion = "0.7.0-SNAPSHOT";
	private String artifactIdPrefix = "org.nightlabs.vestigo.";

	private String newOsgiVersionWithoutSuffix;
	private String newOsgiVersion;

	private String rootDir = "..";

	private List<File> pomFiles;
	private List<File> featureFiles;
	private List<File> categoryFiles;

	private VersionUpdater() { }

	public static void main(String[] args) throws Exception {
		new VersionUpdater().update();
	}

	private void update() throws Exception {
		determineNewOsgiVersion();

		File rootDir = new File(this.rootDir);
		collectFiles(rootDir);
		updateCategoryFiles();
		updateFeatureFiles();
		updatePomFiles();
	}

	private void updatePomFiles() {

	}

	private void updateFeatureFiles() throws Exception {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		TransformerFactory tFactory = TransformerFactory.newInstance();

		for (File  f : featureFiles) {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document document = dBuilder.parse(f);
			updateFeatureFileDocument(document);

			Transformer transformer = tFactory.newTransformer();
			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(f);
			transformer.transform(source, result);
		}
	}

	private void updateFeatureFileDocument(Document document) {
		NodeList featureList = document.getElementsByTagName("feature");
		for (int i = 0; i < featureList.getLength(); ++i) {
			Node node = featureList.item(i);
			if (node instanceof Element) {
				Element element = (Element) node;
				element.setAttribute("version", newMavenVersion);
			}

			NodeList childNodes = node.getChildNodes();
			for (int a = 0; a < childNodes.getLength(); ++a) {
				Node childNode = childNodes.item(a);
				if ("requires".equals(childNode.getNodeName())) {
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

	private void determineNewOsgiVersion() {
		if (newMavenVersion.endsWith("-SNAPSHOT")) {
			String versionWithoutSuffix = newMavenVersion.substring(0, newMavenVersion.length() - "-SNAPSHOT".length());
			newOsgiVersionWithoutSuffix = versionWithoutSuffix;
			newOsgiVersion = versionWithoutSuffix + ".qualifier";
		}
		else  {
			if (newMavenVersion.contains("-"))
				throw new IllegalStateException("Maven version must not contain a suffix other than '-SNAPSHOT'!!! Other suffixes are not supported by tycho!");

			newOsgiVersionWithoutSuffix = newMavenVersion;
			newOsgiVersion = newMavenVersion;
		}
	}

	private void updateCategoryFiles() throws Exception {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		TransformerFactory tFactory = TransformerFactory.newInstance();

		for (File  f : categoryFiles) {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document document = dBuilder.parse(f);
			updateCategoryFileDocument(document);

			Transformer transformer = tFactory.newTransformer();
			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(f);
			transformer.transform(source, result);
		}
	}

	private void updateCategoryFileDocument(Document document) {
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
				newUrl = newUrl + newOsgiVersion + suffix;
				element.setAttribute("url", newUrl);
				element.setAttribute("version", newMavenVersion);
			}
		}
	}

	private void collectFiles(File dir) {
		pomFiles = new ArrayList<File>();
		featureFiles = new ArrayList<File>();
		categoryFiles = new ArrayList<File>();
		_collectFiles(dir);
	}
	private void _collectFiles(File dirOrFile) {
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

		File[] listFiles = dirOrFile.listFiles();
		if (listFiles != null) {
			for (File child : listFiles)
				_collectFiles(child);
		}
	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();

		Node nValue = nlList.item(0);

		return nValue.getNodeValue();
	}
}
