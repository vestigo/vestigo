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
package org.nightlabs.vestigo.maven.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.nightlabs.vestigo.maven.core.AbstractMavenErrorHandler;

public class DialogMavenErrorHandler extends AbstractMavenErrorHandler {

	@Override
	public void handle() {
		Display d = Display.getCurrent();
		if (d == null)
			d = Display.getDefault();

		final Display display = d;
		display.syncExec(new Runnable() {
			@Override
			public void run() {
				Shell parentShell = null;

				if (parentShell == null)
					parentShell = display.getActiveShell();

				if (parentShell == null && PlatformUI.getWorkbench() != null && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null)
					parentShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

				String message1 = getErrorMessage();
				String message2 = null;
				int lineBreakPos = message1.indexOf('\n');
				if (lineBreakPos >= 0) {
					message2 = message1.substring(lineBreakPos + 1).trim();
					message1 = message1.substring(0, lineBreakPos).trim();
				}

				new MavenErrorDialog(parentShell, "Running Maven failed", message1, message2, getMavenOutput()).open();
			}
		});
	}

}
