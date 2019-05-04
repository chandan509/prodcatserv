package com.nuestartask.prodcatserv.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.nuestartask.prodcatserv.apispec.IProdService;
import com.nuestartask.prodcatserv.model.ProcessedResult;
import com.nuestartask.prodcatserv.model.Product;
import com.nuestartask.prodcatserv.services.ProdService;

public class ProdServiceImpl implements IProdService {
	
	@Autowired
	ProdService prodService;

	@Override
	public ResponseEntity<ProcessedResult> process(List<Product> products) {		
		ProcessedResult result = prodService.process(products);
		return ResponseEntity.ok().body(result);
	}

}
