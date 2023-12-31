/**
 * CountriesPortServiceCallbackHandler.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.0 Built on : Aug 01,
 * 2021 (07:27:19 HST)
 */
package com.hexaware.amaze.soap.ws.client2.generated;

/**
 * CountriesPortServiceCallbackHandler Callback class, Users can extend this class and implement
 * their own receiveResult and receiveError methods.
 */
public abstract class CountriesPortServiceCallbackHandler {

  protected Object clientData;

  /**
   * User can pass in any object that needs to be accessed once the NonBlocking Web service call is
   * finished and appropriate method of this CallBack is called.
   *
   * @param clientData Object mechanism by which the user can pass in user data that will be
   *     avilable at the time this callback is called.
   */
  public CountriesPortServiceCallbackHandler(Object clientData) {
    this.clientData = clientData;
  }

  /** Please use this constructor if you don't want to set any clientData */
  public CountriesPortServiceCallbackHandler() {
    this.clientData = null;
  }

  /** Get the client data */
  public Object getClientData() {
    return clientData;
  }

  /**
   * auto generated Axis2 call back method for getCountry method override this method for handling
   * normal response from getCountry operation
   */
  public void receiveResultgetCountry(
      com.hexaware.www.springsoap.gen.GetCountryResponseDocument result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * getCountry operation
   */
  public void receiveErrorgetCountry(java.lang.Exception e) {}
}
