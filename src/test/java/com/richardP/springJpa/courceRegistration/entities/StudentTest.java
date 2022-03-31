package com.richardP.springJpa.courceRegistration.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

//@DataJpaTest
class StudentTest {

    private EntityManager entityManager;

    /*
    the setFirstName() method conflict with @Data annotation in the Student Entity result test failed.
     */
    @Test
    @DisplayName("https://www.baeldung.com/jpa-strategies-when-set-primary-key")
    public void sequenceStratagy_whenPersist_then_ReturnPrimaryKey(){
        Student testStudent = new Student();
        testStudent.setFirstName("Testard");

        entityManager.getTransaction().begin();
        entityManager.persist(testStudent);
        Long expectPrimaryKey = 10l;
        assertEquals(expectPrimaryKey, testStudent.getStudentId());

        entityManager.getTransaction().commit();
    }

}