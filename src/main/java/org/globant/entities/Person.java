package org.globant.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import org.globant.utils.enums.MaritalStatus;

@Getter @Setter
@ToString @SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private String lastname;
    private String document;
    private MaritalStatus maritalStatus;

}
