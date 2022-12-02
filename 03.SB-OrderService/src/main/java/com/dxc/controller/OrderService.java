package com.dxc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderService {

	@GetMapping("/order")
	public String getOrder() {
		return "order placed";
	}
}
