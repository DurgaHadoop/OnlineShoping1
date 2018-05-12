package com.durga.shoppingbakent.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.durga.shoppingbackent.dao.CatergoryDao;
import com.durga.shoppingbackent.dto.Category;
@Repository(value="category")
public class CatergoryDaoImpl implements CatergoryDao 
{
	
	@Autowired
	private SessionFactory sessionFactory;;
   private static List<Category> l=new ArrayList<>();
   {
	    Category c1=new Category();
	    c1.setName("Television");
	    c1.setId(1);
	    c1.setDescription("this is description for television");
	    c1.setImageUrl("cat_1.jpg");
	    l.add(c1);
	    
	    c1=new Category();
	    c1.setName("Mobile");
	    c1.setId(2);
	    c1.setDescription("this is description for Mobile");
	    c1.setImageUrl("cat_2.jpg");
	    l.add(c1);
	    
	    
	    c1=new Category();
	    c1.setName("Laptop");
	    c1.setId(3);
	    c1.setDescription("this is description for laptop");
	    c1.setImageUrl("cat_3.jpg");
	    l.add(c1);
	    
	    
	    
	    
	    
   }
	@Override
	public List<Category> list() {
		
		return l;
	}
	@Override
	public Category get(int id) {
		
	     for(Category cat:l)
	     {
	    	 if(id ==cat.getId())
	    		 return cat;
	     }
	     return null;
	}
	@Override
	@Transactional
	public boolean add(Category category) 
	{
	   try(Session session =sessionFactory.openSession();)
	   {
		   session.save(category);
		   return true;
	   }
       catch (Exception e) {
		e.printStackTrace();
		return false;
	}	   
		
	}

}
