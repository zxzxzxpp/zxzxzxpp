package com.java.spring.chap4.Example013;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class EventExpirationCheckInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("TestInterceptor{preHandle}............................................ start");
		if(checkEvent(request) && checkEventExpiration()){
			displayEventExpirationPage(request, response);
			return false;
		}

		return true;
	}

	private boolean checkEvent(HttpServletRequest request ){
		System.out.println("TestInterceptor{checkEvent}............................................ start");
		return request.getRequestURI().equals(request.getContextPath() + "/event/list.do");
	}
	
	private boolean checkEventExpiration(){
		System.out.println("TestInterceptor{checkEventExpiration}............................................ start");
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016,3,15);
		Date now = new Date();
		System.out.println(now.after(calendar.getTime()));
		return now.after(calendar.getTime());
		/*return now.before(calendar.getTime());*/
	}
	
 	private void displayEventExpirationPage(HttpServletRequest request ,HttpServletResponse response) throws IOException{
 		
 		response.sendRedirect("eventExpired.do");
 	}
}
