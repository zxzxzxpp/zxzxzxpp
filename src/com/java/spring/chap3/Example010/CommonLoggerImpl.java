package com.java.spring.chap3.Example010;

public class CommonLoggerImpl implements CommonLogger{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("CommonLogger - " + message );
	}
	
}
