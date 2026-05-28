package com.jojimatt.cinemabooking.dto;
import jakarta.validation.constraints.NotBlank;
import java.sql.Date;

public record MovieDto(
        Long id,

        @NotBlank(message = "Title cannot be empty")
        String title,

        @NotBlank(message = "Language can not be empty")
        String language,

        @NotBlank(message = "Director can not be empty")
        String director,

        @NotBlank(message = "Genre can not be empty")
        String genre,


        @NotBlank(message = "Website can not be empty")
        String summary,

        @NotBlank(message= "Date cannot be empty")
        Date releaseDate,
        @NotBlank(message= "Langugae cannot be empty")
        String movieLanguage)
        {

        }

