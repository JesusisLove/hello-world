 package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickInController {
	@RequestMapping("/quickin")
	@ResponseBody
	public String quickIn() {
		return "Hello Bezal! God bless! 😊";
	}
}
