package com.devdnp.code;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devdnp.code.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


	@Query("SELECT u FROM User u WHERE u.email = ?1")
	public User findByEmail(String email);



	
}
