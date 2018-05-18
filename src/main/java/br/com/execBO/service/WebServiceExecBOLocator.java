/**
 * WebServiceExecBOLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.execBO.service;

import javax.xml.namespace.QName;

public class WebServiceExecBOLocator extends org.apache.axis.client.Service implements br.com.execBO.service.WebServiceExecBO {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1560439721084096873L;

	public WebServiceExecBOLocator() {
    }


    public WebServiceExecBOLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServiceExecBOLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServiceExecBOPort
    private java.lang.String WebServiceExecBOPort_address = "http://localhost:<port>/wsexecbo/WebServiceExecBO";

    public java.lang.String getWebServiceExecBOPortAddress() {
        return WebServiceExecBOPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServiceExecBOPortWSDDServiceName = "WebServiceExecBOPort";

    public java.lang.String getWebServiceExecBOPortWSDDServiceName() {
        return WebServiceExecBOPortWSDDServiceName;
    }

    public void setWebServiceExecBOPortWSDDServiceName(java.lang.String name) {
        WebServiceExecBOPortWSDDServiceName = name;
    }

    public br.com.execBO.service.ExecBOServiceEndpoint getWebServiceExecBOPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServiceExecBOPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServiceExecBOPort(endpoint);
    }

    public br.com.execBO.service.ExecBOServiceEndpoint getWebServiceExecBOPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.execBO.service.ExecBOServiceEndpointBindingStub _stub = new br.com.execBO.service.ExecBOServiceEndpointBindingStub(portAddress, this);
            _stub.setPortName(getWebServiceExecBOPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServiceExecBOPortEndpointAddress(java.lang.String address) {
        WebServiceExecBOPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.execBO.service.ExecBOServiceEndpoint.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.execBO.service.ExecBOServiceEndpointBindingStub _stub = new br.com.execBO.service.ExecBOServiceEndpointBindingStub(new java.net.URL(WebServiceExecBOPort_address), this);
                _stub.setPortName(getWebServiceExecBOPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebServiceExecBOPort".equals(inputPortName)) {
            return getWebServiceExecBOPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "WebServiceExecBO");
    }

    private java.util.HashSet<QName> ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet<QName>();
            ports.add(new javax.xml.namespace.QName("http://service.execbo.ws.framework.totvs.com", "WebServiceExecBOPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServiceExecBOPort".equals(portName)) {
            setWebServiceExecBOPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
