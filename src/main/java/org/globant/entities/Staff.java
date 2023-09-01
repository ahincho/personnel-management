package org.globant.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

import org.globant.utils.enums.MaritalStatus;
import org.globant.utils.enums.Section;

@Getter @Setter @SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Staff extends Employee {

    private Section section;

    public Staff(String name, String lastname, String document, MaritalStatus maritalStatus, LocalDateTime incorporationDate, Integer dispatchNumber, Section section) {
        super(name, lastname, document, maritalStatus, incorporationDate, dispatchNumber);
        this.section = section;
    }

}
