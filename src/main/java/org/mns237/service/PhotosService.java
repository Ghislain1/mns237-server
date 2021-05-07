package org.mns237.service;

import org.mns237.entity.Photos;

import java.util.List;

public interface PhotosService {
  public  Photos getPhotoById(long id);

  public  List<Photos> getAllPhotos();

}
