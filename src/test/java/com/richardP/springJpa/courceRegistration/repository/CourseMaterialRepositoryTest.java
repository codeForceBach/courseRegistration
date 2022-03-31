package com.richardP.springJpa.courceRegistration.repository;

import com.richardP.springJpa.courceRegistration.entities.Course;
import com.richardP.springJpa.courceRegistration.entities.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository cmRepository;

    @Test
    public void saveCourseMaterial(){
        Course testCourse = Course.builder()
                .courseName("SpringBootJPA")
                .credit(4)
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("http://localhost:8082/courseMaterial")
                .course(testCourse)
                .build();

        cmRepository.save(courseMaterial);

    }

}