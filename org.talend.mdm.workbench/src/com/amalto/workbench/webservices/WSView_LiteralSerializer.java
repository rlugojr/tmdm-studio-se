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

public class WSView_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_name_QNAME = new QName("", "name");
    private static final QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final QName ns1_description_QNAME = new QName("", "description");
    private static final QName ns1_viewableBusinessElements_QNAME = new QName("", "viewableBusinessElements");
    private static final QName ns1_whereConditions_QNAME = new QName("", "whereConditions");
    private static final QName ns2_WSWhereCondition_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSWhereCondition");
    private CombinedSerializer ns2_myWSWhereCondition_LiteralSerializer;
    private static final QName ns1_searchableBusinessElements_QNAME = new QName("", "searchableBusinessElements");
    
    public WSView_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSView_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns3_string_TYPE_QNAME);
        ns2_myWSWhereCondition_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSWhereCondition.class, ns2_WSWhereCondition_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSView instance = new com.amalto.workbench.webservices.WSView();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_name_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_name_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setName((java.lang.String)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_name_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_description_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_description_QNAME, reader, context);
                instance.setDescription((java.lang.String)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_description_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_viewableBusinessElements_QNAME))) {
            values = new ArrayList();
            for(;;) {
                elementName = reader.getName();
                if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_viewableBusinessElements_QNAME))) {
                    value = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_viewableBusinessElements_QNAME, reader, context);
                    if (value == null) {
                        throw new DeserializationException("literal.unexpectedNull");
                    }
                    values.add(value);
                    reader.nextElementContent();
                } else {
                    break;
                }
            }
            member = new java.lang.String[values.size()];
            member = values.toArray((Object[]) member);
            instance.setViewableBusinessElements((java.lang.String[])member);
        }
        else if(!(reader.getState() == XMLReader.END)) {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_whereConditions_QNAME))) {
            values = new ArrayList();
            for(;;) {
                elementName = reader.getName();
                if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_whereConditions_QNAME))) {
                    value = ns2_myWSWhereCondition_LiteralSerializer.deserialize(ns1_whereConditions_QNAME, reader, context);
                    values.add(value);
                    reader.nextElementContent();
                } else {
                    break;
                }
            }
            member = new com.amalto.workbench.webservices.WSWhereCondition[values.size()];
            member = values.toArray((Object[]) member);
            instance.setWhereConditions((com.amalto.workbench.webservices.WSWhereCondition[])member);
        }
        else {
            instance.setWhereConditions(new com.amalto.workbench.webservices.WSWhereCondition[0]);
        }
        elementName = reader.getName();
        if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_searchableBusinessElements_QNAME))) {
            values = new ArrayList();
            for(;;) {
                elementName = reader.getName();
                if ((reader.getState() == XMLReader.START) && (elementName.equals(ns1_searchableBusinessElements_QNAME))) {
                    value = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_searchableBusinessElements_QNAME, reader, context);
                    if (value == null) {
                        throw new DeserializationException("literal.unexpectedNull");
                    }
                    values.add(value);
                    reader.nextElementContent();
                } else {
                    break;
                }
            }
            member = new java.lang.String[values.size()];
            member = values.toArray((Object[]) member);
            instance.setSearchableBusinessElements((java.lang.String[])member);
        }
        else if(!(reader.getState() == XMLReader.END)) {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSView instance = (com.amalto.workbench.webservices.WSView)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSView instance = (com.amalto.workbench.webservices.WSView)obj;
        
        if (instance.getName() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getName(), ns1_name_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getDescription(), ns1_description_QNAME, null, writer, context);
        if (instance.getViewableBusinessElements() != null) {
            for (int i = 0; i < instance.getViewableBusinessElements().length; ++i) {
                ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getViewableBusinessElements()[i], ns1_viewableBusinessElements_QNAME, null, writer, context);
            }
        }
        if (instance.getWhereConditions() != null) {
            for (int i = 0; i < instance.getWhereConditions().length; ++i) {
                ns2_myWSWhereCondition_LiteralSerializer.serialize(instance.getWhereConditions()[i], ns1_whereConditions_QNAME, null, writer, context);
            }
        }
        if (instance.getSearchableBusinessElements() != null) {
            for (int i = 0; i < instance.getSearchableBusinessElements().length; ++i) {
                ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getSearchableBusinessElements()[i], ns1_searchableBusinessElements_QNAME, null, writer, context);
            }
        }
    }
}
