package com.nuestartask.prodcatserv.apispec;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuestartask.prodcatserv.constants.ProdCatConstants;
import com.nuestartask.prodcatserv.model.ProcessedResult;
import com.nuestartask.prodcatserv.model.Product;

@RestController
@RequestMapping(path = "/products")
public interface IProdService {
		
	@PostMapping(path = "/", produces = ProdCatConstants.APPLJSON, consumes = ProdCatConstants.APPLJSON)
	public ResponseEntity<ProcessedResult> process(@RequestBody List<Product> productList);

}
