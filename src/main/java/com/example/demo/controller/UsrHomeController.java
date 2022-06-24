package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {
	@RequestMapping("/usr/home/main")
	@ResponseBody
	public String ShowMain() {
		return "안녕하세요.";
	}	
	
	@RequestMapping("/usr/home/main2")
	@ResponseBody
	public String ShowMain2() {
		return "점심 감사합니다.";
	}	
	
	@RequestMapping("/usr/home/main3")
	@ResponseBody
	public String ShowMain3() {
		return "또 만나요.";
	}	
}

