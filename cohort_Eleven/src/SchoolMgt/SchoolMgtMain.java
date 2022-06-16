package SchoolMgt;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class SchoolMgtMain {
    static Scanner scanner = new Scanner(System.in);
    static School school;
    static Student student;

    public static void main(String... args) throws Exception {
        school = new School("Everlasting");
        int sentinel = -1;
        String star = "*";
        System.out.printf("""
                %s
                     Welcome To Your School Manager
                %s%n""", star.repeat(40), star.repeat(40));
        schoolMainMenu(sentinel);
    }

    private static void schoolMainMenu(int sentinel) throws Exception {
        System.out.print("""
                1 -> Admins Page
                2 -> Students Page
                0 -> Exit App
                -> """);
        while (sentinel != 0) {
            int userResponse = Integer.parseInt(scanner.nextLine());
            if (userResponse == 0) sentinel = 0;
            else {
                switch (userResponse) {
                    case 1 -> adminsPage();
                    case 2 -> studentsPage();
                }
            }
        }
    }

    private static void studentsPage() throws Exception {
        System.out.print("\nEnter your student ID: ");
        String userID = scanner.nextLine();
        Student verifiedStudent = school.verifyStudent(userID);
        studentSubmenu(verifiedStudent);
    }

    private static void studentSubmenu(Student verifiedStudent) throws Exception {
        System.out.println("""
                                
                1 -> Select courses
                2 -> View courses offered
                3 -> Remove a course
                0 -> Main menu
                """);
        int userResponse = Integer.parseInt(scanner.nextLine());
        switch (userResponse) {
            case 1 -> {
                try {
                    getSchoolCourses();
                    System.out.print("\nEnter the course code you want to add: ");
                    String studentCourseSelection = scanner.nextLine();
                    try {
                        verifiedStudent.selectCourse(studentCourseSelection);
                        System.out.println("Course successfully added");
                    } catch (IllegalArgumentException err) {
                        System.out.println(err.getMessage());
                    }
                } catch (Exception err) {
                    System.out.println(err.getMessage());
                }
                studentSubmenu(verifiedStudent);
            }
            case 2 -> {
                for (Course course : verifiedStudent.getAllRegisteredCourses()) {
                    String courseName = course.getCourseName();
                    String courseId = course.getCourseCode();
                    System.out.printf("""
                            Course Name: %s
                            Course Code: %s
                            """, courseName, courseId);
                }
                studentSubmenu(verifiedStudent);
            }
            case 3 ->
            case 0 -> schoolMainMenu(-1);
        }
    }

    private static void adminsPage() throws Exception {
        System.out.println();
        System.out.println("""
                1 -> Admit new student
                2 -> Create a new course
                3 -> View course list
                4 -> View list of all students
                5 -> Expel a student
                6 -> Course student list
                0 -> Main menu
                """);
        int userResponse = Integer.parseInt(scanner.nextLine());
        switch (userResponse) {
            case 1 -> {
                String gender = "";
                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();
                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();
                System.out.print("""
                        Choose your gender:
                        1 -> MALE
                        2 -> FEMALE
                        """);
                int genderChoice = Integer.parseInt(scanner.nextLine());
                if (genderChoice == 1) gender = String.valueOf(Gender.MALE);
                else gender = String.valueOf(Gender.FEMALE);
                System.out.print("Enter day of birth: ");
                int day = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter month of birth: ");
                int month = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter year of birth: ");
                int year = Integer.parseInt(scanner.nextLine());
                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.of(year, month, day);
                Period getAgeDifference = Period.between(birthday, today);
                int dayOfBirth = getAgeDifference.getYears();
                school.admitStudent(firstName, lastName, gender, dayOfBirth);
                System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase() + " successfully created.");
                adminsPage();
            }
            case 2 -> {
                System.out.print("Enter course name: ");
                String courseName = scanner.nextLine();
                System.out.print("Enter course code: ");
                String courseID = scanner.nextLine();
                System.out.println("""
                        Choose course activation status
                        1 -> True
                        2 -> False
                        """);
                int status = Integer.parseInt(scanner.nextLine());
                boolean courseStatus;
                if (status == 1) courseStatus = true;
                else courseStatus = false;
                school.createCourse(courseName, courseID, courseStatus);
                adminsPage();
            }
            case 3 -> {
                try {
                    getSchoolCourses();
                } catch (Exception err) {
                    System.out.println(err.getMessage());
                }
                adminsPage();
            }
            case 4 -> {
                System.out.println(school.getNameOfSchool() +
                                   " Learning Institute has " + school.getListOfStudents() + " student(s)");
                System.out.println();
                getSchoolStudentList();
                adminsPage();
            }
            case 5 -> {
                getSchoolStudentList();
                System.out.println("Which StudentID to expel? ");
                String id = scanner.nextLine();
                try {
                    System.out.println(school.getStudentName(id) + " has been expelled from " +
                                       school.getNameOfSchool() + " school");
                    school.deleteStudentRecord(id);
                } catch (Exception err) {
                    System.out.println(err.getMessage());
                }
                adminsPage();
            }
            case 0 -> schoolMainMenu(-1);
        }
    }

    private static void getSchoolStudentList() {
        for (Student student : school.getDataOfStudents()) {
            String studentName = student.getStudentName();
            String studentID = student.getStudentID();
            System.out.printf("""
                    Student name: %s
                    Student ID: %s
                                                
                    """, studentName.toUpperCase(), studentID.toUpperCase());
        }
    }

    private static void getSchoolCourses() throws Exception {
        for (Course course : School.returnCourses()) {
            String courseName = course.getCourseName();
            String courseId = course.getCourseCode();
            System.out.printf("""
                    Course Name: %s
                    Course Code: %s
                    """, courseName, courseId);
        }
    }
}
