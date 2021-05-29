package org.mns237.service;

import org.mns237.dao.TopicRepository;
import org.mns237.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.DoubleStream;

@Service
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

    @Override
    public DoubleStream findByBlogId(Long id) {
        return (DoubleStream) topicRepository.findById(id).orElse(null);
    }

    @Override
    public ResponseEntity<?> deleteBlogs(Topic blog) {
        topicRepository.delete(blog);

        return null;
    }

    @Override
    public Topic saveBlog(Topic blog) {
        return topicRepository.save(blog);
    }
}
