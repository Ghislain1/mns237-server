package org.mns237.dto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.mns237.dao.SubscribersRepository;
import org.mns237.entity.Subscribers;


@Service
public class SubscribersDatabaseImpl implements SubscribersDatabase {

	@Autowired
	private SubscribersRepository subscribersRepository;


	@Override
	public List<Subscribers> getAllUsers() {
		return subscribersRepository.findAll();
	}

	@Override
	public Subscribers getUserById(long id) {
		return subscribersRepository.findById(id).orElse(null);
	}

}