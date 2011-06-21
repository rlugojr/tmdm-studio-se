/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.mdm.repository.model.mdmproperties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.talend.core.model.properties.PropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.mdm.repository.model.mdmproperties.MdmpropertiesFactory
 * @model kind="package"
 * @generated
 */
public interface MdmpropertiesPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "mdmproperties";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://www.talend.org/mdmproperties";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "mdmproperties";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	MdmpropertiesPackage eINSTANCE = org.talend.mdm.repository.model.mdmproperties.impl.MdmpropertiesPackageImpl.init();

	/**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmproperties.impl.MDMItemImpl <em>MDM Item</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmproperties.impl.MDMItemImpl
     * @see org.talend.mdm.repository.model.mdmproperties.impl.MdmpropertiesPackageImpl#getMDMItem()
     * @generated
     */
	int MDM_ITEM = 0;

	/**
     * The feature id for the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MDM_ITEM__PROPERTY = PropertiesPackage.ITEM__PROPERTY;

	/**
     * The feature id for the '<em><b>State</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MDM_ITEM__STATE = PropertiesPackage.ITEM__STATE;

	/**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MDM_ITEM__PARENT = PropertiesPackage.ITEM__PARENT;

	/**
     * The number of structural features of the '<em>MDM Item</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MDM_ITEM_FEATURE_COUNT = PropertiesPackage.ITEM_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmproperties.impl.MDMServerDefItemImpl <em>MDM Server Def Item</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmproperties.impl.MDMServerDefItemImpl
     * @see org.talend.mdm.repository.model.mdmproperties.impl.MdmpropertiesPackageImpl#getMDMServerDefItem()
     * @generated
     */
	int MDM_SERVER_DEF_ITEM = 1;

	/**
     * The feature id for the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MDM_SERVER_DEF_ITEM__PROPERTY = MDM_ITEM__PROPERTY;

	/**
     * The feature id for the '<em><b>State</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MDM_SERVER_DEF_ITEM__STATE = MDM_ITEM__STATE;

	/**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MDM_SERVER_DEF_ITEM__PARENT = MDM_ITEM__PARENT;

	/**
     * The feature id for the '<em><b>Server Def</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MDM_SERVER_DEF_ITEM__SERVER_DEF = MDM_ITEM_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>MDM Server Def Item</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MDM_SERVER_DEF_ITEM_FEATURE_COUNT = MDM_ITEM_FEATURE_COUNT + 1;


	/**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmproperties.impl.MDMServerObjectItemImpl <em>MDM Server Object Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmproperties.impl.MDMServerObjectItemImpl
     * @see org.talend.mdm.repository.model.mdmproperties.impl.MdmpropertiesPackageImpl#getMDMServerObjectItem()
     * @generated
     */
    int MDM_SERVER_OBJECT_ITEM = 2;

    /**
     * The feature id for the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_SERVER_OBJECT_ITEM__PROPERTY = MDM_ITEM__PROPERTY;

    /**
     * The feature id for the '<em><b>State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_SERVER_OBJECT_ITEM__STATE = MDM_ITEM__STATE;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_SERVER_OBJECT_ITEM__PARENT = MDM_ITEM__PARENT;

    /**
     * The number of structural features of the '<em>MDM Server Object Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MDM_SERVER_OBJECT_ITEM_FEATURE_COUNT = MDM_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmproperties.impl.WSMenuItemImpl <em>WS Menu Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmproperties.impl.WSMenuItemImpl
     * @see org.talend.mdm.repository.model.mdmproperties.impl.MdmpropertiesPackageImpl#getWSMenuItem()
     * @generated
     */
    int WS_MENU_ITEM = 3;

    /**
     * The feature id for the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_ITEM__PROPERTY = MDM_SERVER_OBJECT_ITEM__PROPERTY;

    /**
     * The feature id for the '<em><b>State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_ITEM__STATE = MDM_SERVER_OBJECT_ITEM__STATE;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_ITEM__PARENT = MDM_SERVER_OBJECT_ITEM__PARENT;

    /**
     * The feature id for the '<em><b>Ws Menu</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_ITEM__WS_MENU = MDM_SERVER_OBJECT_ITEM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>WS Menu Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_MENU_ITEM_FEATURE_COUNT = MDM_SERVER_OBJECT_ITEM_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.mdm.repository.model.mdmproperties.impl.WSRoleItemImpl <em>WS Role Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.mdm.repository.model.mdmproperties.impl.WSRoleItemImpl
     * @see org.talend.mdm.repository.model.mdmproperties.impl.MdmpropertiesPackageImpl#getWSRoleItem()
     * @generated
     */
    int WS_ROLE_ITEM = 4;

    /**
     * The feature id for the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_ITEM__PROPERTY = MDM_SERVER_OBJECT_ITEM__PROPERTY;

    /**
     * The feature id for the '<em><b>State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_ITEM__STATE = MDM_SERVER_OBJECT_ITEM__STATE;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_ITEM__PARENT = MDM_SERVER_OBJECT_ITEM__PARENT;

    /**
     * The feature id for the '<em><b>Ws Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_ITEM__WS_ROLE = MDM_SERVER_OBJECT_ITEM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>WS Role Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WS_ROLE_ITEM_FEATURE_COUNT = MDM_SERVER_OBJECT_ITEM_FEATURE_COUNT + 1;


    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmproperties.MDMItem <em>MDM Item</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>MDM Item</em>'.
     * @see org.talend.mdm.repository.model.mdmproperties.MDMItem
     * @generated
     */
	EClass getMDMItem();

	/**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmproperties.MDMServerDefItem <em>MDM Server Def Item</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>MDM Server Def Item</em>'.
     * @see org.talend.mdm.repository.model.mdmproperties.MDMServerDefItem
     * @generated
     */
	EClass getMDMServerDefItem();

	/**
     * Returns the meta object for the reference '{@link org.talend.mdm.repository.model.mdmproperties.MDMServerDefItem#getServerDef <em>Server Def</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Server Def</em>'.
     * @see org.talend.mdm.repository.model.mdmproperties.MDMServerDefItem#getServerDef()
     * @see #getMDMServerDefItem()
     * @generated
     */
	EReference getMDMServerDefItem_ServerDef();

	/**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmproperties.MDMServerObjectItem <em>MDM Server Object Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>MDM Server Object Item</em>'.
     * @see org.talend.mdm.repository.model.mdmproperties.MDMServerObjectItem
     * @generated
     */
    EClass getMDMServerObjectItem();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmproperties.WSMenuItem <em>WS Menu Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Menu Item</em>'.
     * @see org.talend.mdm.repository.model.mdmproperties.WSMenuItem
     * @generated
     */
    EClass getWSMenuItem();

    /**
     * Returns the meta object for the reference '{@link org.talend.mdm.repository.model.mdmproperties.WSMenuItem#getWsMenu <em>Ws Menu</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Ws Menu</em>'.
     * @see org.talend.mdm.repository.model.mdmproperties.WSMenuItem#getWsMenu()
     * @see #getWSMenuItem()
     * @generated
     */
    EReference getWSMenuItem_WsMenu();

    /**
     * Returns the meta object for class '{@link org.talend.mdm.repository.model.mdmproperties.WSRoleItem <em>WS Role Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>WS Role Item</em>'.
     * @see org.talend.mdm.repository.model.mdmproperties.WSRoleItem
     * @generated
     */
    EClass getWSRoleItem();

    /**
     * Returns the meta object for the reference '{@link org.talend.mdm.repository.model.mdmproperties.WSRoleItem#getWsRole <em>Ws Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Ws Role</em>'.
     * @see org.talend.mdm.repository.model.mdmproperties.WSRoleItem#getWsRole()
     * @see #getWSRoleItem()
     * @generated
     */
    EReference getWSRoleItem_WsRole();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	MdmpropertiesFactory getMdmpropertiesFactory();

	/**
     * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmproperties.impl.MDMItemImpl <em>MDM Item</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmproperties.impl.MDMItemImpl
         * @see org.talend.mdm.repository.model.mdmproperties.impl.MdmpropertiesPackageImpl#getMDMItem()
         * @generated
         */
		EClass MDM_ITEM = eINSTANCE.getMDMItem();

		/**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmproperties.impl.MDMServerDefItemImpl <em>MDM Server Def Item</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmproperties.impl.MDMServerDefItemImpl
         * @see org.talend.mdm.repository.model.mdmproperties.impl.MdmpropertiesPackageImpl#getMDMServerDefItem()
         * @generated
         */
		EClass MDM_SERVER_DEF_ITEM = eINSTANCE.getMDMServerDefItem();

		/**
         * The meta object literal for the '<em><b>Server Def</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MDM_SERVER_DEF_ITEM__SERVER_DEF = eINSTANCE.getMDMServerDefItem_ServerDef();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmproperties.impl.MDMServerObjectItemImpl <em>MDM Server Object Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmproperties.impl.MDMServerObjectItemImpl
         * @see org.talend.mdm.repository.model.mdmproperties.impl.MdmpropertiesPackageImpl#getMDMServerObjectItem()
         * @generated
         */
        EClass MDM_SERVER_OBJECT_ITEM = eINSTANCE.getMDMServerObjectItem();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmproperties.impl.WSMenuItemImpl <em>WS Menu Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmproperties.impl.WSMenuItemImpl
         * @see org.talend.mdm.repository.model.mdmproperties.impl.MdmpropertiesPackageImpl#getWSMenuItem()
         * @generated
         */
        EClass WS_MENU_ITEM = eINSTANCE.getWSMenuItem();

        /**
         * The meta object literal for the '<em><b>Ws Menu</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_MENU_ITEM__WS_MENU = eINSTANCE.getWSMenuItem_WsMenu();

        /**
         * The meta object literal for the '{@link org.talend.mdm.repository.model.mdmproperties.impl.WSRoleItemImpl <em>WS Role Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.mdm.repository.model.mdmproperties.impl.WSRoleItemImpl
         * @see org.talend.mdm.repository.model.mdmproperties.impl.MdmpropertiesPackageImpl#getWSRoleItem()
         * @generated
         */
        EClass WS_ROLE_ITEM = eINSTANCE.getWSRoleItem();

        /**
         * The meta object literal for the '<em><b>Ws Role</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WS_ROLE_ITEM__WS_ROLE = eINSTANCE.getWSRoleItem_WsRole();

	}

} //MdmpropertiesPackage
