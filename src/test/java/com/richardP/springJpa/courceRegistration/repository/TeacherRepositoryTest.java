package com.richardP.springJpa.courceRegistration.repository;

import com.richardP.springJpa.courceRegistration.entities.Address;
import com.richardP.springJpa.courceRegistration.entities.Course;
import com.richardP.springJpa.courceRegistration.entities.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacherTest(){

        Address teachAdd = Address.builder()
                .street("117 Ave Roosevelt BLUD")
                .city("Uklane")
                .state("UT")
                .country("U.S.A")
                .postalCode("97347")
                .build();

        Course springCourse = Course.builder()
                .courseName("springJPA")
                .credit(4)
                .build();

        Course reactCourse = Course.builder()
                .courseName("ReactCamp")
                .credit(3)
                .build();

        List<Course> testCourses = new ArrayList<>();
        testCourses.add(springCourse);
        testCourses.add(reactCourse);

        Teacher testTeacher = Teacher.builder()
                .firstName("javaEight")
                .lastName("Master")
                .eMail("java.master@spirngboot.edu")
                .phoneNumber("775-234-9238")
                .address(teachAdd)
                //.courses(testCourses)
                .build();

        teacherRepository.save(testTeacher);

        assertEquals("java.master@spirngboot.edu", testTeacher.getEMail());
    }

}