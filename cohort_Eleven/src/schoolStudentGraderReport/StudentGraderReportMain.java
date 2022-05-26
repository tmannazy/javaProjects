package schoolStudentGraderReport;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StudentGraderReportMain {
    public static void main(String... args) {
        StudentGraderReport graderReport = new StudentGraderReport(3, 3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("THIS PROGRAM CALCULATES STUDENT SCORES FROM 3 STUDENTS");
        int counter = 0;
        int studentCount = 0;
        int subjectCount = 0;
        System.out.printf("Enter Student %d score for Subject %d: ", studentCount + 1, subjectCount + 1);
        int userResponse = Integer.parseInt(scanner.nextLine());

        while (counter < 9) {
            switch (counter) {
                case 0 -> {
                    graderReport.addStudentScore(userResponse, 0, 0);
                    subjectCount++;
                }
                case 1 -> {
                    System.out.printf("Enter Student %d score for Subject %d: ", studentCount + 1, subjectCount + 1);
                    userResponse = Integer.parseInt(scanner.nextLine());
                    graderReport.addStudentScore(userResponse, 0, 1);
                    subjectCount++;
                }
                case 2 -> {
                    System.out.printf("Enter Student %d score for Subject %d: ", studentCount + 1, subjectCount + 1);
                    userResponse = Integer.parseInt(scanner.nextLine());
                    graderReport.addStudentScore(userResponse, 0, 2);
                    graderReport.saveFinalStudentRecord(0);
                    subjectCount = 0;
                    studentCount = 1;
                    graderReport.introAndOutroToNextEntry();
                }
                case 3 -> {
                    System.out.printf("Enter Student %d score for Subject %d: ", studentCount + 1, subjectCount + 1);
                    userResponse = Integer.parseInt(scanner.nextLine());
                    graderReport.addStudentScore(userResponse, 1, 0);
                    subjectCount++;
                }
                case 4 -> {
                    System.out.printf("Enter Student %d score for Subject %d: ", studentCount + 1, subjectCount + 1);
                    userResponse = Integer.parseInt(scanner.nextLine());
                    graderReport.addStudentScore(userResponse, 1, 1);
                    subjectCount++;
                }
                case 5 -> {
                    System.out.printf("Enter Student %d score for Subject %d: ", studentCount + 1, subjectCount + 1);
                    userResponse = Integer.parseInt(scanner.nextLine());
                    graderReport.addStudentScore(userResponse, 1, 2);
                    graderReport.saveFinalStudentRecord(1);
                    subjectCount = 0;
                    studentCount = 2;
                    graderReport.introAndOutroToNextEntry();
                }
                case 6 -> {
                    System.out.printf("Enter Student %d score for Subject %d: ", studentCount + 1, subjectCount + 1);
                    userResponse = Integer.parseInt(scanner.nextLine());
                    graderReport.addStudentScore(userResponse, 2, 0);
                    subjectCount++;
                }
                case 7 -> {
                    System.out.printf("Enter Student %d score for Subject %d: ", studentCount + 1, subjectCount + 1);
                    userResponse = Integer.parseInt(scanner.nextLine());
                    graderReport.addStudentScore(userResponse, 2, 1);
                    subjectCount++;
                }
                case 8 -> {
                    System.out.printf("Enter Student %d score for Subject %d: ", studentCount + 1, subjectCount + 1);
                    userResponse = Integer.parseInt(scanner.nextLine());
                    graderReport.addStudentScore(userResponse, 2, 2);
                    graderReport.saveFinalStudentRecord(2);
                    subjectCount = 0;
                    studentCount = 3;
                    graderReport.introAndOutroToNextEntry();
                }
            }
            counter++;
        }
        graderReport.studentsTabularRecord(graderReport);
        graderReport.subjectSummary("Subject 1", 0);
    }
}
