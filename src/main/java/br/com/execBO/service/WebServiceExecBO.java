

/**
 * WebServiceExecBO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */

    package br.com.execBO.service;

    /*
     *  WebServiceExecBO java interface
     */

    public interface WebServiceExecBO {
          

        /**
          * Auto generated method signature
          * 
                    * @param callProcedureWithCompany0
                
             * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
         */

         
                     public br.com.execBO.service.entities.CallProcedureWithCompanyResponseE callProcedureWithCompany(

                        br.com.execBO.service.entities.CallProcedureWithCompanyE callProcedureWithCompany0)
                        throws java.rmi.RemoteException
             
          ,br.com.execBO.service.entities.ExecBOServiceExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param callProcedureWithCompany0
            
          */
        public void startcallProcedureWithCompany(

            br.com.execBO.service.entities.CallProcedureWithCompanyE callProcedureWithCompany0,

            final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param login2
                
             * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
         */

         
                     public br.com.execBO.service.entities.LoginResponseE login(

                        br.com.execBO.service.entities.LoginE login2)
                        throws java.rmi.RemoteException
             
          ,br.com.execBO.service.entities.ExecBOServiceExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param login2
            
          */
        public void startlogin(

            br.com.execBO.service.entities.LoginE login2,

            final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param logoutSession4
                
             * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
         */

         
                     public br.com.execBO.service.entities.LogoutSessionResponseE logoutSession(

                        br.com.execBO.service.entities.LogoutSessionE logoutSession4)
                        throws java.rmi.RemoteException
             
          ,br.com.execBO.service.entities.ExecBOServiceExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param logoutSession4
            
          */
        public void startlogoutSession(

            br.com.execBO.service.entities.LogoutSessionE logoutSession4,

            final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param callProcedure6
                
             * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
         */

         
                     public br.com.execBO.service.entities.CallProcedureResponseE callProcedure(

                        br.com.execBO.service.entities.CallProcedureE callProcedure6)
                        throws java.rmi.RemoteException
             
          ,br.com.execBO.service.entities.ExecBOServiceExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param callProcedure6
            
          */
        public void startcallProcedure(

            br.com.execBO.service.entities.CallProcedureE callProcedure6,

            final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param callProcedureWithToken8
                
             * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
         */

         
                     public br.com.execBO.service.entities.CallProcedureWithTokenResponseE callProcedureWithToken(

                        br.com.execBO.service.entities.CallProcedureWithTokenE callProcedureWithToken8)
                        throws java.rmi.RemoteException
             
          ,br.com.execBO.service.entities.ExecBOServiceExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param callProcedureWithToken8
            
          */
        public void startcallProcedureWithToken(

            br.com.execBO.service.entities.CallProcedureWithTokenE callProcedureWithToken8,

            final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param callProcedureWithTokenAndCompany10
                
             * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
         */

         
                     public br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyResponseE callProcedureWithTokenAndCompany(

                        br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyE callProcedureWithTokenAndCompany10)
                        throws java.rmi.RemoteException
             
          ,br.com.execBO.service.entities.ExecBOServiceExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param callProcedureWithTokenAndCompany10
            
          */
        public void startcallProcedureWithTokenAndCompany(

            br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyE callProcedureWithTokenAndCompany10,

            final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param userLogin12
                
             * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
         */

         
                     public br.com.execBO.service.entities.UserLoginResponseE userLogin(

                        br.com.execBO.service.entities.UserLoginE userLogin12)
                        throws java.rmi.RemoteException
             
          ,br.com.execBO.service.entities.ExecBOServiceExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param userLogin12
            
          */
        public void startuserLogin(

            br.com.execBO.service.entities.UserLoginE userLogin12,

            final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param userAndPasswordLogin14
                
             * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
         */

         
                     public br.com.execBO.service.entities.UserAndPasswordLoginResponseE userAndPasswordLogin(

                        br.com.execBO.service.entities.UserAndPasswordLoginE userAndPasswordLogin14)
                        throws java.rmi.RemoteException
             
          ,br.com.execBO.service.entities.ExecBOServiceExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param userAndPasswordLogin14
            
          */
        public void startuserAndPasswordLogin(

            br.com.execBO.service.entities.UserAndPasswordLoginE userAndPasswordLogin14,

            final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    