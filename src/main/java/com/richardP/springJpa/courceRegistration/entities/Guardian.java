package com.richardP.springJpa.courceRegistration.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({
        @AttributeOverride(
                name = "firstName",
                column = @Column(name = "guardian_first_name")
        ),
        @AttributeOverride(
            name = "lastName",
            column = @Column(name = "guardianlast_name")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "guardian_email")
        ),
        @AttributeOverride(
                name = "phoneNumber",
                column = @Column(name = "guardian_phone_number")
        )}
)
public class Guardian {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}