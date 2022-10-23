package View;

import Model.Student;

public class StudentView {
    public void printStudentDetails(Student student) {
        System.out.println("Student Name : "+student.getName());
        System.out.println("Student Roll no. : "+student.getRollNo());
        System.out.println("Student age : "+student.getAge());
        System.out.println("Student gender : "+student.getGender());
    }
}
