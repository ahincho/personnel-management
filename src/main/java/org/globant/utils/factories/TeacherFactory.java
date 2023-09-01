package org.globant.utils.factories;

import org.globant.entities.Teacher;
import org.globant.utils.enums.Department;
import org.globant.utils.enums.MaritalStatus;

import java.time.LocalDateTime;

public class TeacherFactory {

    public static Teacher createTeacherJohnSmith() {
        return Teacher.builder()
                .name("John")
                .lastname("Smith")
                .document("1234567890")
                .maritalStatus(MaritalStatus.SINGLE)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(101)
                .department(Department.LANGUAGE)
                .build();
    }

    public static Teacher createTeacherAliceJohnson() {
        return Teacher.builder()
                .name("Alice")
                .lastname("Johnson")
                .document("9876543210")
                .maritalStatus(MaritalStatus.MARRIED)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(102)
                .department(Department.MATHEMATICS)
                .build();
    }

    public static Teacher createTeacherDavidBrown() {
        return Teacher.builder()
                .name("David")
                .lastname("Brown")
                .document("2345678901")
                .maritalStatus(MaritalStatus.SINGLE)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(103)
                .department(Department.ARCHITECTURE)
                .build();
    }

    public static Teacher createTeacherEmmaWilson() {
        return Teacher.builder()
                .name("Emma")
                .lastname("Wilson")
                .document("3456789012")
                .maritalStatus(MaritalStatus.MARRIED)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(104)
                .department(Department.HISTORY)
                .build();
    }

    public static Teacher createTeacherJamesLee() {
        return Teacher.builder()
                .name("James")
                .lastname("Lee")
                .document("4567890123")
                .maritalStatus(MaritalStatus.SINGLE)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(105)
                .department(Department.ECONOMICS)
                .build();
    }

    public static Teacher createTeacherSophiaGarcia() {
        return Teacher.builder()
                .name("Sophia")
                .lastname("Garcia")
                .document("5678901234")
                .maritalStatus(MaritalStatus.SINGLE)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(106)
                .department(Department.COMPUTER_SCIENCE)
                .build();
    }

    public static Teacher createTeacherElijahMartinez() {
        return Teacher.builder()
                .name("Elijah")
                .lastname("Martinez")
                .document("6789012345")
                .maritalStatus(MaritalStatus.MARRIED)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(107)
                .department(Department.CHEMISTRY)
                .build();
    }

    public static Teacher createTeacherAvaHall() {
        return Teacher.builder()
                .name("Ava")
                .lastname("Hall")
                .document("7890123456")
                .maritalStatus(MaritalStatus.SINGLE)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(108)
                .department(Department.BIOLOGY)
                .build();
    }

    public static Teacher createTeacherLiamGarcia() {
        return Teacher.builder()
                .name("Liam")
                .lastname("Garcia")
                .document("8901234567")
                .maritalStatus(MaritalStatus.MARRIED)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(109)
                .department(Department.PSYCHOLOGY)
                .build();
    }

}
