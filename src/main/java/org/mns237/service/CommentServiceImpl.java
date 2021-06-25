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
        return (List<Comments>) commentRepository.findAll();
    }



    @Override
    public Comments saveComments(Comments comments){
        return commentRepository.save(comments);
    }


    @Override
    public Comments findCommentsById(Long Id) {
        return commentRepository.findCommentsById(Id).orElse(null);
    }
}
