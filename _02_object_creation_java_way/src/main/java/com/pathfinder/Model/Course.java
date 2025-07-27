package com.pathfinder.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
public class Course {
    private int id;
    private String courseName;
    private String courseDescription;
    private String coursePrice;
}
