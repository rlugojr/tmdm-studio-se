// ============================================================================
//
// Copyright (C) 2006-2012 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.repository.core.migrate.impl;

import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.mdm.repository.core.IServerObjectRepositoryType;
import org.talend.mdm.repository.core.impl.view.IViewNodeConstDef;
import org.talend.mdm.repository.core.migrate.AbstractMigrateObjectPathRule;
import org.talend.mdm.repository.model.mdmproperties.MDMServerObjectItem;


/**
 * DOC HHB  class global comment. Detailled comment
 */
public class ViewMigrateObjectPathRule extends AbstractMigrateObjectPathRule {

    /* (non-Javadoc)
     * @see org.talend.mdm.repository.core.migrate.IMigrateObjectPathRule#getRepositoryObjectType()
     */
    public ERepositoryObjectType getRepositoryObjectType() {

        return IServerObjectRepositoryType.TYPE_VIEW;
    }

    String[] folderNames = new String[] { IViewNodeConstDef.PATH_WEBFILTER, IViewNodeConstDef.PATH_SEARCHFILTER };
    /* (non-Javadoc)
     * @see org.talend.mdm.repository.core.migrate.IMigrateObjectPathRule#getAllNewFolderNames()
     */
    public String[] getAllNewFolderNames() {

        return folderNames;
    }



    /* (non-Javadoc)
     * @see org.talend.mdm.repository.core.migrate.IMigrateObjectPathRule#routeObject(org.talend.core.model.repository.IRepositoryViewObject)
     */
    public String routeObject(IRepositoryViewObject viewObj) {
        Item item = viewObj.getProperty().getItem();
        if (item instanceof MDMServerObjectItem) {
            String name = ((MDMServerObjectItem) item).getMDMServerObject().getName().toLowerCase();
            if (name != null) {
                if (name.startsWith(IViewNodeConstDef.ViewPrefix)) {
                    return IViewNodeConstDef.PATH_WEBFILTER;
                } else {
                    return IViewNodeConstDef.PATH_SEARCHFILTER;
                }
            }
        }
        return null;
    }



}
