package com.springrest.springrest.controller;

import com.springrest.springrest.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.CourseService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private CourseService courseService;

    public MyController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }

    //get the course
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();
    }
}
