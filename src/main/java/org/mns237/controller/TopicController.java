package org.mns237.controller;


import org.mns237.dao.CommentRepository;
import org.mns237.dao.TopicRepository;

import org.mns237.entity.Comments;
import org.mns237.entity.Topic;
import org.mns237.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class TopicController {
    @Autowired
    private final TopicRepository topicRepository;
    private final TopicService topicService;
    private final CommentRepository commentRepository;


    public TopicController(TopicRepository topicRepository, CommentRepository commentRepository, TopicService topicService) {
        this.topicRepository = topicRepository;
        this.commentRepository = commentRepository;
        this.topicService = topicService;
    }

    // get all blogs from DB
    @GetMapping("/blogs")
    public List<Topic> getAllBlogs(){
        return topicService.getAllTopics();
    }

    //Get blogs from the DB according to id
    public Topic getTopicById(@PathVariable("id") long id){
        return topicService.getBlogById(id);
    }

    //save blog in DB
    @PostMapping("/admin/blogs/add")
    public void addBlog(@RequestBody Topic blog){
        topicService.saveBlog(blog);
    }

    // save Comments in DB
    @PutMapping("blogs/{topicId}")
    public Topic updateBlog(@RequestBody Topic blog){
        return topicService.saveBlog(blog);
        }

    @DeleteMapping("/blog/delete/{topicId}")
    public ResponseEntity<?> deleteBlog(@PathVariable Long topicId, Topic blog){
        topicService.getBlogById(topicId);
            return topicService.deleteBlogs(blog);
    }


    
}
