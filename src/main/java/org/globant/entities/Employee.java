package org.globant.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

import org.globant.utils.enums.MaritalStatus;

@Getter @Setter @SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends Person {

    private LocalDateTime incorporationDate;
    private Integer dispatchNumber;

    public Employee(String name, String lastname, String document, MaritalStatus maritalStatus, LocalDateTime incorporationDate, Integer dispatchNumber) {
        super(name, lastname, document, maritalStatus);
        this.incorporationDate = incorporationDate;
        this.dispatchNumber = dispatchNumber;
    }

}
