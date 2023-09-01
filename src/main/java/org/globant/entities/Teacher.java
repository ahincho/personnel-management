package org.globant.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

import org.globant.utils.enums.Department;
import org.globant.utils.enums.MaritalStatus;

@Getter @Setter @SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends Employee {

    private Department department;

    public Teacher(String name, String lastname, String document, MaritalStatus maritalStatus, LocalDateTime incorporationDate, Integer dispatchNumber, Department department) {
        super(name, lastname, document, maritalStatus, incorporationDate, dispatchNumber);
        this.department = department;
    }

}
