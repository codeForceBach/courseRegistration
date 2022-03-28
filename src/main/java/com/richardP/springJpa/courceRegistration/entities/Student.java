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
                columnNames = {"e-mail", "user_name"},
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
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "st_sequence")
    //@Column(name = "st_id", nullable = false)
    private Long studentId;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "e_mail")
    private String eMail;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;

    private String guardian;
    private String guardianEmail;
    private String guardianPhoneNumber;
    //private Address address;
    //private Guardian guardian;

}
