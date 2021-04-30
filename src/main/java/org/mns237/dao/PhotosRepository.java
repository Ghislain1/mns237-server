package org.mns237.dao;

import org.mns237.entity.Photos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PhotosRepository extends CrudRepository<Photos, Long> {
    List<Photos> findAll();
    Optional<Photos> findPhotoById(long id);
}
