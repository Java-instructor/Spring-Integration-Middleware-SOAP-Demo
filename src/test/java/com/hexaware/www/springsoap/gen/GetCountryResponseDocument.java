/*
 * An XML document type.
 * Localname: getCountryResponse
 * Namespace: http://www.hexaware.com/springsoap/gen
 * Java type: com.hexaware.www.springsoap.gen.GetCountryResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.hexaware.www.springsoap.gen;


/**
 * A document containing one getCountryResponse(@http://www.hexaware.com/springsoap/gen) element.
 *
 * This is a complex type.
 */
public interface GetCountryResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCountryResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA6A7634DFC0CA3E3EB52D40215369710").resolveHandle("getcountryresponsef4afdoctype");
    
    /**
     * Gets the "getCountryResponse" element
     */
    com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse getGetCountryResponse();
    
    /**
     * Sets the "getCountryResponse" element
     */
    void setGetCountryResponse(com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse getCountryResponse);
    
    /**
     * Appends and returns a new empty "getCountryResponse" element
     */
    com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse addNewGetCountryResponse();
    
    /**
     * An XML getCountryResponse(@http://www.hexaware.com/springsoap/gen).
     *
     * This is a complex type.
     */
    public interface GetCountryResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCountryResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA6A7634DFC0CA3E3EB52D40215369710").resolveHandle("getcountryresponse018celemtype");
        
        /**
         * Gets the "country" element
         */
        com.hexaware.www.springsoap.gen.Country getCountry();
        
        /**
         * Sets the "country" element
         */
        void setCountry(com.hexaware.www.springsoap.gen.Country country);
        
        /**
         * Appends and returns a new empty "country" element
         */
        com.hexaware.www.springsoap.gen.Country addNewCountry();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse newInstance() {
              return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument.GetCountryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument newInstance() {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.hexaware.www.springsoap.gen.GetCountryResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.hexaware.www.springsoap.gen.GetCountryResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
