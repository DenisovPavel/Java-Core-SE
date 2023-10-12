package Students;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student Alex = new Student("Alex", "Popov", 20);
        Student Masha = new Student("Masha", "Ivanova", 22);
        Student Aleksandr = new Student("Aleksandr", "Popovich", 25);

        List<Student> numberoFGroup = new ArrayList<>();
        numberoFGroup.add(Alex);
        numberoFGroup.add(Masha);
        numberoFGroup.add(Aleksandr);

        System.out.println(numberoFGroup);
//        for (Student number:numberoFGroup) {
//            System.out.println(numberoFGroup);
//        }

//        System.out.println("Iteration by List:");
//        for (Student student : numberoFGroup) {
//            System.out.println("Name: " + student.getName());
//        System.out.println("iterating:");
        Iterator<Student> iterator = numberoFGroup.iterator();
        while (iterator.hasNext()) {
            Student person = iterator.next();
            System.out.println("Name: " + person.getName());
          //  System.out.println("Name: " + person.getSurname());

        }
    }
}

