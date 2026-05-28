package com.jojimatt.cinemabooking.movie.service.impl;
import com.jojimatt.cinemabooking.movie.service.IMovieService;
import com.jojimatt.cinemabooking.dto.MovieDto;
import com.jojimatt.cinemabooking.entity.Movie;
import com.jojimatt.cinemabooking.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements IMovieService {

    private final MovieRepository movieRepository;

    @Override
    public List<MovieDto> getAllMovies() {
        List<Movie> movieList =movieRepository.findAll();
        return movieList.stream().map(this::transformMovieToDto).collect(Collectors.toList());
    }

    private MovieDto transformMovieToDto(Movie movie) {

    return new MovieDto(movie.getId(),movie.getTitle(),movie.getDirector(),movie.getGenre(),movie.getSummary(),movie.getReleaseDate(),movie.getMovieLanguage());
    }

}
