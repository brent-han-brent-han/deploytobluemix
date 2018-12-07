package com.dtb.c;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DtbRestController {

	@RequestMapping("/")
	public String index() {
		return "hello world~!";
	}
}
