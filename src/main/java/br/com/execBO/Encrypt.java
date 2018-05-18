package br.com.execBO;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Encrypt {
	
	public static String getEncrypt(String senha)  throws Exception {
		byte[] encSHA_1;
		try {
			encSHA_1 = MessageDigest.getInstance("SHA-1").digest(senha.getBytes());
		} catch (NoSuchAlgorithmException e) {
			throw new Exception(e);
						
		}			
		byte[] encBase64 = Base64.getEncoder().encode(encSHA_1);
		return new String(encBase64);
	}
	
	

}
