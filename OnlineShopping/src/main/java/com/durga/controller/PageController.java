package com.durga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.durga.shoppingbackent.dao.CatergoryDao;
import com.durga.shoppingbackent.dto.Category;

@Controller
public class PageController 
{
	      
	     @Autowired
	     private CatergoryDao category;
	     @GetMapping(value= {"/","/home","/index"})
         public ModelAndView home()
         {
        	 ModelAndView model=new ModelAndView("page");
        	 model.addObject("title","home");
        	 model.addObject("userClicksHome", true);
        	 model.addObject("categories", category.list());
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
	     
	     @GetMapping(value= "/show/all/products")
         public ModelAndView allProducts()
         {
        	 ModelAndView model=new ModelAndView("page");
        	 model.addObject("title","all Products");
        	 model.addObject("userClicksAllProducts", true);
        	 model.addObject("categories", category.list());
        	 return model;
         }
	     
	     @GetMapping(value="/show/category/{id}/products")
         public ModelAndView showProductByCategory(@PathVariable int id)
         {
	    	 Category c=null;
	    	 c=category.get(id);
        	 ModelAndView model=new ModelAndView("page");
        	 model.addObject("title",c.getName());
        	 model.addObject("userClicksCategoryProducts", true);
        	 model.addObject("categories", category.list());
        	 model.addObject("category", c);
        	 return model;
         }
	     
}
