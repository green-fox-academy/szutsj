package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Picture;
import com.greenfoxacademy.reddit.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PictureService {

  @Autowired
  PictureRepository pictureRepository;

  public void save(Picture picture){
    pictureRepository.save(picture);
  }
}
