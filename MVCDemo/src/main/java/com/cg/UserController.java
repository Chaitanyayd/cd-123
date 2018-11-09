package com.cg;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Scope("session")
@Controller
@RequestMapping(value = "user")
public class UserController {

	@RequestMapping(value = "/showLogin")
	public String prepareLogin(Model model)
	{
		System.out.println("In prepareLogin() method");
		model.addAttribute("login", new Login());
		return "Login";
	}
	
	@RequestMapping(value = "/checkLogin")
	public ModelAndView checkLogin(@ModelAttribute("login") Login l)
	{
		return new ModelAndView("loginSuccess","username",l.getUserName());
	}

	@RequestMapping(value="/showRegister")
	public String prepareRegister(Model model)
	{
		model.addAttribute("user", new User());
		return "register";
	}
}
