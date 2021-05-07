package org.mns237.service;

import org.mns237.dao.PhotosRepository;
import org.mns237.entity.Photos;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PhotosServiceImpl implements PhotosService {
    @Autowired
    private PhotosRepository photosRepository;

    @Override
    public List<Photos> getAllPhotos() { return photosRepository.findAll(); }

    @Override
    public Photos getPhotoById(long id){ return photosRepository.findPhotoById(id).orElse(null);}
}
