package com.workintech.s17challenge.entity;

import lombok.Data;

@Data
public class Course {
    private int id;
    private String name;
    private int credit;
    private Grade grade;
}
