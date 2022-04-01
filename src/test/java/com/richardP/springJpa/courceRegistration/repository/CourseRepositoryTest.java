package com.richardP.springJpa.courceRegistration.repository;

import com.richardP.springJpa.courceRegistration.entities.Address;
import com.richardP.springJpa.courceRegistration.entities.Course;
import com.richardP.springJpa.courceRegistration.entities.Student;
import com.richardP.springJpa.courceRegistration.entities.Teacher;
import org.apache.catalina.Session;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

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

    }//end saveCourseWithTeacherTest

    @Test
    public void findAllPageNationCourseTest(){
        //https://www.baeldung.com/hibernate-initialize-proxy-exception
        Pageable firstPageWithThreeRecord = PageRequest.of(0, 3);
        Pageable secondPageWithTwoRecord = PageRequest.of(1, 2);

        List<Course> courses = courseRepository
                .findAll(firstPageWithThreeRecord)
                .getContent();
        Long totalElement = courseRepository.findAll(firstPageWithThreeRecord)
                .getTotalElements();

        int totalPage = courseRepository.findAll(firstPageWithThreeRecord)
                .getTotalPages();

        System.out.println("First Page Course : " + courses);
        System.out.println("first course total element : " + totalElement);
        System.out.println("First Course total page: " + totalPage);

        /*
        List<Course> courses2 = courseRepository
                .findAll(secondPageWithTwoRecord)
                .getContent();
        Long totalElement2 = courseRepository.findAll(secondPageWithTwoRecord)
                .getTotalElements();

        int totalPage2 = courseRepository.findAll(secondPageWithTwoRecord)
                .getTotalPages();

        System.out.println("Second Page Course : " + courses2);
        System.out.println("Second course total element : " + totalElement2);
        System.out.println("Second Course total page: " + totalPage2);

         */

    }//end

    @Test
    public void saveCourseWithStudentAndTeacher(){
        java.sql.Date testDate = new java.sql.Date(2001-10-23);

        Student testStudent = Student.builder()
                .firstName("Docker")
                .lastName("Images")
                .eMail("docker.images@gmail.com")
                .userName("dockerCLI")
                .dateOfBirth(testDate)
                .phoneNumber("506-548-9945")
                .password("passcode")
                .build();

        Address teachAddMany = Address.builder()
                .street("1194 Meridian Ave")
                .city("Shoreline")
                .state("MI")
                .country("U.S.A")
                .postalCode("92004")
                .build();

        Teacher testTeacher2 = Teacher.builder()
                .firstName("Jose")
                .lastName("Laten")
                .eMail("jose.laten@spirngboot.edu")
                .phoneNumber("772-114-3338")
                .address(teachAddMany)
                .build();

        Course testCourseMany = Course.builder()
                .courseName("Kubenete")
                .credit(3)
                .teacher(testTeacher2)
                .build();

        testCourseMany.addStudent(testStudent);
        courseRepository.save(testCourseMany);
    }

}