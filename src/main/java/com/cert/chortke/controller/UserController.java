package com.cert.chortke.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cert.chortke.entities.UserEntity;
import com.cert.chortke.service.UserRepository;

@Controller
@RequestMapping("/")
public class UserController {

	private UserRepository userRepository;

	@Autowired
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;

	}

	@RequestMapping(value = "/{username}", method = RequestMethod.GET)
	public String getUserList(@PathVariable("username") String username, Model model) {

		List<UserEntity> userList = userRepository.findByUsername(username);

		if (userList != null)
			model.addAttribute("users", userList);

		return "userList";

	}

}
