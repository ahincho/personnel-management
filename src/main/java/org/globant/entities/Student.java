package org.globant.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import org.globant.utils.enums.MaritalStatus;

@Getter @Setter @SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person {

    private Course course;

    public Student(String name, String lastname, String document, MaritalStatus maritalStatus, Course course) {
        super(name, lastname, document, maritalStatus);
        this.course = course;
    }

}
