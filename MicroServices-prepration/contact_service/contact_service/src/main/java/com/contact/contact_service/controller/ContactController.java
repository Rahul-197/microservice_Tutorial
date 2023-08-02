package com.contact.contact_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.contact_service.entity.Contact;
import com.contact.contact_service.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/user/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long id){
		return this.contactService.getContactOfUser(id);
	}
	/*
	 * @RequestMapping("/user") public List<Contact> getContacts(){ return
	 * this.contactService.getContactOfUser(); }
	 * 
	 * @PostMapping("/api/post") public String handlePostRequest(@RequestBody String
	 * requestBody) { // Process the request body (you can deserialize it into an
	 * object using JSON libraries) // In this example, we'll just return the
	 * received data as the response. return "Received POST request with body: " +
	 * requestBody; }
	 */
}