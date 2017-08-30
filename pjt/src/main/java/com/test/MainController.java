package com.test;

import com.test.User;
import com.test.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	@Autowired
	private UserDao userDao;
	
	@GetMapping("/")
	public String mainPage(){
		return "index";
	}
	
	@PostMapping("/user")
	public String userAdd(User user){
		System.out.println(user);
		userDao.insert(user);
		return "redirect:/user";		
	}
	
	@GetMapping("/user")
	public String userlistPage(Model model){
		model.addAttribute("users", userDao.listForBeanPropertyRowMapper());
		return "/userlist";
	}
/*	@GetMapping("/user")
	public String userlistPage(Model model){
		model.addAttribute("user", userDao.listForBeanPropertyRowMapper());
		return "/userlist";
	}*/
}
