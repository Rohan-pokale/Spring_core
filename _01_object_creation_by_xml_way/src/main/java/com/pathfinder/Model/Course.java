package com.pathfinder.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Course {
    private int id;
    private String courseName;
    private String courseDescription;
    private String coursePrice;
}
