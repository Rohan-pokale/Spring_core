package com.pathfinder.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
@ToString
public class Course1 {

    @Value("2")
    private int id;
    @Value("Python Programming")
    private String courseName;
    @Value("Learn Python from scratch")
    private String courseDescription;
    @Value("25000")
    private String coursePrice;
}
