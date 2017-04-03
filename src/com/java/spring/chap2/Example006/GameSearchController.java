package com.java.spring.chap2.Example006;

import java.util.ArrayList;
import java.util.List;

import com.java.spring.chap2.Example006.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameSearchController {

	@Autowired
	private SearchService searchService;
	
	@ModelAttribute("searchTypeList")
	public List<SearchType> referenceSearchTypeList(){
		List<SearchType> options = new ArrayList<SearchType>();
		options.add(new SearchType(1,"��ü"));
		options.add(new SearchType(2,"������"));
		options.add(new SearchType(3,"ĳ����"));
		return options;
	}
	@ModelAttribute("popularQueryList")
	public String[] getPopularQueryList(){
		return new String[] {"����","â��2","�����̵�"};
		
	}
	@RequestMapping("/search/main.do")
	public String main(){
		return "search/main";
	}
	@RequestMapping("/search/game.do")
	public ModelAndView search(@ModelAttribute("command")SearchCommand command){
		ModelAndView mav = new ModelAndView("search/game");
		System.out.println("�˻���="+command.getQuery().toUpperCase());
		SearchResult result=searchService.search(command);
		mav.addObject("searchResult" , result);
		return mav;
	}
	
	@ExceptionHandler(NullPointerException.class)
	public String jandleNullPointerException(NullPointerException ex){
		return "error/nullException";
	}
	
	public void setSearchService(SearchService SearchService){
		this.searchService = searchService;
	}
	
	
	
}
