package com.java.spring.chap3.Example010;

public interface Authenticator {

	void authenticate(LoginCommand loginCommand) throws AuthenticationException;
	
}
