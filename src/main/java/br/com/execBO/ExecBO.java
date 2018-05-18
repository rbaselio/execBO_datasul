package br.com.execBO;

import br.com.execBO.service.WebServiceExecBO;
import br.com.execBO.service.WebServiceExecBOStub;
import br.com.execBO.service.entities.CallProcedureWithToken;
import br.com.execBO.service.entities.CallProcedureWithTokenE;
import br.com.execBO.service.entities.CallProcedureWithTokenResponseE;
import br.com.execBO.service.entities.UserAndPasswordLogin;
import br.com.execBO.service.entities.UserAndPasswordLoginE;
import br.com.execBO.service.entities.UserAndPasswordLoginResponseE;

public class ExecBO {

	private WebServiceExecBO service;
	private String token;

	public ExecBO setService(String address, String port) throws Exception {
		String url = new StringBuilder().append("http://")
						   .append(address)
						   .append(":")
						   .append(port)
						   .append("/wsexecbo/WebServiceExecBO")
						   .toString();
		
		
		
		service = new WebServiceExecBOStub(url);
		return this;
		

	}

	public String getResult(String program, String procedure, String param) throws Exception {
		
		CallProcedureWithToken proc = new CallProcedureWithToken();
		
		proc.setArg0(token);
		proc.setArg1(program);
		proc.setArg2(procedure);
		proc.setArg3(param);
		
		CallProcedureWithTokenE callProcedure = new CallProcedureWithTokenE();
		callProcedure.setCallProcedureWithToken(proc);
		CallProcedureWithTokenResponseE reponse = service.callProcedureWithToken(callProcedure);
		return reponse.getCallProcedureWithTokenResponse().get_return();

	}

	public ExecBO setToken(String user, String senha) throws Exception {
		senha = Encrypt.getEncrypt(senha);	
		
		UserAndPasswordLogin login = new UserAndPasswordLogin();
		login.setArg0(user);
		login.setArg1(senha);
		
		UserAndPasswordLoginE user1 = new UserAndPasswordLoginE();
		
		user1.setUserAndPasswordLogin(login);		
		
		UserAndPasswordLoginResponseE result = service.userAndPasswordLogin(user1 );
		
		token = result.getUserAndPasswordLoginResponse().get_return();
		
		return this;

	}

}
