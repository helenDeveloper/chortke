package com.cert.chortke.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cert.chortke.entities.UserEntity;
import com.cert.chortke.service.UserRepository;

@RestController
@RequestMapping("/")
public class UserController {

	private UserRepository userRepository;

	@Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;

	}

	@RequestMapping(value = "/api/userlist", method = RequestMethod.GET)
	public List<UserEntity> getUsers() {

		List<UserEntity> userList = userRepository.findAll();

		if (userList != null)
			return userList;
		return new ArrayList<UserEntity>();

	}

	@RequestMapping(value = "/api/saveUser", method = RequestMethod.POST)
	public Long saveOrUpdate(@PathVariable("user") UserEntity user) {

		UserEntity result = userRepository.save(user);
		if (result != null)
			return result.getId();
		return null;
	}

	@RequestMapping(value = "/{username}", method = RequestMethod.GET)
	public String getUserList(@PathVariable("username") String username,
			Model model) {

		List<UserEntity> userList = userRepository.findByUsername(username);

		if (userList != null)
			model.addAttribute("users", userList);

		return "userList";

	}

}
