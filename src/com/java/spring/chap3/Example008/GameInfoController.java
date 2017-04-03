package com.java.spring.chap3.Example008;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameInfoController {
	
	@RequestMapping("/game/info")
	public String gameInfo(){
		return "game/users/info";
	}
	
	@RequestMapping("/game/list")
	public String gameList(){
		return "game/list";
	}
}
