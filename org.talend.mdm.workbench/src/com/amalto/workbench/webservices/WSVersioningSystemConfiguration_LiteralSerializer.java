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

public class WSVersioningSystemConfiguration_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_name_QNAME = new QName("", "name");
    private static final QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    private static final QName ns1_description_QNAME = new QName("", "description");
    private static final QName ns1_url_QNAME = new QName("", "url");
    private static final QName ns1_username_QNAME = new QName("", "username");
    private static final QName ns1_password_QNAME = new QName("", "password");
    private static final QName ns1_autocommit_QNAME = new QName("", "autocommit");
    private static final QName ns1_jndi_QNAME = new QName("", "jndi");
    
    public WSVersioningSystemConfiguration_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSVersioningSystemConfiguration_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns3_string_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSVersioningSystemConfiguration instance = new com.amalto.workbench.webservices.WSVersioningSystemConfiguration();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        while (reader.getState() == XMLReader.START) {
            elementName = reader.getName();
            if (elementName.equals(ns1_name_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_name_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setName((java.lang.String)member);
                reader.nextElementContent();
            }
            else if (elementName.equals(ns1_description_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_description_QNAME, reader, context);
                instance.setDescription((java.lang.String)member);
                reader.nextElementContent();
            }
            else if (elementName.equals(ns1_url_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_url_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setUrl((java.lang.String)member);
                reader.nextElementContent();
            }
            else if (elementName.equals(ns1_username_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_username_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setUsername((java.lang.String)member);
                reader.nextElementContent();
            }
            else if (elementName.equals(ns1_password_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_password_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setPassword((java.lang.String)member);
                reader.nextElementContent();
            }
            else if (elementName.equals(ns1_autocommit_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_autocommit_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setAutocommit((java.lang.String)member);
                reader.nextElementContent();
            }
            else if (elementName.equals(ns1_jndi_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_jndi_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setJndi((java.lang.String)member);
                reader.nextElementContent();
            }
            else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { elementName, reader.getName()});
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSVersioningSystemConfiguration instance = (com.amalto.workbench.webservices.WSVersioningSystemConfiguration)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSVersioningSystemConfiguration instance = (com.amalto.workbench.webservices.WSVersioningSystemConfiguration)obj;
        
        if (instance.getName() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getName(), ns1_name_QNAME, null, writer, context);
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getDescription(), ns1_description_QNAME, null, writer, context);
        if (instance.getUrl() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getUrl(), ns1_url_QNAME, null, writer, context);
        if (instance.getUsername() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getUsername(), ns1_username_QNAME, null, writer, context);
        if (instance.getPassword() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getPassword(), ns1_password_QNAME, null, writer, context);
        if (instance.getAutocommit() != null) {
            ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getAutocommit(), ns1_autocommit_QNAME, null, writer, context);
        }
        if (instance.getJndi() != null) {
            ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getJndi(), ns1_jndi_QNAME, null, writer, context);
        }
    }
}
