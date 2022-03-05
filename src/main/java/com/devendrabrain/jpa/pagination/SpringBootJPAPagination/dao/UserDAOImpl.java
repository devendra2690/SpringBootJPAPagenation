package com.devendrabrain.jpa.pagination.SpringBootJPAPagination.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.devendrabrain.jpa.pagination.SpringBootJPAPagination.entity.User;
import com.devendrabrain.jpa.pagination.SpringBootJPAPagination.repository.UserRepository;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> save(List<User> user) {
		
	    return (List<User>) userRepository.saveAll(user);
	}

	@Override
	public List<User> findByUserName(String name, Pageable pageable) {
		return userRepository.findAllByFirstName(name, pageable);
	}

}
