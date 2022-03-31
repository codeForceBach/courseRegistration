package com.richardP.springJpa.courceRegistration.repository;

import com.richardP.springJpa.courceRegistration.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
