package com.example.demo.datasource;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Movie.movie;

import java.util.List;

public interface movieListRepository extends JpaRepository<movie,Long>  {
 
    List<movie>findMovieByActor(String name); 
}
