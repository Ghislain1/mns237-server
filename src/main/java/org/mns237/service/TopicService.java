package org.mns237.service;

import org.mns237.entity.Topic;

import java.util.List;

public interface TopicService {
    List<Topic> getAllTopics();

    Topic getBlogById(long id);
}
