package com.splitngo.backend.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TripDetailDTO {

    // trip
    private Integer id;
    private String title;
    private String description;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private LocalDateTime createdAt;
    private String createdBy;
    private boolean isActive;


}
