/*
 * An XML document type.
 * Localname: getCountryResponse
 * Namespace: http://www.hexaware.com/springsoap/gen
 * Java type: com.hexaware.www.springsoap.gen.GetCountryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.hexaware.www.springsoap.gen.impl;
/**
 * A document containing one getCountryResponse(@http://www.hexaware.com/springsoap/gen) element.
 *
 * This is a complex type.
 */
public class GetCountryResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.hexaware.www.springsoap.gen.GetCountryResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCountryResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCOUNTRYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.hexaware.com/springsoap/gen", "getCountryResponse");
    
    
    /**
     * Gets the "getCountryResponse" element
     */
    public com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse getGetCountryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse target = null;
            target = (com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse)get_store().find_element_user(GETCOUNTRYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCountryResponse" element
     */
    public void setGetCountryResponse(com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse getCountryResponse)
    {
        generatedSetterHelperImpl(getCountryResponse, GETCOUNTRYRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCountryResponse" element
     */
    public com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse addNewGetCountryResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse target = null;
            target = (com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse)get_store().add_element_user(GETCOUNTRYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getCountryResponse(@http://www.hexaware.com/springsoap/gen).
     *
     * This is a complex type.
     */
    public static class GetCountryResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetCountryResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COUNTRY$0 = 
            new javax.xml.namespace.QName("http://www.hexaware.com/springsoap/gen", "country");
        
        
        /**
         * Gets the "country" element
         */
        public com.hexaware.www.springsoap.gen.Country getCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.hexaware.www.springsoap.gen.Country target = null;
                target = (com.hexaware.www.springsoap.gen.Country)get_store().find_element_user(COUNTRY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "country" element
         */
        public void setCountry(com.hexaware.www.springsoap.gen.Country country)
        {
            generatedSetterHelperImpl(country, COUNTRY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "country" element
         */
        public com.hexaware.www.springsoap.gen.Country addNewCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.hexaware.www.springsoap.gen.Country target = null;
                target = (com.hexaware.www.springsoap.gen.Country)get_store().add_element_user(COUNTRY$0);
                return target;
            }
        }
    }
}
