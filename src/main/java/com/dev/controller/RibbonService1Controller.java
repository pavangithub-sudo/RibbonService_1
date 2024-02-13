package com.dev.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonService1Controller {
	
	@Value("${server.port}")
	private int port;
	
	@GetMapping("/pay/{price}")
	public String getPrice(@PathVariable int price) {
		return "Ribbon Service with "+price+"runs in port "+port;
	}

}
