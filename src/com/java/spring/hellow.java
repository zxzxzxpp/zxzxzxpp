package com.java.spring;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class hellow {

	@RequestMapping("/hello.do")
	public ModelAndView hello(){
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		mav.addObject("greeting", getGreeting());
		return mav;
	}
	
	private String getGreeting(){
		int hour =Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour >= 6&& hour <=10){
			return "ÁÁÀº ¾ÆÄ§ÀÔ´Ï´Ù . ";
		}else if(hour >= 12 && hour <=15){
			return "Á¡½É ½Ã°£";
		}else if(hour >=18 && hour <=22){
			return "±Â¹ã";
		}
		return "¾È³ç~";
		
		
		
		
	}
}
