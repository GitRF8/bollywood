package com.allstate.repositories;

import com.allstate.entities.Movie;
import org.springframework.data.repository.CrudRepository;

public interface IMovieRepository extends CrudRepository<Movie, Integer>{
    Movie findByTitle(String title);
}
