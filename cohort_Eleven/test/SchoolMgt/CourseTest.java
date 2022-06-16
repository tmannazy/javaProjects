package SchoolMgt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course course;

    @BeforeEach
    void setUp() {
        course = new Course("Maths", "MTH101", true);
    }

    @Test
    void testThatCourseNameIsSet(){
        assertEquals("Maths", course.getCourseName());
    }

    @Test
    void testThatCourseCodeIsSet() {
        assertEquals("MTH101", course.getCourseCode());
    }

    @Test
    void testThatCourseStatusIsSet() {
        assertTrue(course.getCourseStatus());
    }

}