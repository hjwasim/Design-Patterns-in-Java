import Controller.StudentController;
import Model.Student;
import View.StudentView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student std1 = buildStudent(); //Model
        StudentView view = new StudentView(); //View
        StudentController controller = new StudentController(std1,view); //Controller = Model+View
        controller.updateView();

        Student std2 = buildStudent();
        controller = new StudentController(std2,view);
        controller.updateView();
    }

    private static Student buildStudent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = s.next();
        System.out.println("Enter Student Roll.No: ");
        int rollNo = s.nextInt();
        System.out.println("Enter Student Age: ");
        int age = s.nextInt();
        System.out.println("Enter Student Gender: ");
        String gender = s.next();
        return new Student(name, rollNo, age, gender);
    }
}
