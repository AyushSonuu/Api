package com.nunc.fs.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runnerr implements CommandLineRunner{
	
	@Autowired
	private  ProductsJdbc repo;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println(repo.findAll());
	}
	
}
