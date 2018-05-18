package br.com.execBO;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import br.com.execBO.service.ExecBOServiceEndpoint;
import br.com.execBO.service.WebServiceExecBO;
import br.com.execBO.service.WebServiceExecBOLocator;

public class ExecBO {

	private ExecBOServiceEndpoint service;
	private String token;

	public ExecBO setService(String address, String port) throws Exception {
		String url = new StringBuilder().append("http://")
						   .append(address)
						   .append(":")
						   .append(port)
						   .append("/wsexecbo/WebServiceExecBO?wsdl")
						   .toString();		
		try {
			WebServiceExecBO web = new WebServiceExecBOLocator();
			service = web.getWebServiceExecBOPort(new URL(url));
			return this;
		} catch (MalformedURLException | ServiceException e) {
			throw new Exception(e);
		}

	}

	public String getResult(String program, String procedure, String param) throws Exception {
		try {
			return service.callProcedureWithToken(token, program, procedure, param);
		} catch (RemoteException e) {
			throw new Exception(e);
		}

	}

	public ExecBO setToken(String user, String senha) throws Exception {
		senha = Encrypt.getEncrypt(senha);
		token = service.userAndPasswordLogin(user, senha);
		return this;

	}

}
