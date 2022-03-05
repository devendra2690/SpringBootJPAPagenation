package com.devendrabrain.jpa.pagination.SpringBootJPAPagination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devendrabrain.jpa.pagination.SpringBootJPAPagination.dao.UserDAO;
import com.devendrabrain.jpa.pagination.SpringBootJPAPagination.entity.User;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;
	
	@Override
	public List<User> save(List<User> user) {
		return userDAO.save(user);
	}

	@Override
	public List<User> findAllByFirstName(String name, org.springframework.data.domain.Pageable pageable) {
		return userDAO.findByUserName(name, pageable);
	}

}
