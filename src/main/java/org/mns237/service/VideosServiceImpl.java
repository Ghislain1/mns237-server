package org.mns237.service;

import org.mns237.dao.VideosRepository;
import org.mns237.entity.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideosServiceImpl implements VideosService {
    @Autowired
    private VideosRepository videosRepository;

    @Override
    public List<Items> getAllVideos() {
        return videosRepository.findAll();
    }
}
