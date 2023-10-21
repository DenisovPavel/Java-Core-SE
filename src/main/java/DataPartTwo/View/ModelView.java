package DataPartTwo.View;

import DataPartTwo.Controller.Controller;
import DataPartTwo.Model.Student;
import DataPartTwo.Model.Teacher;

import java.util.List;

public class ModelView {
    Controller controllerView = new Controller();

    public ModelView(){
    }
    public void getTeacherID(Controller controllerView ,Teacher teacher){
        System.out.println("Teacher ID: " + controllerView.getTeacherID(teacher));
    }
    public void getStudentID(Controller controllerView , Student student){
        System.out.println("Student ID: " + controllerView.getStudentID(student));
    }
    public void getAllGroup( List<Student> studentList,Teacher teacher,Controller controllerView){
        System.out.println(controllerView.showGroup(teacher,studentList));
    }
}
