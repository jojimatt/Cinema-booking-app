package com.jojimatt.cinemabooking.movie.controller;

import com.jojimatt.cinemabooking.dto.MovieDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jojimatt.cinemabooking.movie.service.IMovieService;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")
public class MovieController {

    private final IMovieService movieService;


    @GetMapping(path = "/public")
    public ResponseEntity<List<MovieDto>> getAllCompanies() {
        List<MovieDto> companyList = movieService.getAllMovies();
        // throw new RuntimeException("Exception occurred");
        return ResponseEntity.ok().body(companyList);
    }

}
