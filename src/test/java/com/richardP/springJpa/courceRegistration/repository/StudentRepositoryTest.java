package com.richardP.springJpa.courceRegistration.repository;

import com.richardP.springJpa.courceRegistration.entities.Address;
import com.richardP.springJpa.courceRegistration.entities.Guardian;
import com.richardP.springJpa.courceRegistration.entities.Student;
import org.apache.logging.log4j.util.PropertySource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository stRepository;

    @Test
    public void saveStudentTest(){
        java.sql.Date testDate = new java.sql.Date(2001-10-23);

        Student testStudent = Student.builder()
                .firstName("Testad")
                .lastName("Spring")
                .eMail("test.spring@gmail.com")
                .userName("testSpirng")
                .dateOfBirth(testDate)
                .phoneNumber("206-345-9878")
                .password("passcode")
                //.guardianFirstName()
                //.guardianlastName()
                //.guardianEmail()
               //.guardianPhoneNumber()
                .build();

        stRepository.save(testStudent);
        assertEquals("Testad", testStudent.getFirstName());

    }//and saveStudent test

    @Test
    public void saveStudent_Embedded_Address_Gaurdian_Test(){

        Address testAddress = Address.builder()
                .street("13455 117th Bldv SW")
                .city("Mongomery")
                .state("WA")
                .country("U.S.A")
                .build();

        Guardian testGuardian = Guardian.builder()
                .email("test.guardian@gmail.com")
                .phoneNumber("456-394 7458")
                .firstName("guardian")
                .lastName("Spring")
                .build();

        java.sql.Date testDate = new java.sql.Date(2001-10-23);

        Student testStudent2 = Student.builder()
                .firstName("Testad")
                .lastName("Spring")
                .eMail("test.spring@gmail.com")
                .userName("testSpirng")
                .dateOfBirth(testDate)
                .phoneNumber("206-345-9878")
                .password("passcode")
                .guardian(testGuardian)
                .address(testAddress)
                .build();

        stRepository.save(testStudent2);
        assertEquals("test.guardian@gmail.com",testGuardian.getEmail());

    }// saveStudent_Embedded_Address_Gaurdian_Test



    @Test
    public void validateFindAllStudentNotNullTest(){
        List<Student> studentList = stRepository.findAll();
        assertNotNull(studentList);

    }//end validateFindAllStudentNotNullTest

}