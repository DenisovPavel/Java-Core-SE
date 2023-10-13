package Students;

import java.util.Comparator;

public class StudentComporator implements Comparator<Student> {

    /**
     * @param firstStudent  the first object to be compared.
     * @param secondStudent the second object to be compared.
     * @return compare by NAME
     */
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.getName().compareTo(secondStudent.getName());
    }

    public static class StudentAgeComparator implements Comparator<Student> {

        public int compare(Student ageFirstStudent, Student ageSecondStudent) {

            if (ageFirstStudent.getAge() > ageSecondStudent.getAge())
                return 1;
            else if (ageFirstStudent.getAge() < ageSecondStudent.getAge())
                return -1;
            else
                return 0;
        }
    }
}