package com.cert.chortke;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

	@RequestMapping("/")
	public String sayHi() {

		return "hi";

	}

}
