package com.devendrabrain.jpa.pagination.SpringBootJPAPagination.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.devendrabrain.jpa.pagination.SpringBootJPAPagination.entity.User;


public interface UserRepository extends PagingAndSortingRepository<User, Long>{

    List<User> findAllByFirstName(String firstName, org.springframework.data.domain.Pageable pageable);
}
