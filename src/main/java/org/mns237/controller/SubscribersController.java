package org.mns237.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.*;

import org.mns237.entity.Subscribers;
import org.mns237.dao.SubscribersRepository;
import org.mns237.dto.SubscribersDatabase;


@RestController
@CrossOrigin(origins = "http://localhost:4200") // this is the link to the frontend
public class SubscribersController{
	// standard constructors

	@Autowired
	private final SubscribersRepository subscribersRepository;
	private final SubscribersDatabase subscribersDatabase;

	public SubscribersController(SubscribersRepository subscribersRepository, SubscribersDatabase subscribersDatabase) {
		this.subscribersRepository = subscribersRepository;
		this.subscribersDatabase = subscribersDatabase;
	}
// showing the list of users from the DB
	@GetMapping("/admin/abonnement")
	public List<Subscribers> getAllSubscribers(){
	 	return subscribersDatabase.getAllUsers();
	 }


	 // showing the user with id
	@GetMapping("/admin/abonnement/{id}")
	public Subscribers getUserById(@PathVariable("id") long id){
		return subscribersDatabase.getUserById(id);
	}

	// save subscribers
	@PostMapping("/newsletter")
	public void addSubscribers(@RequestBody Subscribers subscribers) {
		subscribersRepository.save(subscribers);
	}

}