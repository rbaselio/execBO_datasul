
/**
 * WebServiceExecBOCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */

    package br.com.execBO.service.entities;

    /**
     *  WebServiceExecBOCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WebServiceExecBOCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WebServiceExecBOCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WebServiceExecBOCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for callProcedureWithCompany method
            * override this method for handling normal response from callProcedureWithCompany operation
            */
           public void receiveResultcallProcedureWithCompany(
                    br.com.execBO.service.entities.CallProcedureWithCompanyResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from callProcedureWithCompany operation
           */
            public void receiveErrorcallProcedureWithCompany(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for login method
            * override this method for handling normal response from login operation
            */
           public void receiveResultlogin(
                    br.com.execBO.service.entities.LoginResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from login operation
           */
            public void receiveErrorlogin(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for logoutSession method
            * override this method for handling normal response from logoutSession operation
            */
           public void receiveResultlogoutSession(
                    br.com.execBO.service.entities.LogoutSessionResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from logoutSession operation
           */
            public void receiveErrorlogoutSession(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for callProcedure method
            * override this method for handling normal response from callProcedure operation
            */
           public void receiveResultcallProcedure(
                    br.com.execBO.service.entities.CallProcedureResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from callProcedure operation
           */
            public void receiveErrorcallProcedure(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for callProcedureWithToken method
            * override this method for handling normal response from callProcedureWithToken operation
            */
           public void receiveResultcallProcedureWithToken(
                    br.com.execBO.service.entities.CallProcedureWithTokenResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from callProcedureWithToken operation
           */
            public void receiveErrorcallProcedureWithToken(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for callProcedureWithTokenAndCompany method
            * override this method for handling normal response from callProcedureWithTokenAndCompany operation
            */
           public void receiveResultcallProcedureWithTokenAndCompany(
                    br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from callProcedureWithTokenAndCompany operation
           */
            public void receiveErrorcallProcedureWithTokenAndCompany(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for userLogin method
            * override this method for handling normal response from userLogin operation
            */
           public void receiveResultuserLogin(
                    br.com.execBO.service.entities.UserLoginResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from userLogin operation
           */
            public void receiveErroruserLogin(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for userAndPasswordLogin method
            * override this method for handling normal response from userAndPasswordLogin operation
            */
           public void receiveResultuserAndPasswordLogin(
                    br.com.execBO.service.entities.UserAndPasswordLoginResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from userAndPasswordLogin operation
           */
            public void receiveErroruserAndPasswordLogin(java.lang.Exception e) {
            }
                


    }
    