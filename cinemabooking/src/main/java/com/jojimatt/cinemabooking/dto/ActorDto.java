package com.jojimatt.cinemabooking.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record ActorDto(Long id,
                       @NotBlank(message = "Name cannot be empty")
                       String name,

                       @Min(value = 1, message = "Age must be minimum 1")
                       Integer age,

                       @NotBlank(message = "Industry cannot be null")
                       String industry) {
}
