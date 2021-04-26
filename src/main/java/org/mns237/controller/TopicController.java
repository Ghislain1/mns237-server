package org.mns237.controller;


import org.mns237.dao.TopicRepository;
import org.mns237.dao.CommentRepository;
import org.mns237.dto.TopicsDatabase;
import org.mns237.entity.Comments;
import org.mns237.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class TopicController {
    @Autowired
    private final TopicRepository topicRepository;
    private final TopicsDatabase topicsDatabase;
    private final CommentRepository commentRepository;


    public TopicController(TopicRepository topicRepository, CommentRepository commentRepository, TopicsDatabase topicsDatabase) {
        this.topicRepository = topicRepository;
        this.commentRepository = commentRepository;
        this.topicsDatabase = topicsDatabase;
    }

    // get all blogs from DB
    @GetMapping("/blogs")
    public List<Topic> getAllBlogs(){
        return topicsDatabase.getAllTopics();
    }

    //Get blogs from the DB according to id
    public Topic getTopicById(@PathVariable("id") long id){
        return topicsDatabase.getBlogById(id);
    }

    //save blog in DB
    @PostMapping("/admin/blogs/add")
    public void addBlog(@RequestBody Topic blog){
        topicRepository.save(blog);
    }
    // save Comments in DB
    @PostMapping("/Comments/blog")
    public void addComment(@RequestBody Comments comments){
        commentRepository.save(comments);
    }
    // delete blog from DB
    // edit blog from DB
}
