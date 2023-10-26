package SOLIDprinciples;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        teachers.add(new Teacher("Oleg", "Petrov", 22, "History"));
//        teachers.add(new Teacher("Oksana", "Balotovna", 23, "Math"));
//        teachers.add(new Teacher("Pavel", "Sidorov", 44, "Biology"));
//        teachers.add(new Teacher("Mikhail", "Volodin", 33, "Geography"));
//        teachers.add(new Teacher("Alena", "Petrova", 23, "Music"));

        Teacher historyTeacher = new Teacher("Oleg", "Petrov", 22, "History");
        Teacher mathTeacher = new Teacher("Oksana", "Balotovna", 23, "Math");
        Teacher biologyTeacher = new Teacher("Pavel", "Sidorov", 44, "Biology");
        Teacher geographyTeacher = new Teacher("Mikhail", "Volodin", 33, "Geography");
        Teacher musicTeacher = new Teacher("Alena", "Petrova", 23, "Music");

        List<Teacher> teachers = new ArrayList<>();

        SaveTeacherInGroup saveTeacherInGroup = new SaveTeacherInGroup();

        saveTeacherInGroup.saveTeacherInGroup(historyTeacher,teachers);
        saveTeacherInGroup.saveTeacherInGroup(mathTeacher,teachers);
        saveTeacherInGroup.saveTeacherInGroup(biologyTeacher,teachers);
        saveTeacherInGroup.saveTeacherInGroup(geographyTeacher,teachers);
        saveTeacherInGroup.saveTeacherInGroup(musicTeacher,teachers);




////        teachers.sort(new TeacherComparator<Teacher>());
////        System.out.println(teachers);
//        TeacherGroup list = new TeacherGroup(teachers);
//
//        SaveTeacher saveTeacher = new SaveTeacher();
//        System.out.println(saveTeacher.saveToListTeacher(historyTeacher, list));
//        System.out.println(saveTeacher.saveToListTeacher(mathTeacher, list));
//        System.out.println(saveTeacher.saveToListTeacher(biologyTeacher, list));
//        System.out.println(saveTeacher.saveToListTeacher(geographyTeacher, list));
//        System.out.println(saveTeacher.saveToListTeacher(musicTeacher, list));
//
//        for (Teacher teach : list) {
//            System.out.println(teach.getFirstName());
//        }

//        System.out.println("Added teachers to Teacher Group! ->");
//        TeacherGroup list2 = new TeacherGroup();
//        TeacherIterator teacherIterator = list.iterator();
//        while (teacherIterator.hasNext()) {
//            System.out.println(teacherIterator.next());

    }
}

