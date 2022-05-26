package schoolStudentGraderReport;

public class StudentGraderReport {

    private final int[][] classGrades;
    private final int[] positionArray = new int[3];
    private int sumOfStudentSubjects;
    private double averageOfStudentSubjects;
    private int totalOfEachSubject;
    private int subjectOneFailures;
    private int subjectTwoFailures;
    private int subjectThreeFailures;
    private int subjectOnePasses;
    private int subjectTwoPasses;
    private int subjectThreePasses;
    private int studentWithHighestScoreInASubject;
    private int studentWithLowestScoreInASubject;

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
        for (int[] student : classGrades) {
            for (int j = 0; j < classGrades.length; j++) {
                if (columnIndex == j) {
                    if (highestStudentScore < student[j]) {
                        highestStudentScore = student[j];
                    }
                    break;
                }
            }
        }
        return highestStudentScore;
    }

    public int eachSubjectLowestScoringStudent(int columnIndex) {
        int lowestStudentScore = 0;
        for (int[] student : classGrades) {
            for (int j = 0; j < classGrades.length; j++) {
                if (columnIndex == j) {
                    if (lowestStudentScore == 0) {
                        lowestStudentScore = student[j];
                    } else if (lowestStudentScore > student[j]) {
                        lowestStudentScore = student[j];
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
                    if (classGrade[j] > 40) {
                        passesCounter++;
                        this.studentWithHighestScoreInASubject = classGrade[j];
                    }
                    if (studentWithHighestScoreInASubject < classGrade[j]) {
                        this.studentWithHighestScoreInASubject = classGrade[j];
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
        return studentWithHighestScoreInASubject;
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
        int positionOne = positionArray[0];
        int positionTwo = positionArray[0];
        int positionThree = positionArray[0];
        for (int currentPosition : positionArray) {
            if (currentPosition > positionOne) {
                positionThree = positionTwo;
                positionTwo = positionOne;
                positionOne = currentPosition;
            }
        }
        int position = 0;
        for (int i = 0; i < positionArray.length; i++) {
            if (positionArray[i] == positionOne && indexNum == i) position = 1;
            if (positionArray[i] == positionTwo && indexNum == i) position = 2;
            if (positionArray[i] == positionThree && indexNum == i) position = 3;
        }
        return position;
    }
}
