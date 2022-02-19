package services;

import com.springrest.springrest.entity.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(125,"JavaCoreCourse", "This course contains basics of Java"));
        list.add(new Course(395,"SpringBootCourse", "Basics of SpringBoot"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }
}
