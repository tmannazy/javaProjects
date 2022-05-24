package schoolStudentGraderReport;

public class StudentGraderReport {

    private final int[][] classGrades;

    private int sumOfStudentSubjects;
    private double averageOfStudentSubjects;
    private int totalOfEachSubject;

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
//                    highestStudentScore = student[j];
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
                    if (lowestStudentScore > student[j] ) {
                        lowestStudentScore = student[j];
                    }
                   else if(student[j] > lowestStudentScore) {
                    lowestStudentScore = student[j];}

                    break;
                }
            }
        }
        return lowestStudentScore;
    }
}
