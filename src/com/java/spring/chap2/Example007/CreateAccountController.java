package com.java.spring.chap2.Example007;

import javax.servlet.http.HttpServletRequest;
import com.java.spring.chap2.Example007.*;

import org.springframework.jmx.export.assembler.AutodetectCapableMBeanInfoAssembler;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequestMapping("/account/create.do")
public class CreateAccountController {

	@ModelAttribute("command")
	public MemberInfo formbacking(HttpServletRequest request)
	{
		/*System.out.println("----------------------------------command--------------------------------");*/
		if(request.getMethod().equalsIgnoreCase("GET")){
			MemberInfo mi= new MemberInfo();
			Address address =new Address();
			address.setZipcode(autoDetectZipcode(request.getRemoteAddr()));
			mi.setAddress(address);
			return mi;
		}else{
			return new MemberInfo();
		}
	}
	
	private String autoDetectZipcode(String remoteAddr){
		
		return "000000";
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String form(){
		/*System.out.println("----------------------------------form--------------------------------");*/
		return "account/creationForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submit(@ModelAttribute("command")MemberInfo memberInfo , BindingResult result){
		/*System.out.println("----------------------------------POST--------------------------------");*/
		new MemberInfoValidator().validate(memberInfo, result);
		if(result.hasErrors()){
			return "account/creationForm";
		}
		return "account/created";
	}
	
}
