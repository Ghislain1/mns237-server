package org.mns237.dto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.mns237.entity.Subscribers;
import org.mns237.dao.SubscribersRepository;

public interface SubscribersDatabase {
	
	//@Transactional
	public List<Subscribers> getAllUsers();
	public Subscribers getUserById(long id);
	
	
}
