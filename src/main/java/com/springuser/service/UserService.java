package com.springuser.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springuser.exceptions.ResourceNotFoundException;
import com.springuser.models.User;
import com.springuser.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userrepo;
	
	//creating single user
	public User createUser(User u) {
		u.setUser_Id(UUID.randomUUID().toString());
		return userrepo.save(u);
	}
	
	//creating list of users
	public int createUserList(List<User> u) {
		for(User user : u) {
			user.setUser_Id(UUID.randomUUID().toString());
		}
		userrepo.saveAll(u);
		return u.size();
	}
	
	//Displaying all users
	public List<User> getUsers(){
		return userrepo.findAll();
	}
	
	//Display data by using ID
	public User getUserById(String id) {
		return userrepo.findById(id).orElseThrow(() -> new ResourceNotFoundException());
		
	}
	
	//Updating user by ID
	public User updateUserDetail(User u) {
		User user= userrepo.findById(u.getUser_Id()).orElseThrow(() -> new ResourceNotFoundException());
		user.setUser_Name(u.getUser_Name());
		return userrepo.save(user);
	}
	
	//Deleting user by ID
	public String deleteUser(String id) {
		userrepo.delete(userrepo.findById(id).orElseThrow(() -> new ResourceNotFoundException()));
		return "User Deleted with id :"+id;
	}
	
	
}
