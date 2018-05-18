
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */

        
            package br.com.execBO.service.entities;
        
            /**
            *  ExtensionMapper class
            */

        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "login".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.Login.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "logoutSession".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.LogoutSession.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "userAndPasswordLoginResponse".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.UserAndPasswordLoginResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "callProcedureResponse".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.CallProcedureResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "callProcedure".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.CallProcedure.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "callProcedureWithToken".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.CallProcedureWithToken.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "logoutSessionResponse".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.LogoutSessionResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "callProcedureWithTokenResponse".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.CallProcedureWithTokenResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "userAndPasswordLogin".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.UserAndPasswordLogin.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "callProcedureWithCompanyResponse".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.CallProcedureWithCompanyResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "loginResponse".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.LoginResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "callProcedureWithCompany".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.CallProcedureWithCompany.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "userLoginResponse".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.UserLoginResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "CheckExceptionsFaultBean".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.CheckExceptionsFaultBean.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "callProcedureWithTokenAndCompany".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.CallProcedureWithTokenAndCompany.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "callProcedureWithTokenAndCompanyResponse".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.CallProcedureWithTokenAndCompanyResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://service.execbo.ws.framework.totvs.com".equals(namespaceURI) &&
                  "userLogin".equals(typeName)){
                   
                            return  br.com.execBO.service.entities.UserLogin.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    