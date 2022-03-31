package com.richardP.springJpa.courceRegistration.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "course")
public class CourseMaterial {

    @Id
    @SequenceGenerator(
            name = "course_material_sequence",
            sequenceName = "course_material_sequence",
            allocationSize = 5
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_material_sequence"
    )
    private Long courseMaterialId;
    private Long courseNumber;
    private String textBook;
    private String url;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
    )
    private Course course;

}
