package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private OffsetDateTime dateOccurred;
    private String message;

}
