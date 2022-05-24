package schoolStudentGraderReport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentGraderReportTest {
    StudentGraderReport graderReport;

    @BeforeEach
    void setUp() {
        graderReport = new StudentGraderReport(3, 3);
    }

    @Test
    void arrayContainerToKeepStudentsAndSubjectsTest() {
        assertNotNull(graderReport.checkArray());
    }

    @Test
    void defaultEmptyValueForElementsOfArrayContainerTest() {
        assertEquals(0,graderReport.emptyValuesAtFirst());
    }

    @Test
    void inputScoresForAStudentInSpecifiedSubjectTest() {
        int subjectOneScore = 50;
        int subjectTwoScore = 100;
        graderReport.addStudentScore(subjectOneScore, 1, 0);
        graderReport.addStudentScore(subjectTwoScore, 2, 2);
        assertEquals(50,graderReport.getStudentScoreAtSpecifiedIndex(1, 0));
        assertEquals(100,graderReport.getStudentScoreAtSpecifiedIndex(2, 2));
    }

    @Test
    void sumOfScoresForEachStudentInAllSubjectsTest() {
        int subjectOneScore = 30;
        int subjectTwoScore = 50;
        int subjectThreeScore = 80;
        graderReport.addStudentScore(subjectOneScore, 0,0);
        graderReport.addStudentScore(subjectTwoScore, 0,1);
        graderReport.addStudentScore(subjectThreeScore, 0,2);
        assertEquals(30 + 50 + 80, graderReport.getTotalSubjectScoresForAStudent(0));
    }

    @Test
    void averageOfScoresForEachStudentInAllSubjectsTest() {
        int subjectOneScore = 23;
        int subjectTwoScore = 12;
        int subjectThreeScore = 34;
        graderReport.addStudentScore(subjectOneScore, 0,0);
        graderReport.addStudentScore(subjectTwoScore, 0,1);
        graderReport.addStudentScore(subjectThreeScore, 0,2);
        graderReport.getTotalSubjectScoresForAStudent(0);
        assertEquals((double) (23 + 12 + 34)/3, graderReport.getAverageSubjectScoresForAStudent(0));
    }

    @Test
    void sumOfAllStudentsScoresInEachSubjectTest() {
        int englishSubjectStudentOneScore = 23;
        int englishSubjectStudentTwoScore = 13;
        int englishSubjectStudentThreeScore = 99;
        graderReport.addStudentScore(englishSubjectStudentOneScore, 0,0);
        graderReport.addStudentScore(englishSubjectStudentTwoScore, 1,0);
        graderReport.addStudentScore(englishSubjectStudentThreeScore, 2,0);
        assertEquals(135, graderReport.getTotalOfEachSubjectScores(0));
    }

    @Test
    void averageOfAllStudentsScoresInEachSubjectTest() {
        int englishSubjectStudentOneScore = 23;
        int englishSubjectStudentTwoScore = 13;
        int englishSubjectStudentThreeScore = 99;
        graderReport.addStudentScore(englishSubjectStudentOneScore, 0,0);
        graderReport.addStudentScore(englishSubjectStudentTwoScore, 1,0);
        graderReport.addStudentScore(englishSubjectStudentThreeScore, 2,0);
        assertEquals(45.00,graderReport.getAverageOfEachSubjectScores(0));
    }

    @Test
    void totalScoresOfStudentsInAllSubjectsTest(){
        int englishSubjectStudentOneScore = 23;
        int englishSubjectStudentTwoScore = 13;
        int englishSubjectStudentThreeScore = 99;
        int physicsSubjectStudentOneScore = 12;
        int physicsSubjectStudentTwoScore = 67;
        int physicsSubjectStudentThreeScore = 98;
        int mathsSubjectStudentOneScore = 34;
        int mathsSubjectStudentTwoScore = 12;
        int mathsSubjectStudentThreeScore = 100;
        graderReport.addStudentScore(englishSubjectStudentOneScore, 0,0);
        graderReport.addStudentScore(englishSubjectStudentTwoScore, 1,0);
        graderReport.addStudentScore(englishSubjectStudentThreeScore, 2,0);
        graderReport.addStudentScore(physicsSubjectStudentOneScore, 0,1);
        graderReport.addStudentScore(physicsSubjectStudentTwoScore, 1,1);
        graderReport.addStudentScore(physicsSubjectStudentThreeScore, 2,1);
        graderReport.addStudentScore(mathsSubjectStudentOneScore, 0,2);
        graderReport.addStudentScore(mathsSubjectStudentTwoScore, 1,2);
        graderReport.addStudentScore(mathsSubjectStudentThreeScore, 2,2);
        assertEquals(458, graderReport.getSumFromAllSubjectScores());
    }

    @Test
    void averageOfStudentsInAllSubjectsTest(){
        int englishSubjectStudentOneScore = 23;
        int englishSubjectStudentTwoScore = 13;
        int englishSubjectStudentThreeScore = 99;
        int physicsSubjectStudentOneScore = 12;
        int physicsSubjectStudentTwoScore = 67;
        int physicsSubjectStudentThreeScore = 98;
        int mathsSubjectStudentOneScore = 34;
        int mathsSubjectStudentTwoScore = 12;
        int mathsSubjectStudentThreeScore = 100;
        graderReport.addStudentScore(englishSubjectStudentOneScore, 0,0);
        graderReport.addStudentScore(englishSubjectStudentTwoScore, 1,0);
        graderReport.addStudentScore(englishSubjectStudentThreeScore, 2,0);
        graderReport.addStudentScore(physicsSubjectStudentOneScore, 0,1);
        graderReport.addStudentScore(physicsSubjectStudentTwoScore, 1,1);
        graderReport.addStudentScore(physicsSubjectStudentThreeScore, 2,1);
        graderReport.addStudentScore(mathsSubjectStudentOneScore, 0,2);
        graderReport.addStudentScore(mathsSubjectStudentTwoScore, 1,2);
        graderReport.addStudentScore(mathsSubjectStudentThreeScore, 2,2);
        graderReport.getSumFromAllSubjectScores();
        assertEquals(152.66666666666666, graderReport.getAverageFromAllSubjectScores());
    }


    @Test
    void highestScoringStudentInEachSubject() {
        int mathsSubjectStudentOneScore = 34;
        int mathsSubjectStudentTwoScore = 12;
        int mathsSubjectStudentThreeScore = 100;
        graderReport.addStudentScore(mathsSubjectStudentOneScore, 0,2);
        graderReport.addStudentScore(mathsSubjectStudentTwoScore, 1,2);
        graderReport.addStudentScore(mathsSubjectStudentThreeScore, 2,2);
        assertEquals(100, graderReport.eachSubjectHighestScoringStudent(2));
    }

    @Test
    void lowestScoringStudentInEachSubject() {
        int mathsSubjectStudentOneScore = 34;
        int mathsSubjectStudentTwoScore = 12;
        int mathsSubjectStudentThreeScore = 100;
        graderReport.addStudentScore(mathsSubjectStudentOneScore, 0,2);
        graderReport.addStudentScore(mathsSubjectStudentTwoScore, 1,2);
        graderReport.addStudentScore(mathsSubjectStudentThreeScore, 2,2);
        assertEquals(102, graderReport.eachSubjectLowestScoringStudent(2));
    }
}

