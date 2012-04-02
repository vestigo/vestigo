package org.nightlabs.vestigo.maven.core;


public class Repository
{
	private String id;
	private String name;
	private String url;
	private ReleasesSnapshotsPolicy releases = new ReleasesSnapshotsPolicy();
	private ReleasesSnapshotsPolicy snapshots = new ReleasesSnapshotsPolicy();
	private RepositoryLayout layout;

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

	public ReleasesSnapshotsPolicy getReleases() {
		return releases;
	}
	public void setReleases(ReleasesSnapshotsPolicy releases) {
		this.releases = releases;
	}
	public ReleasesSnapshotsPolicy getSnapshots() {
		return snapshots;
	}
	public void setSnapshots(ReleasesSnapshotsPolicy snapshots) {
		this.snapshots = snapshots;
	}

	public RepositoryLayout getLayout() {
		return layout;
	}
	public void setLayout(RepositoryLayout layout) {
		this.layout = layout;
	}
}
