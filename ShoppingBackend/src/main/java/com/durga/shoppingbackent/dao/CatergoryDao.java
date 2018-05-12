package com.durga.shoppingbackent.dao;

import java.util.List;

import com.durga.shoppingbackent.dto.Category;

public interface CatergoryDao 
{
    boolean add(Category category);
	List<Category>  list();

	Category get(int id);
}
