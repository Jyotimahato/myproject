package com.star.agile.assignment.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {
	
	@RequestMapping("/")
	public ModelAndView get() {
		ModelAndView m = new ModelAndView();
		m.setViewName("index.html");
		return m;
	}
	
	@GetMapping("/get")
	public String getStr() {
		return "hjfjgfjygf";
	}

}
