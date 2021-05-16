package org.mns237.service;

import org.mns237.entity.Comments;

import java.util.List;

public interface CommentService {
    public List<Comments> getAllComments();
    public Comments getCommentById(long id);
}
