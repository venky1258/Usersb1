package com.mypack;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {
	@Autowired  
	UserService userservice1; 
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Going home...");
		return "index";
	}
	
	@GetMapping("/register")
	public String showForm(Model model) {
		User user = new User();
		//user.setName("Na");
		model.addAttribute("user", user);
		
		List<String> professionList = 
		Arrays.asList("Developer", "Designer", "Tester", "Architect","CEO","TeamLead");
		model.addAttribute("professionList", professionList);
		
		return "register_form";
	}
	
	@PostMapping("/register2")
	public String submitForm(@ModelAttribute("user") User user) {
		System.out.println(user);
		userservice1.saveOrUpdate(user);  
		return "register_success";
	}
	@GetMapping("/user/{uid}")  //http://localhost:8080/user/1
	private String getUser(@PathVariable("uid") int uid,Model model)   
	{  
		User user=userservice1.getUsersById(uid);
		model.addAttribute("user", user);
		return "register_show";
		
	}
	@GetMapping("/users")
	private String getUsers(Model  model)   
	{  
		List<User> users=userservice1.getUsers();
		model.addAttribute("users", users);
		System.out.println(users);
		return "register_show3";
		
	}
	 
	/*
	public String showUser(@ModelAttribute("user") User u) {
		
		ModelAndView obj = new ModelAndView();;
	    obj.addAttribute("user" , u);
	    obj.setViewName("viewName");
		System.out.println(u);
		return "register_show";
	}*/
	
	
}
