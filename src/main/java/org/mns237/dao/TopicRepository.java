package org.mns237.dao;

import org.mns237.entity.Topic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TopicRepository extends CrudRepository<Topic, Long> {
    @Query(value ="SELECT * FROM topic t, comments c WHERE c.topic_id = t.id ", nativeQuery=true)
    List<Topic> findAll();
    Optional<Topic>findById(long id);
}
