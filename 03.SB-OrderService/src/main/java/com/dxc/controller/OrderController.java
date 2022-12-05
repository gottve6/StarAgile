package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.dxc.entity.Order;
import com.dxc.entity.Product;
import com.dxc.response.ResponseData;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private WebClient.Builder webclient;

	@GetMapping("/{orderId}")
	public ResponseEntity<ResponseData> getOrder(@PathVariable("orderId") int orderId) {

		ResponseData responseData = new ResponseData();

		Order order = new Order();
		order.setOrderId(111);
		order.setPid(1001);

		responseData.setOrder(order);

		int product_Id = order.getPid();

		/*
		 * RestTemplate restTemplate = new RestTemplate(); String URL =
		 * "http://localhost:9091/product/{pid}"; ResponseEntity<Product> data=
		 * restTemplate.getForEntity(URL, Product.class, product_Id);
		 * if(data.getStatusCodeValue()==200) {
		 * 
		 * Product prod = data.getBody(); responseData.setProduct(prod); }
		 * 
		 * 
		 * responseData.setOrder(order);
		 */

		Product productDetails = webclient.build()
				.get()
				.uri("http://localhost:9091/product/" + product_Id)
				.retrieve()
				.bodyToMono(Product.class).block();
		
		responseData.setProduct(productDetails);

		return new ResponseEntity<ResponseData>(responseData, HttpStatus.OK);

	}
}
