package com.workintech.s17challenge.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse {
    private Course course;
    private int totalGps;

}
