package org.mns237.service;

import org.mns237.entity.Subscribers;

import java.util.List;

public interface SubscriberService {
    Subscribers getUserById(long id);

    List<Subscribers> getAllUsers();
}
