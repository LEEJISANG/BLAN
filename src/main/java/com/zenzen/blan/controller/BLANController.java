package com.zenzen.blan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BLANController {
	
	// 단순 이동
	@RequestMapping(value = { "/", "index.do" }, method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	// 메인페이지 이동
	@RequestMapping(value = "main.do", method = RequestMethod.GET)
	public String main() {
		return "main/main";
	}

}
