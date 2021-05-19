package org.mns237.service;

import org.mns237.entity.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.mns237.dao.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    public void setCommentRepository( CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comments> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Comments getCommentById(long id) {
        return commentRepository.findById(id).orElse(null);
    }

    @Override
    public Comments saveComments(Comments comments){
        return commentRepository.save(comments);
    }
}
