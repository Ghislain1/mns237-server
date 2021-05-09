package org.mns237.service;

import org.mns237.entity.Photos;

import java.util.List;

public interface PhotosService {
    Photos getPhotoById(long id);

    List<Photos> getAllPhotos();

}
