package org.globant.proofs;

import java.time.LocalDateTime;

import org.globant.entities.Staff;
import org.globant.utils.enums.MaritalStatus;
import org.globant.utils.enums.Section;

public class CreateStaff {

    public static void main(String[] args) {

        Staff staff = new Staff("Ana", "Tapia", "123454321", MaritalStatus.DIVORCED, LocalDateTime.now(), 101, Section.SECRETARY);
        System.out.println(staff);

    }

}
