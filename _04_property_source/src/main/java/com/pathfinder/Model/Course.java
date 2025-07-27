package com.pathfinder.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ToString
@Data
@Component    //steriotype annotation
@PropertySource("classpath:application.properties") //to read properties file
public class Course {

//    @Value("1")
    @Value("${id1}") // to read from properties file
    private int id;

    @Value("${courseName1}")
    private String courseName;

    @Value("${courseDescription1}")
    private String courseDescription;

    @Value("${coursePrice1}")
    private String coursePrice;
}
