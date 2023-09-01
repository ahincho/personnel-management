package org.globant.proofs;

import org.globant.entities.Course;

public class CreateCourse {

    public static void main(String[] args) {

        Course course = new Course(1, "Introduction to Computer Science", "Basics in Computer Science");
        System.out.println(course);

    }

}
