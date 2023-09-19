/*
 * XML Type:  country
 * Namespace: http://www.hexaware.com/springsoap/gen
 * Java type: com.hexaware.www.springsoap.gen.Country
 *
 * Automatically generated - do not modify.
 */
package com.hexaware.www.springsoap.gen.impl;
/**
 * An XML country(@http://www.hexaware.com/springsoap/gen).
 *
 * This is a complex type.
 */
public class CountryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.hexaware.www.springsoap.gen.Country
{
    private static final long serialVersionUID = 1L;
    
    public CountryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.hexaware.com/springsoap/gen", "name");
    private static final javax.xml.namespace.QName POPULATION$2 = 
        new javax.xml.namespace.QName("http://www.hexaware.com/springsoap/gen", "population");
    private static final javax.xml.namespace.QName CAPITAL$4 = 
        new javax.xml.namespace.QName("http://www.hexaware.com/springsoap/gen", "capital");
    private static final javax.xml.namespace.QName CURRENCY$6 = 
        new javax.xml.namespace.QName("http://www.hexaware.com/springsoap/gen", "currency");
    
    
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
    
    /**
     * Gets the "population" element
     */
    public int getPopulation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POPULATION$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "population" element
     */
    public org.apache.xmlbeans.XmlInt xgetPopulation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(POPULATION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "population" element
     */
    public void setPopulation(int population)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POPULATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POPULATION$2);
            }
            target.setIntValue(population);
        }
    }
    
    /**
     * Sets (as xml) the "population" element
     */
    public void xsetPopulation(org.apache.xmlbeans.XmlInt population)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(POPULATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(POPULATION$2);
            }
            target.set(population);
        }
    }
    
    /**
     * Gets the "capital" element
     */
    public java.lang.String getCapital()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPITAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "capital" element
     */
    public org.apache.xmlbeans.XmlString xgetCapital()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAPITAL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "capital" element
     */
    public void setCapital(java.lang.String capital)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPITAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPITAL$4);
            }
            target.setStringValue(capital);
        }
    }
    
    /**
     * Sets (as xml) the "capital" element
     */
    public void xsetCapital(org.apache.xmlbeans.XmlString capital)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAPITAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CAPITAL$4);
            }
            target.set(capital);
        }
    }
    
    /**
     * Gets the "currency" element
     */
    public com.hexaware.www.springsoap.gen.Currency.Enum getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.hexaware.www.springsoap.gen.Currency.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "currency" element
     */
    public com.hexaware.www.springsoap.gen.Currency xgetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hexaware.www.springsoap.gen.Currency target = null;
            target = (com.hexaware.www.springsoap.gen.Currency)get_store().find_element_user(CURRENCY$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "currency" element
     */
    public void setCurrency(com.hexaware.www.springsoap.gen.Currency.Enum currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$6);
            }
            target.setEnumValue(currency);
        }
    }
    
    /**
     * Sets (as xml) the "currency" element
     */
    public void xsetCurrency(com.hexaware.www.springsoap.gen.Currency currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.hexaware.www.springsoap.gen.Currency target = null;
            target = (com.hexaware.www.springsoap.gen.Currency)get_store().find_element_user(CURRENCY$6, 0);
            if (target == null)
            {
                target = (com.hexaware.www.springsoap.gen.Currency)get_store().add_element_user(CURRENCY$6);
            }
            target.set(currency);
        }
    }
}
