/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License, Version 1.0 only
 * (the "License").  You may not use this file except in compliance
 * with the License.
 *
 * You can obtain a copy of the license at license/ESCIDOC.LICENSE
 * or http://www.escidoc.de/license.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at license/ESCIDOC.LICENSE.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

/*
 * Copyright 2008 Fachinformationszentrum Karlsruhe Gesellschaft
 * fuer wissenschaftlich-technische Information mbH and Max-Planck-
 * Gesellschaft zur Foerderung der Wissenschaft e.V.  
 * All rights reserved.  Use is subject to license terms.
 */
package de.escidoc.sb.srw.stax.handler;


import de.escidoc.core.common.util.stax.StaxParser;
import de.escidoc.core.common.util.xml.stax.events.StartElement;
import de.escidoc.core.common.util.xml.stax.handler.DefaultHandler;

public class PermissionFilterHandler extends DefaultHandler {
    protected StaxParser parser;
    protected String permissionFilterQuery = null;
    private final String permissionFilterQueryPath = "/properties/name";

    /*
     * 
     */public PermissionFilterHandler(StaxParser parser) {
        this.parser = parser;

    }

    public String characters(String data, StartElement element) {
        String currentPath = parser.getCurPath();

        if (permissionFilterQueryPath.equals(currentPath)) {
            permissionFilterQuery = data;
        }
        return data;
    }

	/**
	 * @return the permissionFilterQuery
	 */
	public String getPermissionFilterQuery() {
		return permissionFilterQuery;
	}
    

}
