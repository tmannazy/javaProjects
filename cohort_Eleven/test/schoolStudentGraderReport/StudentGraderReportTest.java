package schoolStudentGraderReport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
        assertEquals(0, graderReport.emptyValuesAtFirst());
    }

    @Test
    void inputScoresForAStudentInSpecifiedSubjectTest() {
        int subjectOneScore = 50;
        int subjectTwoScore = 100;
        graderReport.addStudentScore(subjectOneScore, 1, 0);
        graderReport.addStudentScore(subjectTwoScore, 2, 2);
        assertEquals(50, graderReport.getStudentScoreAtSpecifiedIndex(1, 0));
        assertEquals(100, graderReport.getStudentScoreAtSpecifiedIndex(2, 2));
    }

    @Test
    void sumOfScoresForEachStudentInAllSubjectsTest() {
        enterGradesFromStudents();
        assertEquals(297, graderReport.getTotalSubjectScoresForAStudent(2));
    }

    @Test
    void averageOfScoresForEachStudentInAllSubjectsTest() {
        enterGradesFromStudents();
        graderReport.getTotalSubjectScoresForAStudent(0);
        assertEquals((double) (23 + 12 + 34) / 3, graderReport.getAverageSubjectScoresForAStudent(0));
    }

    @Test
    void sumOfAllStudentsScoresInEachSubjectTest() {
        enterGradesFromStudents();
        assertEquals(135, graderReport.getTotalOfEachSubjectScores(0));
    }

    @Test
    void averageOfAllStudentsScoresInEachSubjectTest() {
        enterGradesFromStudents();
        assertEquals(45.00, graderReport.getAverageOfEachSubjectScores(0));
    }

    @Test
    void totalScoresOfStudentsInAllSubjectsTest() {
        enterGradesFromStudents();
        assertEquals(458, graderReport.getSumFromAllSubjectScores());
    }

    @Test
    void averageOfStudentsInAllSubjectsTest() {
        enterGradesFromStudents();
        graderReport.getSumFromAllSubjectScores();
        assertEquals(152.66666666666666, graderReport.getAverageFromAllSubjectScores());
    }

    @Test
    void highestScoringStudentInEachSubject() {
        enterGradesFromStudents();
        assertEquals(100, graderReport.eachSubjectHighestScoringStudent(2));
    }

    @Test
    void lowestScoringStudentInEachSubject() {
        enterGradesFromStudents();
        assertEquals(12, graderReport.eachSubjectLowestScoringStudent(2));
    }

    @Test
    void numberOfStudentsThatPassedInEachSubject() {
        enterGradesFromStudents();
        graderReport.eachSubjectLowestScoringStudent(2);
        assertEquals(1, graderReport.getNumberOfStudentsThatPassedEachSubject(2));
    }

    @Test
    void numberOfStudentsThatFailedInEachSubject() {
        enterGradesFromStudents();
        graderReport.eachSubjectLowestScoringStudent(2);
        assertEquals(2, graderReport.getNumberOfStudentsThatFailedEachSubject(2));
    }

    @Test
    void hardestSubjectInAllSubjects() {
        enterGradesFromStudents();
        studentsThatFailed();
        assertEquals(2, graderReport.getTheHardestSubject());
    }

    @Test
    void easiestSubjectInAllSubjects() {
        enterGradesFromStudents();
        studentsThatPassed();
        assertEquals(2, graderReport.getTheEasiestSubject());
    }

    @Test
    void studentWithHighestScoreAcrossAllSubjectsTest() {
        enterGradesFromStudents();
        studentsThatPassed();
        assertEquals(100, graderReport.getStudentWithHighestScore());
    }

    @Test
    void studentWithLowestScoreAcrossAllSubjects() {
        enterGradesFromStudents();
        studentsThatFailed();
        assertEquals(12, graderReport.getStudentWithLowestScore());
    }

    @Test
    void bestGraduatingStudentTest() {
        enterGradesFromStudents();
        assertEquals(297, graderReport.bestGraduatingStudent());
    }

    @Test
    void worstGraduatingStudentTest() {
        enterGradesFromStudents();
        assertEquals(69, graderReport.worstGraduatingStudent());
    }

    @Test
    void finalPositionOfAStudentTest() {
        enterGradesFromStudents();
        graderReport.saveFinalStudentRecord(0);
        graderReport.saveFinalStudentRecord(1);
        graderReport.saveFinalStudentRecord(2);
        assertEquals(3, graderReport.getPosition(0));
    }

    private void studentsThatPassed() {
        graderReport.getNumberOfStudentsThatPassedEachSubject(0);
        graderReport.getNumberOfStudentsThatPassedEachSubject(1);
        graderReport.getNumberOfStudentsThatPassedEachSubject(2);
    }

    private void studentsThatFailed() {
        graderReport.getNumberOfStudentsThatFailedEachSubject(0);
        graderReport.getNumberOfStudentsThatFailedEachSubject(1);
        graderReport.getNumberOfStudentsThatFailedEachSubject(2);
    }

    private void enterGradesFromStudents() {
        int englishSubjectStudentOneScore = 23;
        int englishSubjectStudentTwoScore = 13;
        int englishSubjectStudentThreeScore = 99;
        int physicsSubjectStudentOneScore = 12;
        int physicsSubjectStudentTwoScore = 67;
        int physicsSubjectStudentThreeScore = 98;
        int mathsSubjectStudentOneScore = 34;
        int mathsSubjectStudentTwoScore = 12;
        int mathsSubjectStudentThreeScore = 100;
        graderReport.addStudentScore(englishSubjectStudentOneScore, 0, 0);
        graderReport.addStudentScore(englishSubjectStudentTwoScore, 1, 0);
        graderReport.addStudentScore(englishSubjectStudentThreeScore, 2, 0);
        graderReport.addStudentScore(physicsSubjectStudentOneScore, 0, 1);
        graderReport.addStudentScore(physicsSubjectStudentTwoScore, 1, 1);
        graderReport.addStudentScore(physicsSubjectStudentThreeScore, 2, 1);
        graderReport.addStudentScore(mathsSubjectStudentOneScore, 0, 2);
        graderReport.addStudentScore(mathsSubjectStudentTwoScore, 1, 2);
        graderReport.addStudentScore(mathsSubjectStudentThreeScore, 2, 2);
    }
}

