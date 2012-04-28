/*
 * Vestigo - The JDO/JPA Query Tool And Browser - http://vestigo.nightlabs.com
 * Copyright © 2011-2012 NightLabs Consulting GmbH. All rights reserved.
 *
 * This program and all its libraries in the namespace "*.nightlabs.vestigo.*"
 * are proprietary software. Their source codes are trade secrets and therefore
 * must be kept confidential.
 *
 * The use of this software is subject to licence terms.
 *
 * Please see LICENCE.txt or
 * http://vestigo.nightlabs.com/latest-stable/about/licence.html for
 * more details.
 *
 * For further information, please contact NightLabs Consulting GmbH:
 * http://nightlabs.com
 */
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
