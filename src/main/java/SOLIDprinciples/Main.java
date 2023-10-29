package SOLIDprinciples;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher historyTeacher = new Teacher("Oleg", "Petrov", 22, "History");
        Teacher mathTeacher = new Teacher("Oksana", "Balotovna", 23, "Math");
        Teacher biologyTeacher = new Teacher("Pavel", "Sidorov", 44, "Biology");
        Teacher geographyTeacher = new Teacher("Mikhail", "Volodin", 33, "Geography");
        Teacher musicTeacher = new Teacher("Alena", "Petrova", 23, "Music");

        List<Teacher> teachers = new ArrayList<>();

        SaveTeacherInGroup saveTeacherInGroup = new SaveTeacherInGroup();

        saveTeacherInGroup.saveTeacherInGroup(historyTeacher, teachers);
        saveTeacherInGroup.saveTeacherInGroup(mathTeacher, teachers);
        saveTeacherInGroup.saveTeacherInGroup(biologyTeacher, teachers);
        saveTeacherInGroup.saveTeacherInGroup(geographyTeacher, teachers);
        saveTeacherInGroup.saveTeacherInGroup(musicTeacher, teachers);

        ShowTeacherGroupList showTeacherGroupList = new ShowTeacherGroupList();
        showTeacherGroupList.showTeacher(teachers);


    }
}

