package com.chatly.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.chatly.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> getByEmail(String email);

	@Query(nativeQuery = true, value = "SELECT * FROM userContacts "
			+ "WHERE userId = :userId AND contactId = :contactId") // Validar o oposto  OR email LIKE '%:source%'") 
	Optional<Object> findByUserIdAndContactId(Long userId, Long contactId);

	Iterable<User> findByEmail(String email);
	
	Iterable<User> findByName(String name);

	//Iterable<User> findByMessage(String message);
	
	@Query(nativeQuery = true, value = "SELECT * FROM user WHERE name LIKE ':src'") 
	Iterable<User> findBySource(String src);
}
