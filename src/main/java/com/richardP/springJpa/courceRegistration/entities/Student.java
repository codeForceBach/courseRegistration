package com.richardP.springJpa.courceRegistration.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "students",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"email", "user_name"},
                name = "uniqueEmailUserName"
        )
)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    @Id
    @SequenceGenerator(name = "st_sequence", sequenceName = "st_sequence", allocationSize = 1)
    //more on check out --> https://www.baeldung.com/jpa-strategies-when-set-primary-key
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "st_sequence")
    //@Column(name = "student_id", nullable = false)
    private Long studentId;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email", nullable = false)
    private String eMail;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(name = "password")
    private String password;

    @Embedded
    private Address address;
/*
    private String street;
    private String city;
    private String state;
    private String country;
    private String postalCode;

 */
    @Embedded
    private Guardian guardian;
    /*
    private String guardianFirstName;
    private String guardianlastName;
    private String guardianEmail;
    private String guardianPhoneNumber;

     */




}
