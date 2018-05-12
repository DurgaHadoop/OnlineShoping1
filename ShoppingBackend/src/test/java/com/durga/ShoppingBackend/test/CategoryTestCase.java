package com.durga.ShoppingBackend.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.durga.shoppingbackent.dao.CatergoryDao;
import com.durga.shoppingbackent.dto.Category;

public class CategoryTestCase 
{
      private static AnnotationConfigApplicationContext  context;
      private static CatergoryDao categoryDao;
      private Category category;
      
       @BeforeClass
       public static void init()
       {
    	   context=new AnnotationConfigApplicationContext();
    	   context.scan("com.durga.shoppingbackent");
    	   context.refresh();
    	   categoryDao =(CatergoryDao)context.getBean("category");
    	   
    	   
       }
       
       @Test
       public void testAddCategory()
       {
    	   category=new Category();
    	   category.setName("Television");
    	  
    	  category.setDescription("this is description for television");
    	  category.setImageUrl("cat_1.jpg");
    	  assertEquals("category added succesfully in side the database",true,categoryDao.add(category));
       }
      
}
