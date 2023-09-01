package org.globant.utils.factories;

import org.globant.entities.Course;

public class CourseFactory {

    public static Course createIntroductionToComputerScience() {
        return Course.builder()
                .id(1)
                .name("Introduction to Computer Science")
                .description("Fundamentals of computer science and programming.")
                .build();
    }

    public static Course createHistoryOfArt() {
        return Course.builder()
                .id(2)
                .name("History of Art")
                .description("Exploration of major art movements throughout history.")
                .build();
    }

    public static Course createMathematicsForEngineers() {
        return Course.builder()
                .id(3)
                .name("Mathematics for Engineers")
                .description("Mathematical concepts and techniques relevant to engineering.")
                .build();
    }

    public static Course createIntroductionToPsychology() {
        return Course.builder()
                .id(4)
                .name("Introduction to Psychology")
                .description("Basic principles and theories of psychology.")
                .build();
    }

    public static Course createAdvancedEconomics() {
        return Course.builder()
                .id(5)
                .name("Advanced Economics")
                .description("In-depth study of economic theories and policies.")
                .build();
    }

    public static Course createEnvironmentalScience() {
        return Course.builder()
                .id(6)
                .name("Environmental Science")
                .description("Study of the environment and its impact on society.")
                .build();
    }

    public static Course createCreativeWriting() {
        return Course.builder()
                .id(7)
                .name("Creative Writing")
                .description("Developing creative writing skills and techniques.")
                .build();
    }

    public static Course createChemistryLaboratory() {
        return Course.builder()
                .id(8)
                .name("Chemistry Laboratory")
                .description("Hands-on laboratory work in chemistry.")
                .build();
    }

    public static Course createIntroToBusinessManagement() {
        return Course.builder()
                .id(9)
                .name("Introduction to Business Management")
                .description("Principles of business management and organization.")
                .build();
    }

    public static Course createModernLanguages() {
        return Course.builder()
                .id(10)
                .name("Modern Languages")
                .description("Language courses in French, Spanish, and German.")
                .build();
    }

}
