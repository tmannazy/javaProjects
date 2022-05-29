package schoolStudentGraderReport;

import java.util.concurrent.TimeUnit;

public class StudentGraderReport {

    private int[][] classGrades;
    private int[] positionArray = new int[3];
    private int sumOfStudentSubjects;
    private double averageOfStudentSubjects;
    private int totalOfEachSubject;
    private int subjectOneFailures;
    private int subjectTwoFailures;
    private int subjectThreeFailures;
    private int subjectOnePasses;
    private int subjectTwoPasses;
    private int subjectThreePasses;
    private int highestStudentScoreInASubject;
    private int studentWithLowestScoreInASubject;
    private String nameOfStudentWithHighestScore;
    private String nameOfStudentWithLowestScore;

    public StudentGraderReport(int rowsOfArray, int columnsOfArray) {
        this.classGrades = new int[rowsOfArray][columnsOfArray];
    }

    public int[][] checkArray() {
        return classGrades;
    }

    public int emptyValuesAtFirst() {
        for (int[] arrayOfStudentGrade : classGrades) {
            for (int j = 0; j < classGrades.length; j++) {
                if (arrayOfStudentGrade[j] == 0) return 0;
            }
        }
        return -1;
    }

    public void addStudentScore(int subjectScore, int rowIndex, int columnIndex) {
        for (int i = 0; i < classGrades.length; i++) {
            for (int j = 0; j < classGrades.length; j++) {
                if (i == rowIndex && j == columnIndex) {
                    classGrades[i][j] = subjectScore;
                    break;
                }
            }
        }
    }

    public int getStudentScoreAtSpecifiedIndex(int rowIndex, int columnIndex) {
        for (int j = 0; j < classGrades.length; j++) {
            for (int k = 0; k < classGrades.length; k++) {
                if (j == rowIndex && k == columnIndex) {
                    return classGrades[j][k];
                }
            }
        }
        return 0;
    }

    public int getTotalSubjectScoresForAStudent(int rowIndex) {
        if (sumOfStudentSubjects != 0) this.sumOfStudentSubjects = 0;
        for (int i = 0; i < classGrades.length; i++) {
            for (int j = 0; j < classGrades.length; j++) {
                if (rowIndex == i) {
                    this.sumOfStudentSubjects += classGrades[i][j];
                }
            }
        }
        return sumOfStudentSubjects;
    }

    public double getAverageSubjectScoresForAStudent(int rowIndex) {
        for (int j = 0; j < classGrades.length; j++) {
            for (int k = 0; k < classGrades.length; k++) {
                if (rowIndex == j) {
                    this.averageOfStudentSubjects = (double) sumOfStudentSubjects / classGrades[j].length;
                    break;
                }
            }
        }
        return averageOfStudentSubjects;
    }

    public int getTotalOfEachSubjectScores(int columnIndex) {
        if (totalOfEachSubject != 0) this.totalOfEachSubject = 0;
        for (int[] student : classGrades) {
            for (int i = 0; i < classGrades.length; i++) {
                if (columnIndex == i) {
                    this.totalOfEachSubject += student[i];
                    break;
                }
            }
        }
        return totalOfEachSubject;
    }

    public double getAverageOfEachSubjectScores(int columnIndex) {
        int total = getTotalOfEachSubjectScores(columnIndex);
        double average;
        for (int i = 0; i < classGrades.length; i++) {
            for (int j = 0; j < classGrades.length; j++) {
                if (columnIndex == j) {
                    average = (double) total / classGrades[j].length;
                    return average;
                }
            }
        }
        return 0;
    }

    public int getSumFromAllSubjectScores() {
        int classTotal = 0;
        for (int i = 0; i < classGrades.length; i++) {
            classTotal += getTotalSubjectScoresForAStudent(i);
            this.sumOfStudentSubjects = 0;
        }
        return classTotal;
    }

    public double getAverageFromAllSubjectScores() {
        int classTotal = getSumFromAllSubjectScores();
        return (double) classTotal / classGrades.length;
    }

    public int eachSubjectHighestScoringStudent(int columnIndex) {
        int highestStudentScore = 0;
        for (int i = 0; i < classGrades.length; i++) {
            for (int j = 0; j < classGrades.length; j++) {
                if (columnIndex == j) {
                    if (highestStudentScore < classGrades[i][j]) {
                        highestStudentScore = classGrades[i][j];
                        if (i == 0) this.nameOfStudentWithHighestScore = "Student 1";
                        else if (i == 1) this.nameOfStudentWithHighestScore = "Student 2";
                        else if (i == 2) this.nameOfStudentWithHighestScore = "Student 3";
                    }
                    break;
                }
            }
        }
        return highestStudentScore;
    }

    public int eachSubjectLowestScoringStudent(int columnIndex) {
        int lowestStudentScore = 0;
        for (int i = 0; i < classGrades.length; i++) {
            for (int j = 0; j < classGrades.length; j++) {
                if (columnIndex == j) {
                    if (lowestStudentScore == 0) {
                        lowestStudentScore = classGrades[i][j];
                        if (i == 0) this.nameOfStudentWithLowestScore = "Student 1";
                    } else if (lowestStudentScore > classGrades[i][j]) {
                        lowestStudentScore = classGrades[i][j];
                        if (i == 1) this.nameOfStudentWithLowestScore = "Student 2";
                        else if (i == 2) this.nameOfStudentWithLowestScore = "Student 3";
                    }
                    break;
                }
            }
        }
        return lowestStudentScore;
    }

    public int getNumberOfStudentsThatPassedEachSubject(int columnIndex) {
        int passesCounter = 0;
        for (int[] classGrade : classGrades) {
            for (int j = 0; j < classGrades.length; j++) {
                if (columnIndex == j) {
                    if (classGrade[j] >= 40) {
                        passesCounter++;
                        this.highestStudentScoreInASubject = classGrade[j];
                    }
                    if (highestStudentScoreInASubject < classGrade[j]) {
                        this.highestStudentScoreInASubject = classGrade[j];
                    }

                }
            }
        }
        if (columnIndex == 0) this.subjectOnePasses = passesCounter;
        else if (columnIndex == 1) this.subjectTwoPasses = passesCounter;
        else this.subjectThreePasses = passesCounter;
        return passesCounter;
    }

    public int getNumberOfStudentsThatFailedEachSubject(int columnIndex) {
        int failedCounter = 0;
        for (int[] classGrade : classGrades) {
            for (int j = 0; j < classGrades.length; j++) {
                if (columnIndex == j) {
                    if (classGrade[j] < 40) {
                        failedCounter++;
                        this.studentWithLowestScoreInASubject = classGrade[j];
                    }
                    if (studentWithLowestScoreInASubject > classGrade[j]) {
                        this.studentWithLowestScoreInASubject = classGrade[j];
                    }
                }
            }
        }
        if (columnIndex == 0) this.subjectOneFailures = failedCounter;
        else if (columnIndex == 1) this.subjectTwoFailures = failedCounter;
        else this.subjectThreeFailures = failedCounter;
        return failedCounter;
    }

    public int getTheHardestSubject() {
        int hardestSubject = subjectOneFailures;
        if (hardestSubject != 0) {
            if (hardestSubject < subjectTwoFailures) hardestSubject = subjectTwoFailures;
            if (hardestSubject < subjectThreeFailures) hardestSubject = subjectThreeFailures;
        }
        return hardestSubject;
    }

    public int getTheEasiestSubject() {
        int easiestSubject = subjectOnePasses;
        if (easiestSubject != 0) {
            if (easiestSubject < subjectTwoPasses) easiestSubject = subjectTwoPasses;
            if (easiestSubject < subjectThreePasses) easiestSubject = subjectThreePasses;
        }
        return easiestSubject;
    }

    public int getStudentWithHighestScore() {
        return highestStudentScoreInASubject;
    }

    public int getStudentWithLowestScore() {
        return studentWithLowestScoreInASubject;
    }

    public int bestGraduatingStudent() {
        int studentOne = getTotalSubjectScoresForAStudent(0);
        this.sumOfStudentSubjects = 0;
        int studentTwo = getTotalSubjectScoresForAStudent(1);
        this.sumOfStudentSubjects = 0;
        int studentThree = getTotalSubjectScoresForAStudent(2);
        this.sumOfStudentSubjects = 0;
        int bestStudent = studentOne;
        if (bestStudent < studentTwo)
            bestStudent = studentTwo;
        if (bestStudent < studentThree)
            bestStudent = studentThree;
        return bestStudent;
    }

    public int worstGraduatingStudent() {
        int studentTwo = getTotalSubjectScoresForAStudent(1);
        this.sumOfStudentSubjects = 0;
        int studentOne = getTotalSubjectScoresForAStudent(0);
        this.sumOfStudentSubjects = 0;
        int studentThree = getTotalSubjectScoresForAStudent(2);
        this.sumOfStudentSubjects = 0;
        int worstStudent = studentOne;
        if (worstStudent > studentTwo)
            worstStudent = studentTwo;
        if (worstStudent > studentThree)
            worstStudent = studentThree;
        return worstStudent;
    }

    public double calculateStudentPercentage(int rowIndex) {
        double student = (double) getTotalSubjectScoresForAStudent(rowIndex) / 300;
        return student * 100;
    }

    public void saveFinalStudentRecord(int rowIndex) {
        double studentScore = calculateStudentPercentage(rowIndex);
        for (int i = 0; i < classGrades.length; i++) {
            if (rowIndex == i) this.positionArray[i] = (int) studentScore;
        }
    }

    public int getPosition(int indexNum) {
        int[] result = new int[positionArray.length];
        for (int i = 0; i < positionArray.length; i++) {
            int count = 0;
            for (int k : positionArray) if (k > positionArray[i]) count++;
            result[i] = count + 1;
        }
        for (int i = 0; i < result.length; i++) if(indexNum == i) return result[i];
        return 0;
    }

    public void studentsTabularRecord(StudentGraderReport graderReport) {
        equalLines(0, 65, "=");
        System.out.println();
        System.out.printf("%-10s %7s %7s %7s %8s %9s %9s", "STUDENT","SUB1", "SUB2", "SUB3", "TOT", "AVE", "POS");
        System.out.println();
        equalLines(0, 65, "=");
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
        equalLines(0, 65, "=");
        System.out.println();
        System.out.printf("%-10s %7s %7s %7s %18.2f", "SUB Total",
                graderReport.getTotalOfEachSubjectScores(0),
                graderReport.getTotalOfEachSubjectScores(1),
                graderReport.getTotalOfEachSubjectScores(2),
                graderReport.getAverageFromAllSubjectScores());
        System.out.println();
        equalLines(0, 65, "=");
        System.out.println();
    }

    public void subjectSummary(String summaryOfSubjectName, int columnIndex) {
        int highest = eachSubjectHighestScoringStudent(columnIndex);
        int lowest = eachSubjectLowestScoringStudent(columnIndex);
        System.out.println("SUBJECT SUMMARY");
        System.out.println(summaryOfSubjectName);
        System.out.printf("Highest scoring student is: %s scoring %d.%n", nameOfStudentWithHighestScore,highest );
        System.out.printf("Lowest scoring student is: %s scoring %d.%n", nameOfStudentWithLowestScore, lowest);
        System.out.printf("Total Score is: %d%n", getTotalOfEachSubjectScores(columnIndex));
        System.out.printf("Subject Average Score is: %.2f%n", getAverageOfEachSubjectScores(columnIndex));
        System.out.printf("Number of passes: %d%n", getNumberOfStudentsThatPassedEachSubject(columnIndex));
        System.out.printf("Number of fails: %d%n", getNumberOfStudentsThatFailedEachSubject(columnIndex));
        System.out.println("\n");
    }

    public void fullSummary(){
        System.out.printf("The hardest subject have %d failures", getTheHardestSubject());
        System.out.printf("The easiest subject have %d failures", getTheEasiestSubject());
        System.out.println("The overall highest score is scored by %s in %s scoring %d");
        System.out.println("The overall lowest score is scored by %s in %s scoring %d");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("CLASS SUMMARY");
        equalLines(0, 65, "=");
        System.out.println("\n");
        System.out.printf("Best Graduating Student is: %s scoring %d");
        equalLines(0,65,"=");
        System.out.println("\n");
        equalLines(0, 65, "!");
        System.out.println("\n");
        System.out.println("Best Graduating  Student is: %s scoring %d");
        equalLines(0,65,"!");
        System.out.println("\n");
        equalLines(0, 65, "=");
        System.out.println("\n");
        System.out.println("Class Total score is: %d");
        System.out.println("Class Average score is %d");
    }

    public void equalLines(int number, int length, String symbol) {
        for (int j = number ; j < length; j++) {
            System.out.print(symbol);
        }
    }

    public void introAndOutroToNextEntry() {
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
            equalLines(0, 55, " ");
            System.out.println();
            equalLines(i, 55, "<");
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
