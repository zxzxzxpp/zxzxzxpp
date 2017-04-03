package com.java.spring.chap3.Example009;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/game/users/{userId}")
public class CharacterInfoController {

	@RequestMapping("/characters/{characterId}")
	public String characterInfo(@PathVariable String userId, @PathVariable int characterId, ModelMap model){
		
		model.addAttribute("userId" , userId);
		model.addAttribute("characterId" , characterId);
		return "game/character/users/info";
	}
	
}
