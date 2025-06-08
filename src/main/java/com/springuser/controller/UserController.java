package com.springuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springuser.models.User;
import com.springuser.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@PostMapping
	public User createUser(@RequestBody User u) {
		System.out.println(u);
		return userservice.createUser(u);
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable String id) {
		return userservice.getUserById(id);
	}
	
	@GetMapping
	public List<User> getHotel(){
		return userservice.getUsers();
		}
	@PostMapping("/all")
	public int createHotelInBatch(@RequestBody List<User> u) {
		for(int i=0;i<u.size();i++) {
			System.out.println(u.get(i));
		}
		return userservice.createUserList(u);
	}
	
	@PutMapping("/hotels")
	public User updateHotel(@RequestBody User u) {
	    return userservice.updateUserDetail(u);
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable String id) {
		return userservice.deleteUser(id);
	}
}
