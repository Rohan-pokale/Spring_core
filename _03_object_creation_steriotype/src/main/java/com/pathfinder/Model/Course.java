package com.pathfinder.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Data
@Component    //steriotype annotation
public class Course {

    @Value("1")
    private int id;

    @Value("Java Programming")
    private String courseName;

    @Value("Learn Java from scratch")
    private String courseDescription;

    @Value("20000")
    private String coursePrice;
}
