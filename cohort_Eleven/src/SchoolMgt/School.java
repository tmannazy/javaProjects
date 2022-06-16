package SchoolMgt;

import java.util.ArrayList;

public class School {
    private static ArrayList<Course> courses;
    private final String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public static ArrayList<Course> returnCourses() throws Exception {
        if (!(courses.size() == 0)) return courses;
        else throw new Exception("No course available yet. Kindly check course list or add new course.");
    }

    public String getNameOfSchool() {
        return schoolName;
    }

    public void createCourse(String courseName, String courseID, boolean courseStatus) {
        Course newCourse = new Course(courseName, courseID, courseStatus);
        courses.add(newCourse);
    }

    public String getCourse(String courseName) {
        for (Course course : courses) {
            if (course.getCourseName().equals(courseName))
                return courseName;
        }
        return "Course Not Found";
    }

    public String getAllCourses() {
        String courseList = "";
        for (Course course : courses) {
            courseList += course.getCourseName() + ", ";
        }
        return courseList;
    }

    public void deleteCourse(String courseName) {
        courses.removeIf(course -> course.getCourseName().equals(courseName));
    }

    public String getStudentName(String studentID) throws Exception {
        Student student = findStudent(studentID);
        if (student != null) return student.getStudentName();
        else throw new Exception("This StudentID is not associated with any student");
    }

    private Student findStudent(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }


    public void deleteStudentRecord(String studentID) throws Exception {
        if (students.removeIf(student -> student.getStudentID().equals(studentID))) ;
        else throw new IllegalArgumentException("Student don't exist.");
    }

    public boolean isStudentExpelled(String studentID) {
        for (Student student : students) {
            if (!student.getStudentID().equals(studentID)) {
                return true;
            }
        }
        return false;
    }

    public void admitStudent(String firstName, String lastName, String gender, int age) {
        Student newStudent = new Student(firstName, lastName, gender, age);
        students.add(newStudent);
    }


    public int getStudentAge(String studentID) {
        Student studentAge = findStudent(studentID);
        if (studentAge != null) return studentAge.getAge(studentID);
        return 0;
    }

    public int getListOfStudents() {
        return students.size();
    }

    public ArrayList<Student> getDataOfStudents() {
        return students;
    }

    public Student verifyStudent(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equalsIgnoreCase(studentID)) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student ID not found");
    }
}
