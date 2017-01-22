// ============================================================================
//
// Copyright (C) 2006-2016 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.repository.utils;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IResourceChangeListener;

/**
 * created by liusongbo on Jan 20, 2017
 *
 */
public class ResourceChangeListenerCacher {

    private List<IResourceChangeListener> resourceChangeListeners = new LinkedList<IResourceChangeListener>();

    private static ResourceChangeListenerCacher cacher = new ResourceChangeListenerCacher();

    private ResourceChangeListenerCacher() {
    }

    public static ResourceChangeListenerCacher getInstance() {
        return cacher;
    }

    public void addResourceChangeListener(IResourceChangeListener listener) {
        if (resourceChangeListeners == null) {
            resourceChangeListeners = new LinkedList<IResourceChangeListener>();
        }

        resourceChangeListeners.add(listener);
    }

    public boolean removeResourceChangeListener(IResourceChangeListener listener) {
        if (resourceChangeListeners != null) {
            return resourceChangeListeners.remove(listener);
        }

        return false;
    }

    public List<IResourceChangeListener> getResourceChangeListeners() {
        return resourceChangeListeners;
    }
}
