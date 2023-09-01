package org.globant.utils.factories;

import java.time.LocalDateTime;

import org.globant.entities.Staff;
import org.globant.utils.enums.MaritalStatus;
import org.globant.utils.enums.Section;

public class StaffFactory {

    public static Staff createStaffMaryJohnson() {
        return Staff.builder()
                .name("Mary")
                .lastname("Johnson")
                .document("1234567890")
                .maritalStatus(MaritalStatus.SINGLE)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(201)
                .section(Section.LIBRARY)
                .build();
    }

    public static Staff createStaffRobertSmith() {
        return Staff.builder()
                .name("Robert")
                .lastname("Smith")
                .document("9876543210")
                .maritalStatus(MaritalStatus.MARRIED)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(202)
                .section(Section.DEAN_OFFICE)
                .build();
    }

    public static Staff createStaffLindaWilliams() {
        return Staff.builder()
                .name("Linda")
                .lastname("Williams")
                .document("2345678901")
                .maritalStatus(MaritalStatus.SINGLE)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(203)
                .section(Section.SECRETARY)
                .build();
    }

    public static Staff createStaffJohnDoe() {
        return Staff.builder()
                .name("John")
                .lastname("Doe")
                .document("3456789012")
                .maritalStatus(MaritalStatus.MARRIED)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(204)
                .section(Section.ADMISSIONS)
                .build();
    }

    public static Staff createStaffAliceSmith() {
        return Staff.builder()
                .name("Alice")
                .lastname("Smith")
                .document("4567890123")
                .maritalStatus(MaritalStatus.SINGLE)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(205)
                .section(Section.FINANCE)
                .build();
    }

    public static Staff createStaffDavidBrown() {
        return Staff.builder()
                .name("David")
                .lastname("Brown")
                .document("5678901234")
                .maritalStatus(MaritalStatus.SINGLE)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(206)
                .section(Section.ACADEMIC_AFFAIRS)
                .build();
    }

    public static Staff createStaffEmmaWilson() {
        return Staff.builder()
                .name("Emma")
                .lastname("Wilson")
                .document("6789012345")
                .maritalStatus(MaritalStatus.MARRIED)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(207)
                .section(Section.STUDENT_SERVICES)
                .build();
    }

    public static Staff createStaffJamesLee() {
        return Staff.builder()
                .name("James")
                .lastname("Lee")
                .document("7890123456")
                .maritalStatus(MaritalStatus.SINGLE)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(208)
                .section(Section.IT_SERVICES)
                .build();
    }

    public static Staff createStaffSophiaGarcia() {
        return Staff.builder()
                .name("Sophia")
                .lastname("Garcia")
                .document("8901234567")
                .maritalStatus(MaritalStatus.SINGLE)
                .incorporationDate(LocalDateTime.now())
                .dispatchNumber(209)
                .section(Section.FACULTY)
                .build();
    }

}
