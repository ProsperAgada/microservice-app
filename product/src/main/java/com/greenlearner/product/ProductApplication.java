package com.greenlearner.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @RestController
// @RequestMapping("/")
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
	// @GetMapping("/")
	// public String Index(){
	// 	return "Welcome";
	// }

}
