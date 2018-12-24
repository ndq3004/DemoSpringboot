package com.example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {
	
	@RequestMapping("/")
	public String welcome() {
		System.out.println("AppController->welcome()");
		
		return "welcome.html";
	}
	@RequestMapping("/index")
	public String index() {
		System.out.println("AppController->index()");
		return "index.html";
	}
}
