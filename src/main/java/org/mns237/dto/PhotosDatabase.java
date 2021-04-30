package org.mns237.dto;

import java.util.List;

import org.mns237.entity.Photos;


public interface PhotosDatabase {
    public List<Photos> getAllPhotos();
    public Photos getPhotoById(long id);
}
