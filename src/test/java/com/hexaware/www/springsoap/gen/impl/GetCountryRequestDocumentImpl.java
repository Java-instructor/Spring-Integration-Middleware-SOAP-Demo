/*
 * An XML document type.
 * Localname: getCountryRequest
 * Namespace: http://www.hexaware.com/springsoap/gen
 * Java type: com.hexaware.www.springsoap.gen.GetCountryRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.hexaware.www.springsoap.gen.impl;
/**
 * A document containing one getCountryRequest(@http://www.hexaware.com/springsoap/gen) element.
 *
 * This is a complex type.
 */
public class GetCountryRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.hexaware.www.springsoap.gen.GetCountryRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCountryRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCOUNTRYREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.hexaware.com/springsoap/gen", "getCountryRequest");
    
    
    /**
     * Gets the "getCountryRequest" element
     */
    public com.hexaware.www.springsoap.gen.GetCountryRequestDocument.GetCountryRequest getGetCountryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hexaware.www.springsoap.gen.GetCountryRequestDocument.GetCountryRequest target = null;
            target = (com.hexaware.www.springsoap.gen.GetCountryRequestDocument.GetCountryRequest)get_store().find_element_user(GETCOUNTRYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCountryRequest" element
     */
    public void setGetCountryRequest(com.hexaware.www.springsoap.gen.GetCountryRequestDocument.GetCountryRequest getCountryRequest)
    {
        generatedSetterHelperImpl(getCountryRequest, GETCOUNTRYREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCountryRequest" element
     */
    public com.hexaware.www.springsoap.gen.GetCountryRequestDocument.GetCountryRequest addNewGetCountryRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hexaware.www.springsoap.gen.GetCountryRequestDocument.GetCountryRequest target = null;
            target = (com.hexaware.www.springsoap.gen.GetCountryRequestDocument.GetCountryRequest)get_store().add_element_user(GETCOUNTRYREQUEST$0);
            return target;
        }
    }
    /**
     * An XML getCountryRequest(@http://www.hexaware.com/springsoap/gen).
     *
     * This is a complex type.
     */
    public static class GetCountryRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.hexaware.www.springsoap.gen.GetCountryRequestDocument.GetCountryRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetCountryRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.hexaware.com/springsoap/gen", "name");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
    }
}
