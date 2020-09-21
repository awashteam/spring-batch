package com.awashpro.springbatch.repository;

import com.awashpro.springbatch.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

	void save(List<? extends User> users);
}
