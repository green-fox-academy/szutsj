package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PictureService {

  @Autowired
  PictureRepository pictureRepository;


}
