package org.mns237.controller;


import org.mns237.dao.TopicRepository;
import org.mns237.dao.CommentRepository;

import org.mns237.entity.Comments;
import org.mns237.entity.Topic;
import org.mns237.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
        this.topicService = topicService;
        this.commentRepository = commentRepository;
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
        topicRepository.save(blog);
    }
    // save Comments in DB
    @PostMapping("/comments/blog")
    public void addComment(@RequestBody Comments comments){
        commentRepository.save(comments);
    }

    // edit product from DB
    @GetMapping("admin/topics/edit/{id}")
    public String showUpdate(@PathVariable("id") long id){
        try {
            Topic topics = topicService.getBlogById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "you are editing the blog with id : "+ id+"........";
    }

    // update blog from db
    @PostMapping("/admin/blogs/update/{id}")
    public String updateTopic(@PathVariable("id") long id, Topic topics, BindingResult result, Model model){
        if (result.hasErrors()){
            topics.setId(id);
            return "wrong id";
        }
        topicRepository.save(topics);
        model.addAttribute("topics", topicRepository.findAll());
        return "you have update the topic with id "+ id;
    }
    // delete blog from DB

    
}
