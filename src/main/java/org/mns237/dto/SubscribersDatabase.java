package org.mns237.dto;

import java.util.List;

import org.mns237.entity.Subscribers;

public interface SubscribersDatabase {
	
	//@Transactional
	public List<Subscribers> getAllUsers();
	public Subscribers getUserById(long id);
	
	
}
