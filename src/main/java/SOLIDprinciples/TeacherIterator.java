package SOLIDprinciples;

import java.util.Iterator;
import java.util.List;

public class TeacherIterator<T extends User> implements Iterator<T> {

    private List<T> teachersList;
    private int counter;

    public TeacherIterator(List<T> teachersList) {
        this.teachersList = teachersList;
        this.counter = counter;
    }

    @Override
    public boolean hasNext() {

        return counter < teachersList.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return teachersList.get(counter++);
        }
        return null;
    }

}