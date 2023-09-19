/*
 * XML Type:  country
 * Namespace: http://www.hexaware.com/springsoap/gen
 * Java type: com.hexaware.www.springsoap.gen.Country
 *
 * Automatically generated - do not modify.
 */
package com.hexaware.www.springsoap.gen;


/**
 * An XML country(@http://www.hexaware.com/springsoap/gen).
 *
 * This is a complex type.
 */
public interface Country extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Country.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA6A7634DFC0CA3E3EB52D40215369710").resolveHandle("countrya83ctype");
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "population" element
     */
    int getPopulation();
    
    /**
     * Gets (as xml) the "population" element
     */
    org.apache.xmlbeans.XmlInt xgetPopulation();
    
    /**
     * Sets the "population" element
     */
    void setPopulation(int population);
    
    /**
     * Sets (as xml) the "population" element
     */
    void xsetPopulation(org.apache.xmlbeans.XmlInt population);
    
    /**
     * Gets the "capital" element
     */
    java.lang.String getCapital();
    
    /**
     * Gets (as xml) the "capital" element
     */
    org.apache.xmlbeans.XmlString xgetCapital();
    
    /**
     * Sets the "capital" element
     */
    void setCapital(java.lang.String capital);
    
    /**
     * Sets (as xml) the "capital" element
     */
    void xsetCapital(org.apache.xmlbeans.XmlString capital);
    
    /**
     * Gets the "currency" element
     */
    com.hexaware.www.springsoap.gen.Currency.Enum getCurrency();
    
    /**
     * Gets (as xml) the "currency" element
     */
    com.hexaware.www.springsoap.gen.Currency xgetCurrency();
    
    /**
     * Sets the "currency" element
     */
    void setCurrency(com.hexaware.www.springsoap.gen.Currency.Enum currency);
    
    /**
     * Sets (as xml) the "currency" element
     */
    void xsetCurrency(com.hexaware.www.springsoap.gen.Currency currency);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.hexaware.www.springsoap.gen.Country newInstance() {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.hexaware.www.springsoap.gen.Country newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.hexaware.www.springsoap.gen.Country parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.hexaware.www.springsoap.gen.Country parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.hexaware.www.springsoap.gen.Country parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.hexaware.www.springsoap.gen.Country parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.hexaware.www.springsoap.gen.Country parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.hexaware.www.springsoap.gen.Country parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.hexaware.www.springsoap.gen.Country parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.hexaware.www.springsoap.gen.Country parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.hexaware.www.springsoap.gen.Country parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.hexaware.www.springsoap.gen.Country parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.hexaware.www.springsoap.gen.Country parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.hexaware.www.springsoap.gen.Country parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.hexaware.www.springsoap.gen.Country parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.hexaware.www.springsoap.gen.Country parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.hexaware.www.springsoap.gen.Country parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.hexaware.www.springsoap.gen.Country parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.hexaware.www.springsoap.gen.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
