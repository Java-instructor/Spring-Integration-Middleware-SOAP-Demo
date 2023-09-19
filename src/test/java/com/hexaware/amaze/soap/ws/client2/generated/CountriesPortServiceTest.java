/**
 * CountriesPortServiceTest.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.0 Built on : Aug 01,
 * 2021 (07:27:19 HST)
 */
package com.hexaware.amaze.soap.ws.client2.generated;

/*
 *  CountriesPortServiceTest Junit test case
 */

public class CountriesPortServiceTest extends junit.framework.TestCase {

  /** Auto generated test method */
  public void testgetCountry() throws java.lang.Exception {

    com.hexaware.amaze.soap.ws.client2.generated.CountriesPortServiceStub stub =
        new com.hexaware.amaze.soap.ws.client2.generated
            .CountriesPortServiceStub(); // the default implementation should point to the right
                                         // endpoint

    com.hexaware.www.springsoap.gen.GetCountryRequestDocument getCountryRequest4 =
        (com.hexaware.www.springsoap.gen.GetCountryRequestDocument)
            getTestObject(com.hexaware.www.springsoap.gen.GetCountryRequestDocument.class);
    // TODO : Fill in the getCountryRequest4 here

    assertNotNull(stub.getCountry(getCountryRequest4));
  }

  /** Auto generated test method */
  public void testStartgetCountry() throws java.lang.Exception {
    com.hexaware.amaze.soap.ws.client2.generated.CountriesPortServiceStub stub =
        new com.hexaware.amaze.soap.ws.client2.generated.CountriesPortServiceStub();
    com.hexaware.www.springsoap.gen.GetCountryRequestDocument getCountryRequest4 =
        (com.hexaware.www.springsoap.gen.GetCountryRequestDocument)
            getTestObject(com.hexaware.www.springsoap.gen.GetCountryRequestDocument.class);
    // TODO : Fill in the getCountryRequest4 here

    stub.startgetCountry(getCountryRequest4, new tempCallbackN65548());
  }

  private class tempCallbackN65548
      extends com.hexaware.amaze.soap.ws.client2.generated.CountriesPortServiceCallbackHandler {
    public tempCallbackN65548() {
      super(null);
    }

    public void receiveResultgetCountry(
        com.hexaware.www.springsoap.gen.GetCountryResponseDocument result) {}

    public void receiveErrorgetCountry(java.lang.Exception e) {
      fail();
    }
  }

  // Create the desired XmlObject and provide it as the test object
  public org.apache.xmlbeans.XmlObject getTestObject(java.lang.Class type)
      throws java.lang.Exception {
    java.lang.reflect.Method creatorMethod = null;
    if (org.apache.xmlbeans.XmlObject.class.isAssignableFrom(type)) {
      Class[] declaredClasses = type.getDeclaredClasses();
      for (int i = 0; i < declaredClasses.length; i++) {
        Class declaredClass = declaredClasses[i];
        if (declaredClass.getName().endsWith("$Factory")) {
          creatorMethod = declaredClass.getMethod("newInstance", null);
          break;
        }
      }
    }
    if (creatorMethod != null) {
      return (org.apache.xmlbeans.XmlObject) creatorMethod.invoke(null, null);
    } else {
      throw new java.lang.Exception("Creator not found!");
    }
  }
}
