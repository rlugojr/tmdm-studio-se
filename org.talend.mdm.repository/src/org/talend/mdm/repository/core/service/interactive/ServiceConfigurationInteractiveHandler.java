// ============================================================================
//
// Copyright (C) 2006-2011 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.repository.core.service.interactive;

import java.rmi.RemoteException;

import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.mdm.commmon.util.core.ICoreConstants;
import org.talend.mdm.repository.core.IServerObjectRepositoryType;
import org.w3c.dom.Node;

import com.amalto.workbench.utils.Util;
import com.amalto.workbench.webservices.WSPutVersioningSystemConfiguration;
import com.amalto.workbench.webservices.WSServiceConfiguration;
import com.amalto.workbench.webservices.WSServicePutConfiguration;
import com.amalto.workbench.webservices.WSVersioningSystemConfiguration;
import com.amalto.workbench.webservices.XtentisPort;

/**
 * DOC hbhong class global comment. Detailled comment
 */
public class ServiceConfigurationInteractiveHandler extends AbstractInteractiveHandler {

    public ERepositoryObjectType getRepositoryObjectType() {
        return IServerObjectRepositoryType.TYPE_SERVICECONFIGURATION;
    }

    public String getLabel() {

        return "Service Configuration";
    }

    public boolean deploy(XtentisPort port, Object wsObj) throws RemoteException {
        if (wsObj != null) {
            WSServiceConfiguration configurations = (WSServiceConfiguration) wsObj;
            for (WSServicePutConfiguration config : configurations.getServicePutConfigurations()) {
                config.setJndiName("amalto/local/service/" + config.getJndiName()); //$NON-NLS-1$
                port.putServiceConfiguration(config);
                if (config.getJndiName().equalsIgnoreCase("amalto/local/service/svn")) { //$NON-NLS-1$
                    WSPutVersioningSystemConfiguration svnConfig;
                    try {
                        svnConfig = getDefaultSvn(config.getConfiguration());
                        port.putVersioningSystemConfiguration(svnConfig);
                    } catch (Exception e) {
                        throw new RemoteException(e.getMessage(), e);
                    }

                }
            }
            return true;
        }
        return false;
    }

    private WSPutVersioningSystemConfiguration getDefaultSvn(String svnConfig) throws Exception {
        Node e = Util.parse(svnConfig).getDocumentElement();
        String jndi = "amalto/local/service/svn"; //$NON-NLS-1$

        String url = Util.getFirstTextNode(e, "./url");//$NON-NLS-1$
        String username = Util.getFirstTextNode(e, "./username");//$NON-NLS-1$
        String password = Util.getFirstTextNode(e, "./password");//$NON-NLS-1$
        String autocommit = Util.getFirstTextNode(e, "./autocommit");//$NON-NLS-1$
        WSPutVersioningSystemConfiguration conf = new WSPutVersioningSystemConfiguration(new WSVersioningSystemConfiguration(
                ICoreConstants.DEFAULT_SVN, ICoreConstants.DEFAULT_SVN, url, username, password, autocommit, jndi));
        return conf;
    }

}
