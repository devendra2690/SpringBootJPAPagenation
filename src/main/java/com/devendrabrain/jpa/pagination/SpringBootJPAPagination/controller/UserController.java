package com.devendrabrain.jpa.pagination.SpringBootJPAPagination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devendrabrain.jpa.pagination.SpringBootJPAPagination.entity.User;
import com.devendrabrain.jpa.pagination.SpringBootJPAPagination.service.UserService;


@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/save/user")
	public List<User> saveUser(@RequestBody List<User> user) {

		return userService.save(user);
	}

	@GetMapping("/findAll/{name}/from/{pageFrom}/to/{pageTo}")
	public List<User> findAll(@PathVariable("name") String name, @PathVariable("pageFrom") Integer pageFrom, @PathVariable("pageTo") Integer pageTo) {

		org.springframework.data.domain.Pageable pageable = PageRequest.of(pageFrom,pageTo, Sort.by("userId").descending());
		
		return userService.findAllByFirstName(name, pageable);
	}
}
