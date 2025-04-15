package com.splitngo.backend.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TripDTODetail {

    // trip
    private int id;
    private String title;
    private String description;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private LocalDateTime createdAt;
    private String createdBy;
    private boolean isActive;

    /*
    // user_trip
    private List<Object> members;

    // activity
    private List<Object> activities;

     // expenses
     private List<Object> expenses;
    */
}
