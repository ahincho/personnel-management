package org.globant.proofs;

import org.globant.entities.Course;
import org.globant.entities.Staff;
import org.globant.entities.Student;
import org.globant.entities.Teacher;
import org.globant.utils.factories.CourseFactory;
import org.globant.utils.factories.StaffFactory;
import org.globant.utils.factories.StudentFactory;
import org.globant.utils.factories.TeacherFactory;

public class CreateUniversity {

    public static void main(String[] args) {

        Course course = CourseFactory.createCreativeWriting();
        Student student = StudentFactory.createStudentIsabellaJones();
        Teacher teacher = TeacherFactory.createTeacherLiamGarcia();
        Staff staff = StaffFactory.createStaffDavidBrown();

        System.out.println(course);
        System.out.println(student);
        System.out.println(teacher);
        System.out.println(staff);

    }

}
