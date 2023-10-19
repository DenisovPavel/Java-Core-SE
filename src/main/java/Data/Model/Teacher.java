package Data.Model;
/**
 * Teacher - шаблон учителя на основе User
 */
public class Teacher {
    String teacherSubject;

    public Teacher(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }

    public String getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherSubject='" + teacherSubject + '\'' +
                '}';
    }
}
