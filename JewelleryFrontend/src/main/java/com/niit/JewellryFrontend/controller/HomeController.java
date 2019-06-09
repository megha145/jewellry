

package com.niit.JewellryFrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value="/",method=RequestMethod.GET)
    
    public String home()
    {
    	return "home";
    	
    }
@RequestMapping("/about")
    
    public String about()
    {
    	return "about";
    	
    }
@RequestMapping("/blog")

public String blog()
{
	return "blog";
	
}

@RequestMapping("/productdetails")

public String productdetails()
{
	return "productdetails";
	
}
@RequestMapping("/contact")

public String contact()
{
	return "contact";
	
}

}
