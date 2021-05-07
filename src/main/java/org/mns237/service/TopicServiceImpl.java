package org.mns237.service;

import org.mns237.dao.TopicRepository;
import org.mns237.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicRepository topicRepository;


    @Override
    public List<Topic> getAllTopics() {

        return topicRepository.findAll();
    }

    @Override
    public Topic getBlogById(long id) {
        return topicRepository.findById(id).orElse(null);
    }
}
