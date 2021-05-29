package org.mns237.service;

import java.util.List;
import org.mns237.entity.Comments;

public interface CommentService {

    List<Comments> getAllComments();
    Comments findCommentsById(Long Id);


    Comments saveComments(Comments comments);


}
