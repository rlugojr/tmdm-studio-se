// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation （1.1.2_01，编译版 R40）
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSItemPK {
    protected com.amalto.workbench.webservices.WSDataClusterPK wsDataClusterPK;
    protected java.lang.String conceptName;
    protected java.lang.String[] ids;
    
    public WSItemPK() {
    }
    
    public WSItemPK(com.amalto.workbench.webservices.WSDataClusterPK wsDataClusterPK, java.lang.String conceptName, java.lang.String[] ids) {
        this.wsDataClusterPK = wsDataClusterPK;
        this.conceptName = conceptName;
        this.ids = ids;
    }
    
    public com.amalto.workbench.webservices.WSDataClusterPK getWsDataClusterPK() {
        return wsDataClusterPK;
    }
    
    public void setWsDataClusterPK(com.amalto.workbench.webservices.WSDataClusterPK wsDataClusterPK) {
        this.wsDataClusterPK = wsDataClusterPK;
    }
    
    public java.lang.String getConceptName() {
        return conceptName;
    }
    
    public void setConceptName(java.lang.String conceptName) {
        this.conceptName = conceptName;
    }
    
    public java.lang.String[] getIds() {
        return ids;
    }
    
    public void setIds(java.lang.String[] ids) {
        this.ids = ids;
    }
}
