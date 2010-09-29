package org.talend.mdm.enterprise.test;

import java.rmi.RemoteException;

import urn_com_amalto_xtentis_webservice.WSBoolean;
import urn_com_amalto_xtentis_webservice.WSDataClusterPK;
import urn_com_amalto_xtentis_webservice.WSDeleteSynchronizationPlan;
import urn_com_amalto_xtentis_webservice.WSExistsSynchronizationPlan;
import urn_com_amalto_xtentis_webservice.WSGetSynchronizationPlan;
import urn_com_amalto_xtentis_webservice.WSGetSynchronizationPlanPKs;
import urn_com_amalto_xtentis_webservice.WSItemPK;
import urn_com_amalto_xtentis_webservice.WSPutSynchronizationPlan;
import urn_com_amalto_xtentis_webservice.WSString;
import urn_com_amalto_xtentis_webservice.WSSynchronizationGetItemXML;
import urn_com_amalto_xtentis_webservice.WSSynchronizationGetObjectXML;
import urn_com_amalto_xtentis_webservice.WSSynchronizationGetUnsynchronizedItemPKs;
import urn_com_amalto_xtentis_webservice.WSSynchronizationGetUnsynchronizedObjectsIDs;
import urn_com_amalto_xtentis_webservice.WSSynchronizationPlan;
import urn_com_amalto_xtentis_webservice.WSSynchronizationPlanAction;
import urn_com_amalto_xtentis_webservice.WSSynchronizationPlanActionCode;
import urn_com_amalto_xtentis_webservice.WSSynchronizationPlanPK;
import urn_com_amalto_xtentis_webservice.WSSynchronizationPlanStatus;
import urn_com_amalto_xtentis_webservice.WSSynchronizationPutItemXML;
import urn_com_amalto_xtentis_webservice.WSSynchronizationPutObjectXML;

public class SynchronizationPlanWebserviceTestCase extends WebserviceTestCase {

	public void testPutSynchronizationPlan() {
		try {
			WSPutSynchronizationPlan wsPutSynchronizationPlan = new WSPutSynchronizationPlan();
			WSSynchronizationPlan wsSynchronizationPlan=new WSSynchronizationPlan();
			wsSynchronizationPlan.setDescription("description");
			wsSynchronizationPlan.setName("name");
			wsSynchronizationPlan.setRemoteSystemName("remoteSystemName");
			wsSynchronizationPlan.setRemoteSystemPassword("remoteSystemPassword");
			wsSynchronizationPlan.setRemoteSystemURL("remoteSystemURL");
			wsPutSynchronizationPlan.setWsSynchronizationPlan(wsSynchronizationPlan);
			WSSynchronizationPlanPK wsSynchronizationPlanPK = defaultPort
					.putSynchronizationPlan(wsPutSynchronizationPlan);
			assertNotNull(wsSynchronizationPlanPK);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}
	public void testGetSynchronizationPlanPKs() {
		WSGetSynchronizationPlanPKs regex = new WSGetSynchronizationPlanPKs(
				".*");
		try {
			WSSynchronizationPlanPK[] wsSynchronizationPlanPKArray = defaultPort
					.getSynchronizationPlanPKs(regex);
			assertNotNull(wsSynchronizationPlanPKArray);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	public void testGetSynchronizationPlan() {
		try {
			WSGetSynchronizationPlan wsGetSynchronizationPlan = new WSGetSynchronizationPlan();
			WSGetSynchronizationPlanPKs regex = new WSGetSynchronizationPlanPKs(
					".*");
			WSSynchronizationPlanPK[] wsSynchronizationPlanPKArray = defaultPort
					.getSynchronizationPlanPKs(regex);
			wsGetSynchronizationPlan
					.setWsSynchronizationPlanPK(wsSynchronizationPlanPKArray[0]);
			WSSynchronizationPlan wsSynchronizationPlan = defaultPort
					.getSynchronizationPlan(wsGetSynchronizationPlan);
			assertNotNull(wsSynchronizationPlan);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	public void testExistsSynchronizationPlan() {
		try {
			WSExistsSynchronizationPlan wsExistsSynchronizationPlan = new WSExistsSynchronizationPlan();
			WSGetSynchronizationPlanPKs regex = new WSGetSynchronizationPlanPKs(
					".*");
			WSSynchronizationPlanPK[] wsSynchronizationPlanPKArray = defaultPort
					.getSynchronizationPlanPKs(regex);
			wsExistsSynchronizationPlan
					.setWsSynchronizationPlanPK(wsSynchronizationPlanPKArray[0]);
			WSBoolean wsBoolean = defaultPort
					.existsSynchronizationPlan(wsExistsSynchronizationPlan);
			assertTrue(wsBoolean.is_true());
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}



	public void testGetObjectsForSynchronizationPlans() {
		try {
			String[] strings = defaultPort
					.getObjectsForSynchronizationPlans(null);
			assertNotNull(strings);

		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	public void testGetSynchronizationPlanObjectsAlgorithms() {
		try {
			String[] strings = defaultPort
					.getSynchronizationPlanObjectsAlgorithms(null);
			assertNotNull(strings);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	public void testGetSynchronizationPlanItemsAlgorithms() {

		try {
			String[] strings = defaultPort
					.getSynchronizationPlanItemsAlgorithms(null);
			assertNotNull(strings);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	public void testSynchronizationPlanAction() {
		try {
			WSSynchronizationPlanAction wsSynchronizationPlanAction = new WSSynchronizationPlanAction();
			wsSynchronizationPlanAction
					.setWsAction(WSSynchronizationPlanActionCode.STATUS);
			WSGetSynchronizationPlanPKs regex = new WSGetSynchronizationPlanPKs(
					".*");
			WSSynchronizationPlanPK[] wsSynchronizationPlanPKArray = defaultPort
					.getSynchronizationPlanPKs(regex);

			wsSynchronizationPlanAction
					.setWsSynchronizationPlanPK(wsSynchronizationPlanPKArray[0]);
			WSSynchronizationPlanStatus wsSynchronizationPlanStatus = defaultPort
					.synchronizationPlanAction(wsSynchronizationPlanAction);
			assertNotNull(wsSynchronizationPlanStatus);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	public void testSynchronizationGetUnsynchronizedObjectsIDs() {
		try {
			WSSynchronizationGetUnsynchronizedObjectsIDs wsSynchronizationGetUnsynchronizedObjectsIDs = new WSSynchronizationGetUnsynchronizedObjectsIDs();
			wsSynchronizationGetUnsynchronizedObjectsIDs
					.setObjectName("Data Model");
			wsSynchronizationGetUnsynchronizedObjectsIDs
					.setInstancePattern(".*");
			WSGetSynchronizationPlan wsGetSynchronizationPlan = new WSGetSynchronizationPlan();
			WSGetSynchronizationPlanPKs regex = new WSGetSynchronizationPlanPKs(
					".*");
			WSSynchronizationPlanPK[] wsSynchronizationPlanPKArray = defaultPort
					.getSynchronizationPlanPKs(regex);
			wsGetSynchronizationPlan
					.setWsSynchronizationPlanPK(wsSynchronizationPlanPKArray[0]);
			WSSynchronizationPlan wsSynchronizationPlan = defaultPort
					.getSynchronizationPlan(wsGetSynchronizationPlan);

			wsSynchronizationGetUnsynchronizedObjectsIDs
					.setSynchronizationPlanName(wsSynchronizationPlan.getName());
			wsSynchronizationGetUnsynchronizedObjectsIDs.setRevisionID("r1");
			String[] strings = defaultPort
					.synchronizationGetUnsynchronizedObjectsIDs(wsSynchronizationGetUnsynchronizedObjectsIDs);
			assertNotNull(strings);

		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	public void testSynchronizationGetObjectXML() {
		WSSynchronizationGetObjectXML wsSynchronizationGetObjectXML = new WSSynchronizationGetObjectXML();
		wsSynchronizationGetObjectXML.setObjectName("Data Model");
		wsSynchronizationGetObjectXML.setRevisionID("r1");
		wsSynchronizationGetObjectXML.setUniqueID("Order");
		try {
			WSString str = defaultPort
					.synchronizationGetObjectXML(wsSynchronizationGetObjectXML);
			assertNotNull(str);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	public void testSynchronizationPutObjectXML() {
		try {
			WSSynchronizationPutObjectXML wsSynchronizationPutObjectXML = new WSSynchronizationPutObjectXML();
			wsSynchronizationPutObjectXML.setRevisionID("r1");
			wsSynchronizationPutObjectXML.setObjectName("Data Model");
			wsSynchronizationPutObjectXML.setUniqueID("Order");

			WSSynchronizationGetObjectXML wsSynchronizationGetObjectXML = new WSSynchronizationGetObjectXML();
			wsSynchronizationGetObjectXML.setObjectName("Data Model");
			wsSynchronizationGetObjectXML.setRevisionID("r1");
			wsSynchronizationGetObjectXML.setUniqueID("Order");

			WSString str = defaultPort
					.synchronizationGetObjectXML(wsSynchronizationGetObjectXML);
			wsSynchronizationPutObjectXML.setXml(str.getValue());
			WSString wsString = defaultPort
					.synchronizationPutObjectXML(wsSynchronizationPutObjectXML);
			assertNotNull(wsString);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public void testSynchronizationGetUnsynchronizedItemPKs() {
		try {
			WSSynchronizationGetUnsynchronizedItemPKs wsSynchronizationGetUnsynchronizedItemPKs = new WSSynchronizationGetUnsynchronizedItemPKs();
			wsSynchronizationGetUnsynchronizedItemPKs
					.setConceptName("Customer");
			wsSynchronizationGetUnsynchronizedItemPKs.setInstancePattern(".*");
			wsSynchronizationGetUnsynchronizedItemPKs.setLimit(1);
			wsSynchronizationGetUnsynchronizedItemPKs.setStart(0);
			wsSynchronizationGetUnsynchronizedItemPKs.setRevisionID("r1");
			WSGetSynchronizationPlanPKs regex = new WSGetSynchronizationPlanPKs(
					".*");
			WSGetSynchronizationPlan wsGetSynchronizationPlan = new WSGetSynchronizationPlan();
			WSSynchronizationPlanPK[] wsSynchronizationPlanPKArray = defaultPort
					.getSynchronizationPlanPKs(regex);
			wsGetSynchronizationPlan
					.setWsSynchronizationPlanPK(wsSynchronizationPlanPKArray[0]);
			WSSynchronizationPlan wsSynchronizationPlan = defaultPort
					.getSynchronizationPlan(wsGetSynchronizationPlan);
			wsSynchronizationGetUnsynchronizedItemPKs
					.setSynchronizationPlanName(wsSynchronizationPlan.getName());
			WSItemPK[] wsItemPKArray = defaultPort
					.synchronizationGetUnsynchronizedItemPKs(wsSynchronizationGetUnsynchronizedItemPKs);
			assertNotNull(wsItemPKArray);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	public void testSynchronizationGetItemXML() {
		WSSynchronizationGetItemXML wsSynchronizationGetItemXML = new WSSynchronizationGetItemXML();
		wsSynchronizationGetItemXML.setRevisionID("r1");
		WSItemPK wsItemPK = new WSItemPK();
		wsItemPK.setConceptName("Student");
		wsItemPK.setWsDataClusterPK(new WSDataClusterPK("Order"));
		String[] ids = { "001", "002" };
		wsItemPK.setIds(ids);
		wsSynchronizationGetItemXML.setWsItemPOJOPK(wsItemPK);
		try {
			WSString wsString = defaultPort
					.synchronizationGetItemXML(wsSynchronizationGetItemXML);
			assertNotNull(wsString);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	public void testSynchronizationPutItemXML() {
		WSSynchronizationPutItemXML wsSynchronizationPutItemXML = new WSSynchronizationPutItemXML();
		wsSynchronizationPutItemXML.setRevisionID("r1");
		WSSynchronizationGetObjectXML wsSynchronizationGetObjectXML = new WSSynchronizationGetObjectXML();
		wsSynchronizationGetObjectXML.setObjectName("Data Model");
		wsSynchronizationGetObjectXML.setRevisionID("r1");
		wsSynchronizationGetObjectXML.setUniqueID("Order");

		try {
			WSString xml = defaultPort
					.synchronizationGetObjectXML(wsSynchronizationGetObjectXML);
			wsSynchronizationPutItemXML.setXml(xml.getValue());
			WSItemPK wsItemPK = defaultPort
					.synchronizationPutItemXML(wsSynchronizationPutItemXML);
			assertNotNull(wsItemPK);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

	public void testDeleteSynchronizationPlan() {
		try {
			WSDeleteSynchronizationPlan wsSynchronizationPlanDelete = new WSDeleteSynchronizationPlan();
			WSGetSynchronizationPlanPKs regex = new WSGetSynchronizationPlanPKs(
					".*");

			WSSynchronizationPlanPK[] wsSynchronizationPlanPKArray = defaultPort
					.getSynchronizationPlanPKs(regex);

			wsSynchronizationPlanDelete
					.setWsSynchronizationPlanPK(wsSynchronizationPlanPKArray[0]);
			WSSynchronizationPlanPK wsSynchronizationPlanPK = defaultPort
					.deleteSynchronizationPlan(wsSynchronizationPlanDelete);
			assertNotNull(wsSynchronizationPlanPK);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}
}