package com.richardP.springJpa.courceRegistration.repository;

import com.richardP.springJpa.courceRegistration.entities.Course;
import com.richardP.springJpa.courceRegistration.entities.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository cmRepository;

    @Test
    public void saveCourseMaterialTest(){
        Course testCourse = Course.builder()
                .courseName("SpringBootJPA")
                .credit(4)
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("http://localhost:8082/springboot/201")
                .course(testCourse)
                .build();

        cmRepository.save(courseMaterial);

    }//end saveCourseMaterialTest

    @Test
    public void printAllCourseMaterialsTest(){
        List<CourseMaterial> allCourseMaterial = cmRepository.findAll();
        System.out.println("course materials : " + allCourseMaterial );
    }

}