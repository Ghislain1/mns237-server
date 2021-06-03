package org.mns237.service;

import java.util.List;
import org.mns237.entity.Comments;

public interface CommentService {
    public List<Comments> getAllComments();
    public Comments getCommentById(long id);

    Comments saveComments(Comments comments);
}
