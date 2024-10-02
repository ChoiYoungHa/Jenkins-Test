package com.ce.fisa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ProcessController {
	
	@GetMapping("/test")
	public String reqRes() {
		log.info("요청이 들어왔습니다.");
		return "<h1>Kubernetes Load LoadBalancer Test</h1>";
	}
}
