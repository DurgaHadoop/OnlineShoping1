package com.durga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController 
{
	
	     @GetMapping(value= {"/","/home","/index"})
         public ModelAndView page()
         {
        	 ModelAndView model=new ModelAndView("page");
        	 model.addObject("greeting","welcome to spring mvc");
        	 return model;
         }
}
