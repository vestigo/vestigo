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
package org.nightlabs.vestigo.childvm.shared.dto;

import java.io.Serializable;

import org.nightlabs.vestigo.childvm.shared.ResultSetID;

/**
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 */
public class ResultSetDTO
implements Serializable
{
	private static final long serialVersionUID = 1L;

	public ResultSetDTO() { }

	public ResultSetDTO(ResultSetID resultSetID) {
		this.resultSetID = resultSetID;
	}

	private ResultSetID resultSetID;

	public ResultSetID getResultSetID() {
		return resultSetID;
	}
	public void setResultSetID(ResultSetID resultSetID) {
		this.resultSetID = resultSetID;
	}
}
