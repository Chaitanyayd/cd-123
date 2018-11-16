package com.cg.TechForum_160631.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.TechForum_160631.service.ITechForumService;

@Controller
public class MyController {
		
		@Autowired
		ITechForumService techforumservice;
		
		@RequestMapping(value="all",method=RequestMethod.GET)
		public String getAll() {
			System.out.println("in my controller returning home");
			return "home";
		}
		
		@RequestMapping(value="search", method=RequestMethod.GET)
		public String searchIdC(@Valid@ModelAttribute("my") @RequestParam("queryId") int id ){
			techforumservice.searchId(id);
			return null;
		}
}
