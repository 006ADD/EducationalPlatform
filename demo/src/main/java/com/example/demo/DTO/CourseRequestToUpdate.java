package com.example.demo.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CourseRequestToUpdate {
    @NotBlank(message = "Course author has to be filled")
    @NotEmpty(message = "The author of the course should not be empty")
    private String author;
    @NotBlank(message = "Course title has to be filled")
    @NotEmpty(message = "The title should not be empty")
    private String title;

}
