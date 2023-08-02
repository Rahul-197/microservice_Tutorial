package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;
@Service
public class UserServiceImpl implements UserService{

	
	List<User> list = List.of(
			new User(1310L, "dd ti", "12345"),
			new User(1311L, "dd1 ti1", "123451"),
			new User(1312L, "dd2 ti2", "123452"),
			new User(1313L, "dd ti3", "123453")
			);
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(t->t.getUserId().equals(id)).findAny().orElse(null);
	}
	/*
	 * @Override public List<User> getUser() { // TODO Auto-generated method stub
	 * return list; }
	 */

}
