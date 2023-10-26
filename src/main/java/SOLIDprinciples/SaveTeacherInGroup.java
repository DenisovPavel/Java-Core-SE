package SOLIDprinciples;

import java.util.List;

public class SaveTeacherInGroup implements SaveTeacherInTeacherGroup {
    @Override
    public void saveTeacherInGroup(Teacher teacher, List<Teacher> teacherList) {
        teacherList.add(teacher);
    }

}
