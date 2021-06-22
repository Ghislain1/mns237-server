package org.mns237.service;

import org.mns237.entity.Topic;

import java.util.List;

public interface TopicService {
    public List<Topic> getAllTopics();

    public Topic getBlogById(long id);

}
