package org.mns237.service;

import org.mns237.entity.Photos;

import java.util.List;

public interface PhotoService {
    public List<Photos> getAllPhotos();
    public Photos getPhotoById(long id);
}
