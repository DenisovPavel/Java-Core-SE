package Teacher;

import java.util.Comparator;

public class teacherComparator<T extends User> implements Comparator<T> {
    /**
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return Name differance.
     */

    @Override
    public int compare(T o1, T o2) {
        return o1.getFirstName().length() - o2.getFirstName().length();
    }
}
