package Controller;

import Model.Student;
import View.StudentView;

public class StudentController {
    private StudentView view;
    private Student model;

    public StudentController(Student model,StudentView view){
        this.model = model;
        this.view = view;
    }

    public void updateView(){
        System.out.println("=====Student View=====");
        view.printStudentDetails(this.model);
    }
}
