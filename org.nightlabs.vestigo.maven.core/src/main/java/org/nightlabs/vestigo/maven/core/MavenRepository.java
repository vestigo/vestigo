package org.nightlabs.vestigo.maven.core;

public class MavenRepository
{
	private String id;
	private String name;
	private String url;
	private boolean releasesEnabled;
	private boolean snapshotsEnabled;
	private MavenRepositoryLayout layout;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isReleasesEnabled() {
		return releasesEnabled;
	}
	public void setReleasesEnabled(boolean releasesEnabled) {
		this.releasesEnabled = releasesEnabled;
	}

	public boolean isSnapshotsEnabled() {
		return snapshotsEnabled;
	}
	public void setSnapshotsEnabled(boolean snapshotsEnabled) {
		this.snapshotsEnabled = snapshotsEnabled;
	}

	public MavenRepositoryLayout getLayout() {
		return layout;
	}
	public void setLayout(MavenRepositoryLayout layout) {
		this.layout = layout;
	}
}
