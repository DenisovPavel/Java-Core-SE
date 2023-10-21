package DataPartTwo.ServiceGroup;

import DataPartTwo.Model.Student;
import DataPartTwo.Model.StudyGroup;
import DataPartTwo.Model.Teacher;
import java.util.List;

public class StudyGroupService extends StudyGroup {
    private StudyGroup studyGroup;
    List<Student> students;
    public StudyGroupService() {
    }
    public int getTeacherId(Teacher teacher) {
        return teacher.getTID();
    }
    /**
     * @return Возврат созданной группы(Учитель+Студенты)
     */
    public StudyGroup createStudyGroupService(Teacher teacher, List<Student> students) {
        studyGroup = new StudyGroup(teacher, students);
        return studyGroup;
    }
}








