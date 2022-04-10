package org.mns237.controller;


import org.mns237.dao.CommentRepository;
import org.mns237.entity.Comments;
import org.mns237.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@CrossOrigin(origins = "https://idrice24.github.io")
@RequestMapping("/api")
public class CommentController {
    @Autowired
    CommentRepository commentRepository;
    CommentService commentService;

    @GetMapping("/comment/id")
    EntityModel<Comments> one(@PathVariable Long id) {

        Comments comments = commentRepository.findById(id).get(); //


        return EntityModel.of(comments, //
                linkTo(methodOn(CommentController.class).one(id)).withSelfRel(),
                linkTo(methodOn(CommentController.class).all()).withRel("comments"));
    }

    @GetMapping("/comments")
    public CollectionModel<EntityModel<Comments>> all(){
        List<EntityModel<Comments>> comments = commentRepository.findAll().stream()
                .map(user -> EntityModel.of(user,
                        linkTo(methodOn(CommentController.class).one(user.getId())).withSelfRel(),
                        linkTo(methodOn(CommentController.class).all()).withRel("Comments")))
                        .collect(Collectors.toList());
        return CollectionModel.of(comments, linkTo(methodOn(CommentController.class).all()).withSelfRel());
    }


    @GetMapping("/admin/comment/")
    public List<Comments> getAllComments(){
        return commentService.getAllComments();
    }

    @GetMapping("/admin/comment/id")
    public Comments getCommentById(@PathVariable("id") long id){ return commentService.getCommentById(id);}

}
