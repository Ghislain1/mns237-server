package org.mns237.service;

import org.mns237.entity.Topic;
import org.springframework.http.ResponseEntity;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.DoubleStream;

public interface TopicService {
    public List<Topic> getAllTopics();

    public Topic getBlogById(long id);

    DoubleStream findByBlogId(Long id);

    ResponseEntity<?> deleteBlogs(Topic blog);

    Topic saveBlog(Topic blog);
}
