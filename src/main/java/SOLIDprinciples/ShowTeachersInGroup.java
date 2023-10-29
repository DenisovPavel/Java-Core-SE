package SOLIDprinciples;

import java.util.List;

public interface ShowTeachersInGroup extends SaveTeacherInTeacherGroup {

    public default void showTeacher(List<Teacher> teacherList) {
        for (Teacher list2 : teacherList)
            System.out.println(list2);

    }
}
