package SchoolMgt;

import BankApp.Gender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SchoolTest {
    School school;

    @BeforeEach
    void setUp() throws Exception {
        school = new School("Victory Crown College");
        school.createCourse("Physics", "PHY101", true);
        school.createCourse("Geology", "GEO101", true);
        school.admitStudent("Uche", "Oluigbo", String.valueOf(Gender.MALE), 16);
        school.admitStudent("Danny", "Eliab", String.valueOf(Gender.MALE), 19);
        school.admitStudent("Divine", "Anastasia", String.valueOf(Gender.FEMALE), 20);
    }

    @Test
    void testThatSchoolNameIsSet() {
        assertEquals("Victory Crown College", school.getNameOfSchool());
    }

    @Test
    void testThatACourseIsCreated() throws Exception {
        school.createCourse("Psychology", "PSY101", true);
        assertEquals("Psychology", school.getCourse("Psychology"));
    }

    @Test
    void testThatYouCanGetAllCourses() {
        assertEquals("Physics, Geology, ", school.getAllCourses());
    }

    @Test
    void testThatACourseCanBeDeleted() {
        school.deleteCourse("Geology");
        assertEquals("Course Not Found", school.getCourse("Geology"));
    }

    @Test
    void testThatNewStudentCanBeAdmitted() throws Exception {
        school.admitStudent("Uche", "Oluigbo", String.valueOf(Gender.MALE), 16);
        assertEquals("Uche Oluigbo", school.getStudentName("001"));
    }

    @Test
    void testStudentCanBeExpelled() throws Exception {
//        school.admitStudent("Uche", "Oluigbo", Gender.MALE, 16);
//        school.admitStudent("Danny", "Eliab", Gender.MALE, 19);
//        school.admitStudent("Divine", "Anastasia", Gender.FEMALE, 20);
        school.deleteStudentRecord("001");
        assertTrue(school.isStudentExpelled("001"));
    }

    @Test
    void testToRetrieveStudentAge() {
        school.admitStudent("Uche", "Oluigbo", String.valueOf(Gender.MALE), 16);
        assertEquals(16, school.getStudentAge("001"));
    }

    @Test
    void testToRetrieveListOfAllStudents() {
        assertEquals(3, school.getListOfStudents());
    }

//    @Test
//    void test
}