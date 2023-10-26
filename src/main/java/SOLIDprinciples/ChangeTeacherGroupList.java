package SOLIDprinciples;

import java.util.List;

public class ChangeTeacherGroupList extends TeacherGroup{
    public ChangeTeacherGroupList(List<Teacher> teacherList) {
        super(teacherList);
    }
    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}
