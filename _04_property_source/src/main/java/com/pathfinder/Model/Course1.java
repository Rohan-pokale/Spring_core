package com.pathfinder.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@ToString
@PropertySource("classpath:application.properties") //to read properties file
public class Course1 {

    //    @Value("1")
    @Value("${id2}") // to read from properties file
    private int id;

    @Value("${courseName2}")
    private String courseName;

    @Value("${courseDescription2}")
    private String courseDescription;

    @Value("${coursePrice2}")
    private String coursePrice;
}
