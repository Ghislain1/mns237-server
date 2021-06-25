package org.mns237.dao;

import org.mns237.entity.Items;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface VideosRepository extends CrudRepository<Items, Long> {
   // @Query(value = "SELECT * FROM videos v, comments c Where c.id = (SELECT comments_id FROM items LIMIT 1)", nativeQuery=true)
    List<Items> findAll();

    @Override
    Optional<Items> findById(Long id);

}
