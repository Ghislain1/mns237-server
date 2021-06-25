package org.mns237.service;

import org.mns237.entity.Subscribers;

import java.util.List;

public interface SubscriberService {

    public List<Subscribers> getAllUsers();
    public Subscribers getUserById(long id);
    public void deleteSubscriber(long id);
    public  void deleteAllSubscribers();

}
