package com.richardP.springJpa.courceRegistration.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({
        @AttributeOverride(
                name = "street",
                column = @Column(name = "street")
        ),
        @AttributeOverride(
                name = "city",
                column = @Column(name = "city")
        ),
        @AttributeOverride(
                name = "state",
                column = @Column(name = "state")
        ),
        @AttributeOverride(
                name = "country",
                column = @Column(name = "country")
        ),
        @AttributeOverride(
                name = "postalCode",
                column = @Column(name = "postal_code")
        ),
})
public class Address {

    private String street;
    private String city;
    private String state;
    private String country;
    private String postalCode;
}
