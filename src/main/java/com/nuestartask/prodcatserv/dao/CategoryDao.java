package com.nuestartask.prodcatserv.dao;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.nuestartask.prodcatserv.model.Category;

@Repository
public class CategoryDao {
	
	Set<Category> categories = new LinkedHashSet<>();
	
	public boolean addCategory(Category cat){
		return categories.add(cat);
	}
	
	public boolean removeCategory(Category cat){
		return categories.remove(cat);
	}
	
	public List<Category> getAllCategories(){
		List<Category> catList = new ArrayList<>(categories);
		return catList;
	}

}
