package org.globant.proofs;

import org.globant.entities.Teacher;
import org.globant.utils.enums.Department;
import org.globant.utils.enums.MaritalStatus;

import java.time.LocalDateTime;

public class CreateTeacher {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Danny", "Apaza", "123456789", MaritalStatus.MARRIED, LocalDateTime.now(), 1, Department.PHYSICS);
        System.out.println(teacher);

    }

}
