package com.devendrabrain.jpa.pagination.SpringBootJPAPagination.dao;

import java.util.List;

import com.devendrabrain.jpa.pagination.SpringBootJPAPagination.entity.User;


public interface UserDAO {

	public List<User> save(List<User> user);

	public List<User> findByUserName(String name, org.springframework.data.domain.Pageable pageable);
}
