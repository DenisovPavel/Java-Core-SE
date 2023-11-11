package MarketwithQueue.Teacher;



import java.util.List;

public class TeacherGroup implements Iterable<Teacher>{

    public List<Teacher> teacherList;

    public TeacherGroup(List<Teacher> teacherList) {

        this.teacherList = teacherList;
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teacherList=" + teacherList +
                '}';
    }


    @Override
    public teacherIterator iterator() {
        return new  teacherIterator(teacherList);
    }
}
