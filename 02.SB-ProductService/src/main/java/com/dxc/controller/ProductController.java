package com.dxc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.entity.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

	@GetMapping("/{pid}")
	public ResponseEntity<Product> getProduct(@PathVariable("pid") int pid) {
		Product product = new Product();
		product.setPid(1001);
		product.setPname("Apple 13 Pro");
		product.setPcost(150000);
		
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
}
