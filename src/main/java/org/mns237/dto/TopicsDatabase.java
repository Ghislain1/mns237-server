package org.mns237.dto;

import org.mns237.entity.Topic;

import java.util.List;

public interface TopicsDatabase {
    public List<Topic> getAllTopics();

    public Topic getBlogById(long id);
}
