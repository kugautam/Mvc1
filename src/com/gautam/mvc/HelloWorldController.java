package com.gautam.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloWorldController
{
	@Controller
	public class HelloWorldController 
	{
	    @RequestMapping("/views/helloWorldPage")
		public String helloWorldPage()
		{
			return "helloworld";
			
		}	
		
	}
}
