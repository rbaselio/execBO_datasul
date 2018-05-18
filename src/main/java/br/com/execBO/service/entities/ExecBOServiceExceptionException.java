
/**
 * ExecBOServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */

package br.com.execBO.service.entities;

public class ExecBOServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1526672441462L;
    
    private br.com.execBO.service.entities.ExecBOServiceException faultMessage;

    
        public ExecBOServiceExceptionException() {
            super("ExecBOServiceExceptionException");
        }

        public ExecBOServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public ExecBOServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ExecBOServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(br.com.execBO.service.entities.ExecBOServiceException msg){
       faultMessage = msg;
    }
    
    public br.com.execBO.service.entities.ExecBOServiceException getFaultMessage(){
       return faultMessage;
    }
}
    