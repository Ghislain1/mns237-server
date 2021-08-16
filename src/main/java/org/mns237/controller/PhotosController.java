package org.mns237.controller;


import org.mns237.dao.PhotosRepository;
import org.mns237.entity.Photos;
import org.mns237.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PhotosController {

    @Autowired
    private  PhotoService photoService;
    private final PhotosRepository photosRepository;

    public PhotosController(PhotoService photoService, PhotosRepository photosRepository) {
        this.photoService = photoService;
        this.photosRepository = photosRepository;
    }


    @GetMapping("/admin/photos/")
    public List<Photos> getAllPhoto(){ return photoService.getAllPhotos();}
	
    @GetMapping("/admin/photo/id")
    public Photos getPhotoById(long id){ return photoService.getPhotoById(id);}
    @PostMapping("/admin/photos/add")
    public void addPhotos(@RequestBody Photos photos){ photosRepository.save(photos);}

    // delete photo from server
    @GetMapping("/admin/photos/delete/{id}")
    public String deletePhoto(@PathVariable("id") long id){
        Photos photos = photosRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("invalide Photo id"+ id));
        photosRepository.delete(photos);
        return "you have deleted the photo with id " + id;
    }

    // edit a photo
    @PostMapping("admin/photos/update/{id}")
    public String updatePhotos(@PathVariable("id") long id, Photos photos, BindingResult result){
        if(result.hasErrors()){
            photos.setId(id);
            return "wrong id";
        }
        photosRepository.save(photos);
        return "you have updated the picture with id "+ id;
    }


}
