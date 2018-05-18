package br.com.execBO.service;

public class ExecBOServiceEndpointProxy implements br.com.execBO.service.ExecBOServiceEndpoint {
  private String _endpoint = null;
  private br.com.execBO.service.ExecBOServiceEndpoint execBOServiceEndpoint = null;
  
  public ExecBOServiceEndpointProxy() {
    _initExecBOServiceEndpointProxy();
  }
  
  public ExecBOServiceEndpointProxy(String endpoint) {
    _endpoint = endpoint;
    _initExecBOServiceEndpointProxy();
  }
  
  private void _initExecBOServiceEndpointProxy() {
    try {
      execBOServiceEndpoint = (new br.com.execBO.service.WebServiceExecBOLocator()).getWebServiceExecBOPort();
      if (execBOServiceEndpoint != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)execBOServiceEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)execBOServiceEndpoint)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (execBOServiceEndpoint != null)
      ((javax.xml.rpc.Stub)execBOServiceEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.execBO.service.ExecBOServiceEndpoint getExecBOServiceEndpoint() {
    if (execBOServiceEndpoint == null)
      _initExecBOServiceEndpointProxy();
    return execBOServiceEndpoint;
  }
  
  public java.lang.String callProcedure(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean{
    if (execBOServiceEndpoint == null)
      _initExecBOServiceEndpointProxy();
    return execBOServiceEndpoint.callProcedure(arg0, arg1, arg2);
  }
  
  public java.lang.String callProcedureWithCompany(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean{
    if (execBOServiceEndpoint == null)
      _initExecBOServiceEndpointProxy();
    return execBOServiceEndpoint.callProcedureWithCompany(arg0, arg1, arg2, arg3);
  }
  
  public java.lang.String callProcedureWithToken(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean{
    if (execBOServiceEndpoint == null)
      _initExecBOServiceEndpointProxy();
    return execBOServiceEndpoint.callProcedureWithToken(arg0, arg1, arg2, arg3);
  }
  
  public java.lang.String callProcedureWithTokenAndCompany(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean{
    if (execBOServiceEndpoint == null)
      _initExecBOServiceEndpointProxy();
    return execBOServiceEndpoint.callProcedureWithTokenAndCompany(arg0, arg1, arg2, arg3, arg4);
  }
  
  public java.lang.String login() throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean{
    if (execBOServiceEndpoint == null)
      _initExecBOServiceEndpointProxy();
    return execBOServiceEndpoint.login();
  }
  
  public java.lang.String logoutSession(java.lang.String arg0) throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean{
    if (execBOServiceEndpoint == null)
      _initExecBOServiceEndpointProxy();
    return execBOServiceEndpoint.logoutSession(arg0);
  }
  
  public java.lang.String userAndPasswordLogin(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean{
    if (execBOServiceEndpoint == null)
      _initExecBOServiceEndpointProxy();
    return execBOServiceEndpoint.userAndPasswordLogin(arg0, arg1);
  }
  
  public java.lang.String userLogin(java.lang.String arg0) throws java.rmi.RemoteException, br.com.execBO.service.CheckExceptionsFaultBean{
    if (execBOServiceEndpoint == null)
      _initExecBOServiceEndpointProxy();
    return execBOServiceEndpoint.userLogin(arg0);
  }
  
  
}