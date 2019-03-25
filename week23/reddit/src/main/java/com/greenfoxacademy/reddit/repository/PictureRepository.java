package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Picture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends CrudRepository<Picture, Long> {
}
