
/**
 * WebServiceExecBOStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
        package br.com.execBO.service;

import org.apache.axis2.client.FaultMapKey;

/*
        *  WebServiceExecBOStub java implementation
        */

        
        public class WebServiceExecBOStub extends org.apache.axis2.client.Stub
        implements WebServiceExecBO{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap<FaultMapKey, String> faultExceptionNameMap = new java.util.HashMap<FaultMapKey, String>();
        private java.util.HashMap<FaultMapKey, String> faultExceptionClassNameMap = new java.util.HashMap<FaultMapKey, String>();
        private java.util.HashMap<FaultMapKey, String> faultMessageMap = new java.util.HashMap<FaultMapKey, String>();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("WebServiceExecBO" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[8];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithCompany"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "login"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "logoutSession"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedure"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithToken"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithTokenAndCompany"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "userLogin"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "userAndPasswordLogin"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "callProcedureWithCompany"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "callProcedureWithCompany"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "callProcedureWithCompany"),"com.totvs.framework.ws.execbo.service.ExecBOServiceException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "login"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "login"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "login"),"com.totvs.framework.ws.execbo.service.ExecBOServiceException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "logoutSession"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "logoutSession"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "logoutSession"),"com.totvs.framework.ws.execbo.service.ExecBOServiceException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "callProcedure"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "callProcedure"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "callProcedure"),"com.totvs.framework.ws.execbo.service.ExecBOServiceException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "callProcedureWithToken"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "callProcedureWithToken"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "callProcedureWithToken"),"com.totvs.framework.ws.execbo.service.ExecBOServiceException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "callProcedureWithTokenAndCompany"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "callProcedureWithTokenAndCompany"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "callProcedureWithTokenAndCompany"),"com.totvs.framework.ws.execbo.service.ExecBOServiceException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "userLogin"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "userLogin"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "userLogin"),"com.totvs.framework.ws.execbo.service.ExecBOServiceException");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "userAndPasswordLogin"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "userAndPasswordLogin"),"com.totvs.framework.ws.execbo.service.ExecBOServiceExceptionException");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com","ExecBOServiceException"), "userAndPasswordLogin"),"com.totvs.framework.ws.execbo.service.ExecBOServiceException");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public WebServiceExecBOStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public WebServiceExecBOStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public WebServiceExecBOStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://WIN-N4P6BA8238I:8180/wsexecbo/WebServiceExecBO" );
                
    }

    /**
     * Default Constructor
     */
    public WebServiceExecBOStub() throws org.apache.axis2.AxisFault {
        
                    this("http://WIN-N4P6BA8238I:8180/wsexecbo/WebServiceExecBO" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public WebServiceExecBOStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.execBO.service.WebServiceExecBO#callProcedureWithCompany
                     * @param callProcedureWithCompany16
                    
                     * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
                     */

                    

                            public  br.com.execBO.service.entities.CallProcedureWithCompanyResponseE callProcedureWithCompany(

                            br.com.execBO.service.entities.CallProcedureWithCompanyE callProcedureWithCompany16)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.execBO.service.entities.ExecBOServiceExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/callProcedureWithCompanyRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    callProcedureWithCompany16,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithCompany")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithCompany"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.execBO.service.entities.CallProcedureWithCompanyResponseE.class);

                               
                                        return (br.com.execBO.service.entities.CallProcedureWithCompanyResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithCompany"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithCompany"));
                        java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithCompany"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
                          throw (br.com.execBO.service.entities.ExecBOServiceExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see br.com.execBO.service.WebServiceExecBO#startcallProcedureWithCompany
                    * @param callProcedureWithCompany16
                
                */
                public  void startcallProcedureWithCompany(

                 br.com.execBO.service.entities.CallProcedureWithCompanyE callProcedureWithCompany16,

                  final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/callProcedureWithCompanyRequest");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    callProcedureWithCompany16,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithCompany")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithCompany"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         br.com.execBO.service.entities.CallProcedureWithCompanyResponseE.class);
                                        callback.receiveResultcallProcedureWithCompany(
                                        (br.com.execBO.service.entities.CallProcedureWithCompanyResponseE)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcallProcedureWithCompany(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithCompany"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithCompany"));
													java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithCompany"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
														callback.receiveErrorcallProcedureWithCompany((br.com.execBO.service.entities.ExecBOServiceExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcallProcedureWithCompany(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithCompany(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithCompany(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithCompany(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithCompany(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithCompany(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithCompany(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithCompany(f);
                                            }
									    } else {
										    callback.receiveErrorcallProcedureWithCompany(f);
									    }
									} else {
									    callback.receiveErrorcallProcedureWithCompany(f);
									}
								} else {
								    callback.receiveErrorcallProcedureWithCompany(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcallProcedureWithCompany(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.execBO.service.WebServiceExecBO#login
                     * @param login18
                    
                     * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
                     */

                    

                            public  br.com.execBO.service.entities.LoginResponseE login(

                            br.com.execBO.service.entities.LoginE login18)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.execBO.service.entities.ExecBOServiceExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/loginRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    login18,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "login")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "login"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.execBO.service.entities.LoginResponseE.class);

                               
                                        return (br.com.execBO.service.entities.LoginResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"login"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"login"));
                        java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"login"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
                          throw (br.com.execBO.service.entities.ExecBOServiceExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see br.com.execBO.service.WebServiceExecBO#startlogin
                    * @param login18
                
                */
                public  void startlogin(

                 br.com.execBO.service.entities.LoginE login18,

                  final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/loginRequest");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    login18,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "login")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "login"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         br.com.execBO.service.entities.LoginResponseE.class);
                                        callback.receiveResultlogin(
                                        (br.com.execBO.service.entities.LoginResponseE)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorlogin(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"login"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"login"));
													java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"login"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
														callback.receiveErrorlogin((br.com.execBO.service.entities.ExecBOServiceExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorlogin(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogin(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogin(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogin(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogin(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogin(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogin(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogin(f);
                                            }
									    } else {
										    callback.receiveErrorlogin(f);
									    }
									} else {
									    callback.receiveErrorlogin(f);
									}
								} else {
								    callback.receiveErrorlogin(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorlogin(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.execBO.service.WebServiceExecBO#logoutSession
                     * @param logoutSession20
                    
                     * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
                     */

                    

                            public  br.com.execBO.service.entities.LogoutSessionResponseE logoutSession(

                            br.com.execBO.service.entities.LogoutSessionE logoutSession20)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.execBO.service.entities.ExecBOServiceExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/logoutSessionRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    logoutSession20,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "logoutSession")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "logoutSession"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.execBO.service.entities.LogoutSessionResponseE.class);

                               
                                        return (br.com.execBO.service.entities.LogoutSessionResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"logoutSession"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"logoutSession"));
                        java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"logoutSession"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
                          throw (br.com.execBO.service.entities.ExecBOServiceExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see br.com.execBO.service.WebServiceExecBO#startlogoutSession
                    * @param logoutSession20
                
                */
                public  void startlogoutSession(

                 br.com.execBO.service.entities.LogoutSessionE logoutSession20,

                  final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/logoutSessionRequest");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    logoutSession20,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "logoutSession")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "logoutSession"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         br.com.execBO.service.entities.LogoutSessionResponseE.class);
                                        callback.receiveResultlogoutSession(
                                        (br.com.execBO.service.entities.LogoutSessionResponseE)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorlogoutSession(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"logoutSession"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"logoutSession"));
													java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"logoutSession"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
														callback.receiveErrorlogoutSession((br.com.execBO.service.entities.ExecBOServiceExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorlogoutSession(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogoutSession(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogoutSession(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogoutSession(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogoutSession(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogoutSession(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogoutSession(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorlogoutSession(f);
                                            }
									    } else {
										    callback.receiveErrorlogoutSession(f);
									    }
									} else {
									    callback.receiveErrorlogoutSession(f);
									}
								} else {
								    callback.receiveErrorlogoutSession(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorlogoutSession(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.execBO.service.WebServiceExecBO#callProcedure
                     * @param callProcedure22
                    
                     * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
                     */

                    

                            public  br.com.execBO.service.entities.CallProcedureResponseE callProcedure(

                            br.com.execBO.service.entities.CallProcedureE callProcedure22)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.execBO.service.entities.ExecBOServiceExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/callProcedureRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    callProcedure22,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedure")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedure"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.execBO.service.entities.CallProcedureResponseE.class);

                               
                                        return (br.com.execBO.service.entities.CallProcedureResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedure"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedure"));
                        java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedure"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
                          throw (br.com.execBO.service.entities.ExecBOServiceExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see br.com.execBO.service.WebServiceExecBO#startcallProcedure
                    * @param callProcedure22
                
                */
                public  void startcallProcedure(

                 br.com.execBO.service.entities.CallProcedureE callProcedure22,

                  final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/callProcedureRequest");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    callProcedure22,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedure")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedure"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         br.com.execBO.service.entities.CallProcedureResponseE.class);
                                        callback.receiveResultcallProcedure(
                                        (br.com.execBO.service.entities.CallProcedureResponseE)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcallProcedure(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedure"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedure"));
													java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedure"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
														callback.receiveErrorcallProcedure((br.com.execBO.service.entities.ExecBOServiceExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcallProcedure(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedure(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedure(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedure(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedure(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedure(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedure(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedure(f);
                                            }
									    } else {
										    callback.receiveErrorcallProcedure(f);
									    }
									} else {
									    callback.receiveErrorcallProcedure(f);
									}
								} else {
								    callback.receiveErrorcallProcedure(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcallProcedure(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.execBO.service.WebServiceExecBO#callProcedureWithToken
                     * @param callProcedureWithToken24
                    
                     * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
                     */

                    

                            public  br.com.execBO.service.entities.CallProcedureWithTokenResponseE callProcedureWithToken(

                            br.com.execBO.service.entities.CallProcedureWithTokenE callProcedureWithToken24)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.execBO.service.entities.ExecBOServiceExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/callProcedureWithTokenRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    callProcedureWithToken24,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithToken")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithToken"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.execBO.service.entities.CallProcedureWithTokenResponseE.class);

                               
                                        return (br.com.execBO.service.entities.CallProcedureWithTokenResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithToken"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithToken"));
                        java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithToken"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
                          throw (br.com.execBO.service.entities.ExecBOServiceExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see br.com.execBO.service.WebServiceExecBO#startcallProcedureWithToken
                    * @param callProcedureWithToken24
                
                */
                public  void startcallProcedureWithToken(

                 br.com.execBO.service.entities.CallProcedureWithTokenE callProcedureWithToken24,

                  final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/callProcedureWithTokenRequest");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    callProcedureWithToken24,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithToken")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithToken"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         br.com.execBO.service.entities.CallProcedureWithTokenResponseE.class);
                                        callback.receiveResultcallProcedureWithToken(
                                        (br.com.execBO.service.entities.CallProcedureWithTokenResponseE)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcallProcedureWithToken(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithToken"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithToken"));
													java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithToken"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
														callback.receiveErrorcallProcedureWithToken((br.com.execBO.service.entities.ExecBOServiceExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcallProcedureWithToken(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithToken(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithToken(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithToken(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithToken(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithToken(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithToken(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithToken(f);
                                            }
									    } else {
										    callback.receiveErrorcallProcedureWithToken(f);
									    }
									} else {
									    callback.receiveErrorcallProcedureWithToken(f);
									}
								} else {
								    callback.receiveErrorcallProcedureWithToken(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcallProcedureWithToken(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.execBO.service.WebServiceExecBO#callProcedureWithTokenAndCompany
                     * @param callProcedureWithTokenAndCompany26
                    
                     * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
                     */

                    

                            public  br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyResponseE callProcedureWithTokenAndCompany(

                            br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyE callProcedureWithTokenAndCompany26)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.execBO.service.entities.ExecBOServiceExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/callProcedureWithTokenAndCompanyRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    callProcedureWithTokenAndCompany26,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithTokenAndCompany")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithTokenAndCompany"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyResponseE.class);

                               
                                        return (br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithTokenAndCompany"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithTokenAndCompany"));
                        java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithTokenAndCompany"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
                          throw (br.com.execBO.service.entities.ExecBOServiceExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see br.com.execBO.service.WebServiceExecBO#startcallProcedureWithTokenAndCompany
                    * @param callProcedureWithTokenAndCompany26
                
                */
                public  void startcallProcedureWithTokenAndCompany(

                 br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyE callProcedureWithTokenAndCompany26,

                  final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/callProcedureWithTokenAndCompanyRequest");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    callProcedureWithTokenAndCompany26,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithTokenAndCompany")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "callProcedureWithTokenAndCompany"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyResponseE.class);
                                        callback.receiveResultcallProcedureWithTokenAndCompany(
                                        (br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyResponseE)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcallProcedureWithTokenAndCompany(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithTokenAndCompany"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithTokenAndCompany"));
													java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"callProcedureWithTokenAndCompany"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
														callback.receiveErrorcallProcedureWithTokenAndCompany((br.com.execBO.service.entities.ExecBOServiceExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcallProcedureWithTokenAndCompany(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithTokenAndCompany(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithTokenAndCompany(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithTokenAndCompany(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithTokenAndCompany(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithTokenAndCompany(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithTokenAndCompany(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcallProcedureWithTokenAndCompany(f);
                                            }
									    } else {
										    callback.receiveErrorcallProcedureWithTokenAndCompany(f);
									    }
									} else {
									    callback.receiveErrorcallProcedureWithTokenAndCompany(f);
									}
								} else {
								    callback.receiveErrorcallProcedureWithTokenAndCompany(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcallProcedureWithTokenAndCompany(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.execBO.service.WebServiceExecBO#userLogin
                     * @param userLogin28
                    
                     * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
                     */

                    

                            public  br.com.execBO.service.entities.UserLoginResponseE userLogin(

                            br.com.execBO.service.entities.UserLoginE userLogin28)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.execBO.service.entities.ExecBOServiceExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/userLoginRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    userLogin28,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "userLogin")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "userLogin"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.execBO.service.entities.UserLoginResponseE.class);

                               
                                        return (br.com.execBO.service.entities.UserLoginResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"userLogin"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"userLogin"));
                        java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"userLogin"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
                          throw (br.com.execBO.service.entities.ExecBOServiceExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see br.com.execBO.service.WebServiceExecBO#startuserLogin
                    * @param userLogin28
                
                */
                public  void startuserLogin(

                 br.com.execBO.service.entities.UserLoginE userLogin28,

                  final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/userLoginRequest");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    userLogin28,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "userLogin")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "userLogin"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         br.com.execBO.service.entities.UserLoginResponseE.class);
                                        callback.receiveResultuserLogin(
                                        (br.com.execBO.service.entities.UserLoginResponseE)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErroruserLogin(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"userLogin"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"userLogin"));
													java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"userLogin"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
														callback.receiveErroruserLogin((br.com.execBO.service.entities.ExecBOServiceExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErroruserLogin(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroruserLogin(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroruserLogin(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroruserLogin(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroruserLogin(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroruserLogin(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroruserLogin(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroruserLogin(f);
                                            }
									    } else {
										    callback.receiveErroruserLogin(f);
									    }
									} else {
									    callback.receiveErroruserLogin(f);
									}
								} else {
								    callback.receiveErroruserLogin(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErroruserLogin(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see br.com.execBO.service.WebServiceExecBO#userAndPasswordLogin
                     * @param userAndPasswordLogin30
                    
                     * @throws br.com.execBO.service.entities.ExecBOServiceExceptionException : 
                     */

                    

                            public  br.com.execBO.service.entities.UserAndPasswordLoginResponseE userAndPasswordLogin(

                            br.com.execBO.service.entities.UserAndPasswordLoginE userAndPasswordLogin30)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,br.com.execBO.service.entities.ExecBOServiceExceptionException{
              org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/userAndPasswordLoginRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    userAndPasswordLogin30,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "userAndPasswordLogin")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "userAndPasswordLogin"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             br.com.execBO.service.entities.UserAndPasswordLoginResponseE.class);

                               
                                        return (br.com.execBO.service.entities.UserAndPasswordLoginResponseE)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"userAndPasswordLogin"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"userAndPasswordLogin"));
                        java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"userAndPasswordLogin"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
                          throw (br.com.execBO.service.entities.ExecBOServiceExceptionException)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see br.com.execBO.service.WebServiceExecBO#startuserAndPasswordLogin
                    * @param userAndPasswordLogin30
                
                */
                public  void startuserAndPasswordLogin(

                 br.com.execBO.service.entities.UserAndPasswordLoginE userAndPasswordLogin30,

                  final br.com.execBO.service.entities.WebServiceExecBOCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
             _operationClient.getOptions().setAction("http://service.execbo.ws.framework.totvs.com/ExecBOServiceEndpoint/userAndPasswordLoginRequest");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    userAndPasswordLogin30,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "userAndPasswordLogin")),
                                                    new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "userAndPasswordLogin"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         br.com.execBO.service.entities.UserAndPasswordLoginResponseE.class);
                                        callback.receiveResultuserAndPasswordLogin(
                                        (br.com.execBO.service.entities.UserAndPasswordLoginResponseE)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErroruserAndPasswordLogin(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"userAndPasswordLogin"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"userAndPasswordLogin"));
													java.lang.Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"userAndPasswordLogin"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof br.com.execBO.service.entities.ExecBOServiceExceptionException){
														callback.receiveErroruserAndPasswordLogin((br.com.execBO.service.entities.ExecBOServiceExceptionException)ex);
											            return;
										            }
										            
					
										            callback.receiveErroruserAndPasswordLogin(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroruserAndPasswordLogin(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroruserAndPasswordLogin(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroruserAndPasswordLogin(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroruserAndPasswordLogin(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroruserAndPasswordLogin(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroruserAndPasswordLogin(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroruserAndPasswordLogin(f);
                                            }
									    } else {
										    callback.receiveErroruserAndPasswordLogin(f);
									    }
									} else {
									    callback.receiveErroruserAndPasswordLogin(f);
									}
								} else {
								    callback.receiveErroruserAndPasswordLogin(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErroruserAndPasswordLogin(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[7].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //http://WIN-N4P6BA8238I:8180/wsexecbo/WebServiceExecBO
            private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.CallProcedureWithCompanyE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.CallProcedureWithCompanyE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.CallProcedureWithCompanyResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.CallProcedureWithCompanyResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.ExecBOServiceException param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.ExecBOServiceException.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.LoginE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.LoginE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.LoginResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.LoginResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.LogoutSessionE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.LogoutSessionE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.LogoutSessionResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.LogoutSessionResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.CallProcedureE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.CallProcedureE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.CallProcedureResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.CallProcedureResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.CallProcedureWithTokenE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.CallProcedureWithTokenE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            @SuppressWarnings("unused")
			private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.CallProcedureWithTokenResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.CallProcedureWithTokenResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            @SuppressWarnings("unused")
			private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            
			private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.UserLoginE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.UserLoginE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.UserLoginResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.UserLoginResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.UserAndPasswordLoginE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.UserAndPasswordLoginE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(br.com.execBO.service.entities.UserAndPasswordLoginResponseE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(br.com.execBO.service.entities.UserAndPasswordLoginResponseE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.execBO.service.entities.CallProcedureWithCompanyE param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(br.com.execBO.service.entities.CallProcedureWithCompanyE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.execBO.service.entities.LoginE param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(br.com.execBO.service.entities.LoginE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.execBO.service.entities.LogoutSessionE param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(br.com.execBO.service.entities.LogoutSessionE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.execBO.service.entities.CallProcedureE param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(br.com.execBO.service.entities.CallProcedureE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.execBO.service.entities.CallProcedureWithTokenE param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(br.com.execBO.service.entities.CallProcedureWithTokenE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyE param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.execBO.service.entities.UserLoginE param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(br.com.execBO.service.entities.UserLoginE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, br.com.execBO.service.entities.UserAndPasswordLoginE param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(br.com.execBO.service.entities.UserAndPasswordLoginE.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault{

        try {
        
                if (br.com.execBO.service.entities.CallProcedureE.class.equals(type)){
                
                        return br.com.execBO.service.entities.CallProcedureE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.CallProcedureResponseE.class.equals(type)){
                
                        return br.com.execBO.service.entities.CallProcedureResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.CallProcedureWithCompanyE.class.equals(type)){
                
                        return br.com.execBO.service.entities.CallProcedureWithCompanyE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.CallProcedureWithCompanyResponseE.class.equals(type)){
                
                        return br.com.execBO.service.entities.CallProcedureWithCompanyResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyE.class.equals(type)){
                
                        return br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyResponseE.class.equals(type)){
                
                        return br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.CallProcedureWithTokenE.class.equals(type)){
                
                        return br.com.execBO.service.entities.CallProcedureWithTokenE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.CallProcedureWithTokenResponseE.class.equals(type)){
                
                        return br.com.execBO.service.entities.CallProcedureWithTokenResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.ExecBOServiceException.class.equals(type)){
                
                        return br.com.execBO.service.entities.ExecBOServiceException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.LoginE.class.equals(type)){
                
                        return br.com.execBO.service.entities.LoginE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.LoginResponseE.class.equals(type)){
                
                        return br.com.execBO.service.entities.LoginResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.LogoutSessionE.class.equals(type)){
                
                        return br.com.execBO.service.entities.LogoutSessionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.LogoutSessionResponseE.class.equals(type)){
                
                        return br.com.execBO.service.entities.LogoutSessionResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.UserAndPasswordLoginE.class.equals(type)){
                
                        return br.com.execBO.service.entities.UserAndPasswordLoginE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.UserAndPasswordLoginResponseE.class.equals(type)){
                
                        return br.com.execBO.service.entities.UserAndPasswordLoginResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.UserLoginE.class.equals(type)){
                
                        return br.com.execBO.service.entities.UserLoginE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (br.com.execBO.service.entities.UserLoginResponseE.class.equals(type)){
                
                        return br.com.execBO.service.entities.UserLoginResponseE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   