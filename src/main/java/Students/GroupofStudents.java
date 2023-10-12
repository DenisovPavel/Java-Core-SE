package Students;
//
//        -Создать класс Студент
//        -Создать класс УчебнаяГруппаИтератор
//        -Создать класс УчебнаяГруппаИтератор,заставив его реализовать интерфейс Iterator
//        -Реализовать его контракты(включая удаление)

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class GroupofStudents implements Iterable<Student> {
    String nameofGroup;

    List<Student> numberofStudents = new ArrayList<Student>();
    int index = 0;

    public GroupofStudents(String nameofGroup, List numberofStudents) {
        this.nameofGroup = nameofGroup;
        this.numberofStudents = numberofStudents;
    }

    public String getNameofGroup() {
        return nameofGroup;
    }

    public void setNameofGroup(String nameofGroup) {
        this.nameofGroup = nameofGroup;
    }

    public List getNumberofStudents() {
        return numberofStudents;
    }

    public List setNumberofStudents(List numberofStudents) {
        return this.numberofStudents = numberofStudents;
    }

    @Override
    public String toString() {
        return "ClassStudents{" +
                "numberofStudents=" + numberofStudents +
                '}';
    }


    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator() {
        };
    }
    private class StudentIterator implements Iterator<Student> {
        @Override
        public boolean hasNext() {
            return index < numberofStudents.size();
        }

        @Override
        public Student next() {
            if (hasNext()) {
                return numberofStudents.get(index++);
            }
            return null;
        }
        @Override
        public void remove(){
          return;
        }
    }
    public void addPerson(Student student) {
        numberofStudents.add(student);
    }
}
