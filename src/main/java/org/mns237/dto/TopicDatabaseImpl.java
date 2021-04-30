package org.mns237.dto;

import org.mns237.dao.TopicRepository;
import org.mns237.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicDatabaseImpl  implements TopicsDatabase {
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
