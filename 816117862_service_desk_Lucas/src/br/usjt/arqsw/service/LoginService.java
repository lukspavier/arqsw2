package br.usjt.arqsw.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.arqsw.dao.LoginDAO;
import br.usjt.arqsw.entity.Login;

/***
 * 
 * @author Lucas Spavier 816117862 SI3AN MCA
 */


@Service
public class LoginService {
	private LoginDAO dao;
	
	@Autowired
	public LoginService(LoginDAO dao){
		this.dao = dao;
	}
	
	public boolean validarLogin(Login login) throws IOException{
		return dao.validarLogin(login);
	}
}
