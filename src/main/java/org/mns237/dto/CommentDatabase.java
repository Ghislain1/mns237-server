package org.mns237.dto;

import org.mns237.entity.Comments;

import java.util.List;

public interface CommentDatabase {
    public List<Comments> getAllComments();
    public Comments getCommentById(long id);
}
