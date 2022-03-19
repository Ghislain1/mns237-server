package org.mns237.controller;

import java.util.List;

import org.mns237.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import org.mns237.entity.Subscribers;
import org.mns237.dao.SubscribersRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200") // this is the link to the frontend
public class SubscribersController{
	// standard constructors

	@Autowired
	private final SubscribersRepository subscribersRepository;
	@Autowired
	private final SubscriberService subscriberService;

	public SubscribersController(SubscribersRepository subscribersRepository, SubscriberService subscriberService) {
		this.subscribersRepository = subscribersRepository;
		this.subscriberService = subscriberService;
	}
// showing the list of users from the DB
	@GetMapping("/add/abonnement")
	public List<Subscribers> getAllSubscribers(){

		return subscriberService.getAllUsers();
	 }


	 // showing the user with id
	@GetMapping("/admin/abonnement/{id}")
	public Subscribers getUserById(@PathVariable("id") long id){
		return subscriberService.getUserById(id);
	}

	// save subscribers
	@PostMapping("/newsletter")
	public void addSubscribers(@RequestBody Subscribers subscribers) {
		subscribersRepository.save(subscribers);
	}

	// delete subscriber(s)
	@RequestMapping("/admin/abonnement/delete/{id}")
	public String delete(@PathVariable Long id){
		subscriberService.deleteUser(id);
		return "successfully deleted user id number "+ id;
	}

}