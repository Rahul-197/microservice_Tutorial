package com.contact.contact_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> list = List.of(
			new Contact(1L, "dd@em0", "ddNm0", 1310L),
			new Contact(2L, "dd@em1", "ddNm1", 1311L),
			new Contact(3L, "dd@em2", "ddNm2", 1313L),
			new Contact(4L, "dd@em3", "ddNm3", 1313L)
			);
	
	
	@Override
	public List<Contact> getContactOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(t->t.getUserId().equals(userId)).collect(Collectors.toList());
	}

	/*
	 * @Override public List<Contact> getContactOfUser() { // TODO Auto-generated
	 * method stub return list; }
	 */
}
