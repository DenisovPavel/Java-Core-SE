package DataPartTwo.View;

import DataPartTwo.Model.Student;
import DataPartTwo.Model.Teacher;

import java.util.List;

public interface ViewModel {
    public void  createList(Teacher teacher, List<Student> studentList);

    void showStudents();
    void showTeacher();
}
