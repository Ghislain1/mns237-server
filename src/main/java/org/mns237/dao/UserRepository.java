package org.mns237.dao;

import org.mns237.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<Users, Long> {
	Users findByEmail(String email);
	List<Users> findAll(); //here i list all users  from the database;
}