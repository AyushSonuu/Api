package com.nunc.fs.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ProductsController {
	@Autowired
	private  ProductsJdbc repo;
	
	@RequestMapping("/products")
	public List<Products> displayProds(){
		
		return  repo.findAll();
				
				
				
				
		
	}
}
