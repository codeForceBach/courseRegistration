package com.richardP.springJpa.courceRegistration.repository;

import com.richardP.springJpa.courceRegistration.entities.Address;
import com.richardP.springJpa.courceRegistration.entities.Course;
import com.richardP.springJpa.courceRegistration.entities.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.AttributeOverride;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void showAllCoursesTest(){
        List<Course> courses = courseRepository.findAll();
        System.out.println("courses : " + courses);
    }

    @Test
    public void saveCourseWithTeacherTest(){

        Address teachAdd = Address.builder()
                .street("117 Ave Roosevelt BLUD")
                .city("Uklane")
                .state("UT")
                .country("U.S.A")
                .postalCode("97347")
                .build();

        Teacher testTeacher2 = Teacher.builder()
                .firstName("Scriptor")
                .lastName("June")
                .eMail("java.june@spirngboot.edu")
                .phoneNumber("425-234-3338")
                .address(teachAdd)
                .build();

        Course testCourse = Course.builder()
                .courseName("javascript")
                .credit(3)
                .teacher(testTeacher2)
                .build();

        courseRepository.save(testCourse);

    }

}