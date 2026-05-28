package com.jojimatt.cinemabooking.dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import java.sql.Date;

public record MovieDto(
        Long id,

        @NotBlank(message = "Title cannot be empty")
        String title,

        @NotBlank(message = "Director can not be empty")
        String director,

        @NotBlank(message = "Genre can not be empty")
        String genre,


        @NotBlank(message = "Website can not be empty")
        String summary,

        @JsonFormat(pattern = "yyyy-MM-dd")
        @NotBlank(message= "Date cannot be empty")
        Date release_date,


        @NotBlank(message= "Language cannot be empty")
        String language)
        {

        }

