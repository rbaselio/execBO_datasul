/**
 * WebServiceExecBO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.execBO.service;

public interface WebServiceExecBO extends javax.xml.rpc.Service {
    public java.lang.String getWebServiceExecBOPortAddress();

    public br.com.execBO.service.ExecBOServiceEndpoint getWebServiceExecBOPort() throws javax.xml.rpc.ServiceException;

    public br.com.execBO.service.ExecBOServiceEndpoint getWebServiceExecBOPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
