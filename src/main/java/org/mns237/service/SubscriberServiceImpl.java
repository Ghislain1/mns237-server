package org.mns237.service;

import org.mns237.dao.SubscribersRepository;
import org.mns237.entity.Subscribers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriberServiceImpl implements SubscriberService{
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
