package org.globant.utils.factories;

import org.globant.entities.Student;
import org.globant.utils.enums.MaritalStatus;

public class StudentFactory {

    public static Student createStudentJohnDoe() {
        return Student.builder()
                .name("John")
                .lastname("Doe")
                .document("123456789")
                .maritalStatus(MaritalStatus.SINGLE)
                .course(CourseFactory.createCreativeWriting())
                .build();
    }

    public static Student createStudentJaneSmith() {
        return Student.builder()
                .name("Jane")
                .lastname("Smith")
                .document("987654321")
                .maritalStatus(MaritalStatus.MARRIED)
                .course(CourseFactory.createIntroductionToComputerScience())
                .build();
    }

    public static Student createStudentAliceJohnson() {
        return Student.builder()
                .name("Alice")
                .lastname("Johnson")
                .document("456789123")
                .maritalStatus(MaritalStatus.SINGLE)
                .course(CourseFactory.createMathematicsForEngineers())
                .build();
    }

    public static Student createStudentRobertWilliams() {
        return Student.builder()
                .name("Robert")
                .lastname("Williams")
                .document("111222333")
                .maritalStatus(MaritalStatus.DIVORCED)
                .course(CourseFactory.createHistoryOfArt())
                .build();
    }

    public static Student createStudentEmilyDavis() {
        return Student.builder()
                .name("Emily")
                .lastname("Davis")
                .document("555666777")
                .maritalStatus(MaritalStatus.SINGLE)
                .course(CourseFactory.createEnvironmentalScience())
                .build();
    }

    public static Student createStudentMichaelLee() {
        return Student.builder()
                .name("Michael")
                .lastname("Lee")
                .document("999888777")
                .maritalStatus(MaritalStatus.SINGLE)
                .course(CourseFactory.createAdvancedEconomics())
                .build();
    }

    public static Student createStudentOliviaHall() {
        return Student.builder()
                .name("Olivia")
                .lastname("Hall")
                .document("222333444")
                .maritalStatus(MaritalStatus.MARRIED)
                .course(CourseFactory.createChemistryLaboratory())
                .build();
    }

    public static Student createStudentElijahGarcia() {
        return Student.builder()
                .name("Elijah")
                .lastname("Garcia")
                .document("333444555")
                .maritalStatus(MaritalStatus.SINGLE)
                .course(CourseFactory.createIntroToBusinessManagement())
                .build();
    }

    public static Student createStudentIsabellaJones() {
        return Student.builder()
                .name("Isabella")
                .lastname("Jones")
                .document("777888999")
                .maritalStatus(MaritalStatus.SINGLE)
                .course(CourseFactory.createModernLanguages())
                .build();
    }

}
