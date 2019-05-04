package com.nuestartask.prodcatserv.apispec;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuestartask.prodcatserv.constants.ProdCatConstants;
import com.nuestartask.prodcatserv.model.Category;

@RestController
@RequestMapping(path = "/categories")
public interface ICategoryService {
	
	@PostMapping(path = "/", consumes = ProdCatConstants.APPLJSON, produces = ProdCatConstants.APPLJSON)
	public ResponseEntity<Object> add(@RequestBody Category category);
	
	@DeleteMapping(path = "/", consumes = ProdCatConstants.APPLJSON, produces = ProdCatConstants.APPLJSON)
	public ResponseEntity<Object> remove(@RequestBody Category category);
	
	@GetMapping(path = "/", produces = ProdCatConstants.APPLJSON)
	public ResponseEntity<List<Category>> list();

}
