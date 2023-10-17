package Teacher;


import Gens.Dog;
import Gens.User;
import Gens.UserComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        Teacher historyTeacher = new Teacher("Oleg", "Petrov", 22, "History");
        Teacher mathTeacher = new Teacher("Oksana", "Balotovna", 23, "Math");
        Teacher biologyTeacher = new Teacher("Pavel", "Sidorov", 44, "Biology");
        Teacher geographyTeacher = new Teacher("Mikhail", "Volodin", 33, "Geography");
        Teacher musicTeacher = new Teacher("Alena", "Petrova", 23, "Music");

        teachers.add(historyTeacher);
        teachers.add(mathTeacher);
        teachers.add(biologyTeacher);
        teachers.add(geographyTeacher);
        teachers.add(musicTeacher);

        teachers.sort(new teacherComparator<Teacher>());
        System.out.println(teachers);

        for (Teacher teach : teachers) {
            System.out.println(teach.getFirstName());
        }

        System.out.println("Added teachers to Teacher Group! ->");
        TeacherGroup list = new TeacherGroup(teachers);
        teacherIterator teacherIterator = list.iterator();
        while (teacherIterator.hasNext()) {
            System.out.println(teacherIterator.next());

        }
    }
}
