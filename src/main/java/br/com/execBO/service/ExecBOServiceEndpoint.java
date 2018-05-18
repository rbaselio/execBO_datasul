/**
 * ExecBOServiceEndpoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.execBO.service;

public interface ExecBOServiceEndpoint extends java.rmi.Remote {
    public java.lang.String callProcedure(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean;
    public java.lang.String callProcedureWithCompany(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean;
    public java.lang.String callProcedureWithToken(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean;
    public java.lang.String callProcedureWithTokenAndCompany(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean;
    public java.lang.String login() throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean;
    public java.lang.String logoutSession(java.lang.String arg0) throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean;
    public java.lang.String userAndPasswordLogin(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean;
    public java.lang.String userLogin(java.lang.String arg0) throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean;
}
