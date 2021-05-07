package org.mns237.controller;


import org.mns237.dao.PhotosRepository;
import org.mns237.service.PhotosService;
import org.mns237.entity.Photos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PhotosController {

    @Autowired
    private final PhotosService photosService;
    private final PhotosRepository photosRepository;

    public PhotosController(PhotosService photosService, PhotosRepository photosRepository) {
        this.photosService = photosService;
        this.photosRepository = photosRepository;
    }


    @GetMapping("/admin/photos/")
    public List<Photos> getAllPhoto(){ return photosService.getAllPhotos();}
	
    @GetMapping("/admin/photo/id")
    public Photos getPhotoById(long id){ return photosService.getPhotoById(id);}
	
    @PostMapping("/admin/photos/add")
    public void addPhotos(@RequestBody Photos photos){ photosRepository.save(photos);}


}
