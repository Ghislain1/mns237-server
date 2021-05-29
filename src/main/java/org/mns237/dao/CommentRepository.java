package org.mns237.dao;

import org.mns237.entity.Comments;
import org.mns237.entity.Topic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import java.util.List;
import java.util.Optional;

public interface CommentRepository extends CrudRepository<Comments, Long> {

    @Query(value="select * from comments ", nativeQuery = true)

    List<Comments> findAllByTopicId(@Param("topic_id") Long topic_id);
    Optional<Comments> findCommentsById(Long TopicId);

    //List<Comments> commentsBlog(@Param("topicId") long topicId);

}
