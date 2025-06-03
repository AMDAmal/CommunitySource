package com.springfirst.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFirstController {
	@GetMapping("/getHello")
	public String hello() {
		return "hello this is Amul";
	}

}
