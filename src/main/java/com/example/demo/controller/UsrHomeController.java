package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {
	private int cnt;
	
	public UsrHomeController() {
		cnt = -1;
	}
	
	@RequestMapping("/usr/home/getCount")
	@ResponseBody
	public int getCount() {
		return cnt;
	}	
	
	@RequestMapping("/usr/home/doSetCount")
	@ResponseBody
	public String doSetCount(int cnt) {
		this.cnt = cnt;
		return "count의 값이" +this.cnt+ "으로 초기화 되었습니다.";
	}
		
}

