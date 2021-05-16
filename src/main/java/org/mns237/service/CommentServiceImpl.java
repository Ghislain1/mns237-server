package org.mns237.service;

import org.mns237.dao.CommentRepository;
import org.mns237.entity.Comments;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Override
    public List<Comments> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Comments getCommentById(long id) {
        return commentRepository.findById(id).orElse(null);
    }
}
