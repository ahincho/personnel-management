package org.globant.entities;

import lombok.*;

@Getter @Setter
@ToString @Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private Integer id;
    private String name;
    private String description;

}
