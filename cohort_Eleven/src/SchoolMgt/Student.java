package SchoolMgt;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private static int uuidCount = 0;
    private final String firstName;
    private final String lastName;
    private final String gender;
    private final int age;
    private final String studentID;
    private String ids = "00";
    private ArrayList<Course> listOfStudentCourses;

    Student(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = String.valueOf(gender);
        this.age = age;
        uuidCount++;
        this.studentID = ids += String.valueOf(uuidCount);
        listOfStudentCourses = new ArrayList<>();
    }

    String getStudentName() {
        return firstName + " " + lastName;
    }

    String getStudentID() {
        return studentID;
    }

    int getAge(String studentID) {
        return age;
    }

    void selectCourse(String courseCode) throws Exception {
        ArrayList<Course> courseList = School.returnCourses();
        for (Course course : courseList) {
            if (Objects.equals(course.getCourseCode(), courseCode)) {
                if (listOfStudentCourses.size() != 0) {
                    for (Course studentCourse : listOfStudentCourses) {
                        if (Objects.equals(studentCourse.getCourseCode(), courseCode)) {
                            throw new Exception("This course already exist");
                        }
                    }
                }
                listOfStudentCourses.add(course);
            }
        }
    }

    String isCourseRegistered(String courseName) throws Exception {
        for (Course courseOffered : listOfStudentCourses) {
            if (courseOffered.getCourseName().equalsIgnoreCase(courseName)) {
                return courseOffered.getCourseName();
            }
        }
        throw new Exception("Course not yet registered.");
    }

    ArrayList<Course> getAllRegisteredCourses() throws Exception {
        if (listOfStudentCourses != null)
            return listOfStudentCourses;
        throw new Exception("You offer no course. You are not a bona-fide student.");
    }

    void deleteCourse(String courseID) {
        if (listOfStudentCourses.removeIf(courseOffered -> courseOffered.getCourseCode().equalsIgnoreCase(courseID))) ;
        else throw new IllegalArgumentException("You don't offer this course at the moment");
    }
}
