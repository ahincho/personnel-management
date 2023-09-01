# Faculty Management System

This project is a Java console application designed to manage information about individuals associated with a faculty, classified into three main types: students, professors, and support staff. The application allows performing operations such as changing a person's marital status, reassigning offices, enrolling students in courses, changing departments, transferring support staff to different sections, and displaying all information for each type of individual.

## Requirements

- Java 17
- Maven
- Lombok (for automatic generation of getters, setters, and constructors)

## Project Structure

The project is organized into classes representing different types of individuals associated with the faculty, following a class hierarchy:

- `Person`: Base class that stores common information for all individuals (name, last name, identification number, and marital status).
- `Employee`: Class representing faculty employees, extending `Person`. It contains specific employee information, such as the year of incorporation and office number.
- `Student`: Class representing students, extending `Person`. It stores information about the course they are enrolled in.
- `Professor`: Class representing professors, extending `Employee`. It includes details about the department they belong to.
- `Staff`: Class representing support staff, extending `Employee`. It stores the section they are assigned to.

## Features

The application offers the following features:

1. Changing a person's marital status.
2. Reassigning an office to an employee.
3. Enrolling a student in a new course.
4. Changing a professor's department.
5. Transferring a support staff member to a different section.
6. Printing all information for each type of individual.

## Test Program

The project includes a test program that creates instances of sample individuals and performs operations to demonstrate the implemented functionalities.

## Execution

To run the application, make sure you have Java 17 and Maven installed on your system. Then, follow these steps:

1. Clone or download this repository to your machine.
2. Open a terminal and navigate to the project's root directory.
3. Compile the project with Maven by running the following command:

  ```
  mvn compile

  ```


4. Execute the application with the following command:

- To run `CreateCourse`:

  ```
  mvn exec:java -Dexec.mainClass="org.globant.proofs.CreateCourse"
  ```

- To run `CreateStaff`:
  
  ```
  mvn exec:java -Dexec.mainClass="org.globant.proofs.CreateStaff"
  ```

- To run `CreateStudent`:
  
  ```
  mvn exec:java -Dexec.mainClass="org.globant.proofs.CreateStudent"
  ```

- To run `CreateTeacher`:
  
  ```
  mvn exec:java -Dexec.mainClass="org.globant.proofs.CreateTeacher"
  ```

- To run `CreateUniversity`:
  
  ```
  mvn exec:java -Dexec.mainClass="org.globant.proofs.CreateUniversity"
  ```

## Contribution

If you would like to contribute to this project or make improvements, please feel free to fork the repository, make your changes, and submit a pull request. Your contributions are welcome!
