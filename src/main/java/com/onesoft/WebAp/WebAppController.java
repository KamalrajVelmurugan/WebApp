package com.onesoft.WebAp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {
	
	@GetMapping("getDocker")
	public String getDoc() {
		return "Welcome To docker Hosting in Aws ";
	}
}
