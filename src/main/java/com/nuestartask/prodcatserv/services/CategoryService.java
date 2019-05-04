package com.nuestartask.prodcatserv.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuestartask.prodcatserv.dao.CategoryDao;
import com.nuestartask.prodcatserv.model.Category;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryDao catDao;
	
	public boolean add(Category cat){
		return catDao.addCategory(cat);		
	}
	
	public boolean remove(Category cat){
		return catDao.removeCategory(cat);
	}
	
	public List<Category> getAll(){
		return catDao.getAllCategories();
	}

}
