package org.globant.proofs;

import org.globant.entities.Course;
import org.globant.entities.Student;
import org.globant.utils.enums.MaritalStatus;

public class CreateStudent {

    public static void main(String[] args) {

        Course course = new Course(1, "Introduction to Computer Science", "Basics in Computer Science");
        Student student = new Student("Fabiola", "Tapara", "987654321", MaritalStatus.SINGLE, course);
        System.out.println(student);

    }

}
