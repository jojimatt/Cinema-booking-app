package com.jojimatt.cinemabooking.movie.service;

import com.jojimatt.cinemabooking.dto.MovieDto;
import com.jojimatt.cinemabooking.entity.Movie;

import java.util.List;

public interface IMovieService {

    List<MovieDto> getAllMovies();


}