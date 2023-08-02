package com.user.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long id)
	{
		User user = userservice.getUser(id);
		//http://localhost:9002/contact/user/1313
		List<Contact> list = restTemplate.getForObject("http://CONTACT-SERVICE/contact/user/"+user.getUserId(), List.class);
		user.setContact(list);
		return user;
	}
	/*
	 * @GetMapping("/") public List<Contact> getUser() { List<User> user =
	 * userservice.getUser(); //http://localhost:9002/contact/user/1313
	 * List<Contact> list =
	 * restTemplate.getForObject("http://CONTACT-SERVICE/contact/user/",
	 * List.class);
	 * 
	 * return list; }
	 */
	
}
