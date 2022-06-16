package SchoolMgt;

import BankApp.Gender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    Student student;
    School schoolOne;

    @BeforeEach
    void setUp() throws Exception {
        student = new Student("Eva", "Danny", String.valueOf(Gender.MALE), 22);
        schoolOne = new School("Limelight");
        schoolOne.createCourse("Physics", "PHY101", true);
//        schoolOne.createCourse("Geology", "GEO101", true);
        schoolOne.createCourse("Anatomy", "ANA101", true);
//        schoolOne.createCourse("Algebra", "MTH101", true);
    }

    @Test
    void testToRetrieveStudentName() {
        assertEquals("Eva Danny", student.getStudentName());
    }

    @Test
    void testToRetrieveStudentID() {
        Student studentTwo = new Student("Purity", "Olaedo", String.valueOf(Gender.FEMALE), 18);
        assertEquals("001", student.getStudentID());
        assertEquals("002", studentTwo.getStudentID());
    }


    @Test
    void testThatStudentAgeIsRetrieved() {
        assertEquals(22, student.getAge("001"));
    }

    @Test
    void testThatStudentCanSelectCourse() throws Exception {
        schoolOne = new School("Limelight");
        schoolOne.createCourse("Geology", "GEO101", true);
        student.selectCourse("GEO101");
        assertEquals("Geology", student.isCourseRegistered("Geology"));
    }

    @Test
    void testToViewAllCourses() throws Exception {
        schoolOne.createCourse("Geology", "GEO101", true);
        schoolOne.createCourse("Algebra", "MTH101", true);
        student.selectCourse("GEO101");
        student.selectCourse("MTH101");
//        System.out.println(student.getAllRegisteredCourses());
        student.getAllRegisteredCourses();
        assertEquals("Geology, Algebra, ", student.getAllRegisteredCourses());

    }

}