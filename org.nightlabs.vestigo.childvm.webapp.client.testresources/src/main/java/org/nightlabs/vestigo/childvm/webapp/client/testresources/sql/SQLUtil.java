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
package org.nightlabs.vestigo.childvm.webapp.client.testresources.sql;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Statement;

public class SQLUtil {

	public static void execSQLScript(InputStream script, Connection conn) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(script));
		//Now read line bye line
		String thisLine, sqlQuery;
		try {
			Statement stmt = conn.createStatement();
			try {
				sqlQuery = "";
				while ((thisLine = reader.readLine()) != null)
				{
					thisLine.trim();
					//Skip comments and empty lines
					if(thisLine.length() > 0 && thisLine.charAt(0) == '-' || thisLine.length() == 0 )
						continue;
					sqlQuery = sqlQuery + " " + thisLine;
					//If one command complete
					if(sqlQuery.charAt(sqlQuery.length() - 1) == ';') {
						sqlQuery = sqlQuery.replace(';' , ' ');
						try {
							stmt.execute(sqlQuery);
						}
						catch(Exception ex) {
							throw new RuntimeException(ex);
						}
						sqlQuery = "";
					}
				}
			} finally {
				stmt.close();
			}
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

}
