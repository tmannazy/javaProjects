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
                    introAndOutroToNextEntry();
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
                    introAndOutroToNextEntry();
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
                    introAndOutroToNextEntry();
                }
            }
            counter++;
        }

        for (int i = 0; i < 65 ; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("%-10s %7s %7s %7s %8s %9s %9s", "STUDENT","SUB1", "SUB2", "SUB3", "TOT", "AVE", "POS");
        System.out.println();
        for (int i = 0; i < 65 ; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.printf("%-10s %7s %7s %7s %8s %9.2f %9s", "Student 1",
                graderReport.getStudentScoreAtSpecifiedIndex(0, 0),
                graderReport.getStudentScoreAtSpecifiedIndex(0, 1),
                graderReport.getStudentScoreAtSpecifiedIndex(0, 2),
                graderReport.getTotalSubjectScoresForAStudent(0),
                graderReport.getAverageSubjectScoresForAStudent(0),
                graderReport.getPosition(0));
        System.out.println();
        System.out.printf("%-10s %7s %7s %7s %8s %9.2f %9s", "Student 2",
                graderReport.getStudentScoreAtSpecifiedIndex(1, 0),
                graderReport.getStudentScoreAtSpecifiedIndex(1, 1),
                graderReport.getStudentScoreAtSpecifiedIndex(1, 2),
                graderReport.getTotalSubjectScoresForAStudent(1),
                graderReport.getAverageSubjectScoresForAStudent(1),
                graderReport.getPosition(1));
        System.out.println();
        System.out.printf("%-10s %7s %7s %7s %8s %9.2f %9s", "Student 3",
                graderReport.getStudentScoreAtSpecifiedIndex(2, 0),
                graderReport.getStudentScoreAtSpecifiedIndex(2, 1),
                graderReport.getStudentScoreAtSpecifiedIndex(2, 2),
                graderReport.getTotalSubjectScoresForAStudent(2),
                graderReport.getAverageSubjectScoresForAStudent(2),
                graderReport.getPosition(2));
        System.out.println();
        for (int i = 0; i < 65 ; i++) {
            System.out.print("=");
        }
        System.out.println();
        for (int i = 0; i < 65 ; i++) {
            System.out.print("=");
        }
    }

    
    

    private static void introAndOutroToNextEntry() {
        for (int i = 0; i < 55; i++) {
            System.out.print(">");
            try {
                TimeUnit.MILLISECONDS.sleep(25);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 55; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 55; j++) {
                System.out.print("<");
            }
            try {
                TimeUnit.MILLISECONDS.sleep(25);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
        System.out.println();
    }
}
