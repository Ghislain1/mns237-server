package org.mns237.dao;

import org.mns237.entity.Comments;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends CrudRepository<Comments, Long> {
    List<Comments> findAll();
    Optional<Comments>findById(Long id);


}
