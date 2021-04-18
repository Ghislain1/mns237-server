package org.mns237.dao;

import org.mns237.entity.Subscribers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SubscribersRepository extends CrudRepository<Subscribers, Long> {
    List<Subscribers>findAll(); // here i list all the users found in the data base
    Optional<Subscribers> findById(Long id);// here i list users found in the database according to their id
}
