package com.ha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ha.exception.UserNotFoundException;

@RestController
public class TestController {

	@GetMapping(path = "test")
	public String getStr() {
//		return "Hello world";
		throw UserNotFoundException.createWith("ddd");
	}
}
