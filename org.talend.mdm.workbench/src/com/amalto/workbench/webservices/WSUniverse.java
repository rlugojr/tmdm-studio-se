// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation （1.1.2_01，编译版 R40）
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSUniverse {
    protected java.lang.String name;
    protected java.lang.String description;
    protected com.amalto.workbench.webservices.WSUniverseXtentisObjectsRevisionIDs[] xtentisObjectsRevisionIDs;
    protected java.lang.String defaultItemsRevisionID;
    protected com.amalto.workbench.webservices.WSUniverseItemsRevisionIDs[] itemsRevisionIDs;
    
    public WSUniverse() {
    }
    
    public WSUniverse(java.lang.String name, java.lang.String description, com.amalto.workbench.webservices.WSUniverseXtentisObjectsRevisionIDs[] xtentisObjectsRevisionIDs, java.lang.String defaultItemsRevisionID, com.amalto.workbench.webservices.WSUniverseItemsRevisionIDs[] itemsRevisionIDs) {
        this.name = name;
        this.description = description;
        this.xtentisObjectsRevisionIDs = xtentisObjectsRevisionIDs;
        this.defaultItemsRevisionID = defaultItemsRevisionID;
        this.itemsRevisionIDs = itemsRevisionIDs;
    }
    
    public java.lang.String getName() {
        return name;
    }
    
    public void setName(java.lang.String name) {
        this.name = name;
    }
    
    public java.lang.String getDescription() {
        return description;
    }
    
    public void setDescription(java.lang.String description) {
        this.description = description;
    }
    
    public com.amalto.workbench.webservices.WSUniverseXtentisObjectsRevisionIDs[] getXtentisObjectsRevisionIDs() {
        return xtentisObjectsRevisionIDs;
    }
    
    public void setXtentisObjectsRevisionIDs(com.amalto.workbench.webservices.WSUniverseXtentisObjectsRevisionIDs[] xtentisObjectsRevisionIDs) {
        this.xtentisObjectsRevisionIDs = xtentisObjectsRevisionIDs;
    }
    
    public java.lang.String getDefaultItemsRevisionID() {
        return defaultItemsRevisionID;
    }
    
    public void setDefaultItemsRevisionID(java.lang.String defaultItemsRevisionID) {
        this.defaultItemsRevisionID = defaultItemsRevisionID;
    }
    
    public com.amalto.workbench.webservices.WSUniverseItemsRevisionIDs[] getItemsRevisionIDs() {
        return itemsRevisionIDs;
    }
    
    public void setItemsRevisionIDs(com.amalto.workbench.webservices.WSUniverseItemsRevisionIDs[] itemsRevisionIDs) {
        this.itemsRevisionIDs = itemsRevisionIDs;
    }
}
