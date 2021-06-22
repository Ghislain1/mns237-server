package org.mns237.service;

import org.mns237.dao.PhotosRepository;
import org.mns237.entity.Photos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhotoServiceImpl implements PhotoService {
    @Autowired
    private PhotosRepository photosRepository;

    @Override
    public List<Photos> getAllPhotos() { return photosRepository.findAll(); }

    @Override
    public Photos getPhotoById(long id){ return photosRepository.findPhotoById(id).orElse(null);}

}
