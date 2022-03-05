package com.devendrabrain.jpa.pagination.SpringBootJPAPagination.service;

import java.util.List;

import com.devendrabrain.jpa.pagination.SpringBootJPAPagination.entity.User;


public interface UserService {

	public List<User> save(List<User> user);
	public List<User> findAllByFirstName(String name, org.springframework.data.domain.Pageable pageable);
}
