package com.nuestartask.prodcatserv.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.nuestartask.prodcatserv.apispec.ICategoryService;
import com.nuestartask.prodcatserv.model.Category;
import com.nuestartask.prodcatserv.services.CategoryService;

public class CategoryServiceImpl implements ICategoryService {
	
	@Autowired
	private CategoryService service;

	@Override
	public ResponseEntity<Object> add(Category category) {
		service.add(category);		
		return ResponseEntity.accepted().body("Category created");
	}

	@Override
	public ResponseEntity<Object> remove(Category category) {
		service.remove(category);
		return ResponseEntity.status(HttpStatus.OK).body("Category remomved");
	}

	@Override
	public ResponseEntity<List<Category>> list() {
		List<Category> list = service.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}

}
