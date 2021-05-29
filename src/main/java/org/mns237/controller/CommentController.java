package org.mns237.controller;


import org.mns237.dao.CommentRepository;
import org.mns237.entity.Comments;
import org.mns237.entity.Topic;
import org.mns237.service.CommentService;
import org.mns237.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.reactive.WebFluxLinkBuilder.methodOn;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class CommentController {
    @Autowired
    CommentRepository commentRepository;

    @Autowired
    CommentService commentService;

    @Autowired
    TopicService topicService;

    @GetMapping("/comment/id")
    EntityModel<Comments> one(@PathVariable Long id) {

        Comments comments = commentRepository.findById(id).get(); //


        return EntityModel.of(comments, //
                linkTo(methodOn(CommentController.class).one(id)).withSelfRel(),
                linkTo(methodOn(CommentController.class).all()).withRel("comments"));
    }

    @GetMapping("/comments")
    public CollectionModel<EntityModel<Comments>> all(){
        List<EntityModel<Comments>> comments = commentService.getAllComments().stream()
                .map(user -> EntityModel.of(user,
                        linkTo(methodOn(CommentController.class).one(user.getId())).withSelfRel(),
                        linkTo(methodOn(CommentController.class).all()).withRel("Comments")))
                        .collect(Collectors.toList());
        return CollectionModel.of(comments, linkTo(methodOn(CommentController.class).all()).withSelfRel());
    }

    @GetMapping("/blogs/comments/{topicId}")
    public List<Comments> getAllComments(@PathVariable(value="topicId") Long topic_id){
        return commentRepository.findAllByTopicId(topic_id);
    }

    @GetMapping(value = "/blogs/comments/{topicId}/comment")
    public Comments getAllCommentsByTopicId(Long topicId, Model model){
        model.addAttribute(commentRepository.findAllByTopicId(topicId));
        model.addAttribute("topic_id", topicService.findByBlogId(topicId));
        return (Comments) model;
    }

    @PostMapping("/blogs/{topicId}/comments")
    public Comments  addComments(@PathVariable (value="topicId") Long topicId, Topic blog, @Validated @RequestBody Comments comments){
        topicService.findByBlogId(topicId);
        comments.setTopic(blog);
        return commentService.saveComments(comments);
    }


}
