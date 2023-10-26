package SOLIDprinciples;

import java.util.List;

public class ShowTeacherGroupList extends TeacherGroup{
    public ShowTeacherGroupList(List<Teacher> teacherList) {
        super(teacherList);
    }
    public List<Teacher> getTeacherList() {
        return teacherList;
    }
}
