package com.durga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController 
{
	
	     @GetMapping(value= {"/","/home","/index"})
         public ModelAndView home()
         {
        	 ModelAndView model=new ModelAndView("page");
        	 model.addObject("title","home");
        	 model.addObject("userClicksHome", true);
        	 return model;
         }
	      
	     @GetMapping(value="/about")
	     public  ModelAndView about()
	     {
	    	 ModelAndView model=new ModelAndView("page");
        	 model.addObject("title","about");
        	 model.addObject("userClicksAbout", true);
        	 return model;
	     }
	     
	     @GetMapping(value="/contact")
	     public ModelAndView contactUs()
	     {
	    	 ModelAndView model=new ModelAndView("page");
	    	 model.addObject("title","Contact Us");
	    	 model.addObject("userClicksContactUs", true);
	    	 return model;
	     }
	     
}
