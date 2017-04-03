package com.java.spring.chap4.Example013;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

	@RequestMapping("/event/list.do")
	public String list(){
		return "event/list";
		
	}
	
	@RequestMapping("/event/eventExpried.do")
	public String expired(){
		return "event/eventExpired";
	}
}
