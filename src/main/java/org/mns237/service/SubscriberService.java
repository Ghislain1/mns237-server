package org.mns237.service;

import org.mns237.entity.Subscribers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubscriberService {

     List<Subscribers> getAllUsers();
     Subscribers getUserById(long id);

    void deleteUser(long id);
}
