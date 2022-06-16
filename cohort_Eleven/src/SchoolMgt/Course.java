package SchoolMgt;

import java.util.ArrayList;

public class Course {
    private final String courseTitle;
    private final String courseCode;
    private final boolean courseStatus;
    private static ArrayList<Course> courseList;

    public Course(String courseTitle, String courseCode, boolean courseStatus) {
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.courseStatus = courseStatus;
        courseList = new ArrayList<>();
    }

    public static void addNewCourse(Course newCourse) {
        courseList.add(newCourse);
    }

    public static ArrayList<Course> getAllCourses() {
        return courseList;
    }

    String getCourseName(){
        return courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public boolean getCourseStatus() {
        return courseStatus;
    }
}
