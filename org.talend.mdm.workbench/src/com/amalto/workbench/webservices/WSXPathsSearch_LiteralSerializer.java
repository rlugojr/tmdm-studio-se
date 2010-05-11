// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation （1.1.2_01，编译版 R40）
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.xsd.XSDConstants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;

public class WSXPathsSearch_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_wsDataClusterPK_QNAME = new QName("", "wsDataClusterPK");
    private static final QName ns2_WSDataClusterPK_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSDataClusterPK");
    private CombinedSerializer ns2_myWSDataClusterPK_LiteralSerializer;
    private static final QName ns1_pivotPath_QNAME = new QName("", "pivotPath");
    private static final QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final QName ns1_viewablePaths_QNAME = new QName("", "viewablePaths");
    private static final QName ns2_WSStringArray_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSStringArray");
    private CombinedSerializer ns2_myWSStringArray_LiteralSerializer;
    private static final QName ns1_whereItem_QNAME = new QName("", "whereItem");
    private static final QName ns2_WSWhereItem_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSWhereItem");
    private CombinedSerializer ns2_myWSWhereItem_LiteralSerializer;
    private static final QName ns1_spellTreshold_QNAME = new QName("", "spellTreshold");
    private static final QName ns3_int_TYPE_QNAME = SchemaConstants.QNAME_TYPE_INT;
    private CombinedSerializer ns3_myns3__int__int_Int_Serializer;
    private static final QName ns1_skip_QNAME = new QName("", "skip");
    private static final QName ns1_maxItems_QNAME = new QName("", "maxItems");
    private static final QName ns1_orderBy_QNAME = new QName("", "orderBy");
    private static final QName ns1_direction_QNAME = new QName("", "direction");
    
    public WSXPathsSearch_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSXPathsSearch_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myWSDataClusterPK_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSDataClusterPK.class, ns2_WSDataClusterPK_TYPE_QNAME);
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns3_string_TYPE_QNAME);
        ns2_myWSStringArray_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSStringArray.class, ns2_WSStringArray_TYPE_QNAME);
        ns2_myWSWhereItem_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSWhereItem.class, ns2_WSWhereItem_TYPE_QNAME);
        ns3_myns3__int__int_Int_Serializer = (CombinedSerializer)registry.getSerializer("", int.class, ns3_int_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSXPathsSearch instance = new com.amalto.workbench.webservices.WSXPathsSearch();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_wsDataClusterPK_QNAME)) {
                member = ns2_myWSDataClusterPK_LiteralSerializer.deserialize(ns1_wsDataClusterPK_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setWsDataClusterPK((com.amalto.workbench.webservices.WSDataClusterPK)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_wsDataClusterPK_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_pivotPath_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_pivotPath_QNAME, reader, context);
                instance.setPivotPath((java.lang.String)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_pivotPath_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_viewablePaths_QNAME)) {
                member = ns2_myWSStringArray_LiteralSerializer.deserialize(ns1_viewablePaths_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setViewablePaths((com.amalto.workbench.webservices.WSStringArray)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_viewablePaths_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_whereItem_QNAME)) {
                member = ns2_myWSWhereItem_LiteralSerializer.deserialize(ns1_whereItem_QNAME, reader, context);
                instance.setWhereItem((com.amalto.workbench.webservices.WSWhereItem)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_whereItem_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_spellTreshold_QNAME)) {
                member = ns3_myns3__int__int_Int_Serializer.deserialize(ns1_spellTreshold_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setSpellTreshold(((Integer)member).intValue());
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_spellTreshold_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_skip_QNAME)) {
                member = ns3_myns3__int__int_Int_Serializer.deserialize(ns1_skip_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setSkip(((Integer)member).intValue());
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_skip_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_maxItems_QNAME)) {
                member = ns3_myns3__int__int_Int_Serializer.deserialize(ns1_maxItems_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setMaxItems(((Integer)member).intValue());
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_maxItems_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_orderBy_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_orderBy_QNAME, reader, context);
                instance.setOrderBy((java.lang.String)member);
                reader.nextElementContent();
            }
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_direction_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_direction_QNAME, reader, context);
                instance.setDirection((java.lang.String)member);
                reader.nextElementContent();
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSXPathsSearch instance = (com.amalto.workbench.webservices.WSXPathsSearch)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSXPathsSearch instance = (com.amalto.workbench.webservices.WSXPathsSearch)obj;
        
        if (instance.getWsDataClusterPK() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myWSDataClusterPK_LiteralSerializer.serialize(instance.getWsDataClusterPK(), ns1_wsDataClusterPK_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getPivotPath(), ns1_pivotPath_QNAME, null, writer, context);
        if (instance.getViewablePaths() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myWSStringArray_LiteralSerializer.serialize(instance.getViewablePaths(), ns1_viewablePaths_QNAME, null, writer, context);
        ns2_myWSWhereItem_LiteralSerializer.serialize(instance.getWhereItem(), ns1_whereItem_QNAME, null, writer, context);
        if (new Integer(instance.getSpellTreshold()) == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myns3__int__int_Int_Serializer.serialize(new Integer(instance.getSpellTreshold()), ns1_spellTreshold_QNAME, null, writer, context);
        if (new Integer(instance.getSkip()) == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myns3__int__int_Int_Serializer.serialize(new Integer(instance.getSkip()), ns1_skip_QNAME, null, writer, context);
        if (new Integer(instance.getMaxItems()) == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myns3__int__int_Int_Serializer.serialize(new Integer(instance.getMaxItems()), ns1_maxItems_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getOrderBy(), ns1_orderBy_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getDirection(), ns1_direction_QNAME, null, writer, context);
    }
}
