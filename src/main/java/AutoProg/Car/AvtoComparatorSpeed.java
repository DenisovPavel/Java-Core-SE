package AutoProg.Car;

import java.util.Comparator;
import java.util.List;

/**
 * @params AvtoComparatorSpeed Сортировка по скорости Автомобиля;
 */
public class AvtoComparatorSpeed implements Comparator<Avto> {

    /**
     * @param firstCarSpeed  the first object to be compared.
     * @param secondCarSpeed the second object to be compared.
     * @return сортировка по скорости Автомобиля;
     */
    @Override
    public int compare(Avto firstCarSpeed, Avto secondCarSpeed) {
        if (firstCarSpeed.getMaxCarSpeed() > secondCarSpeed.getMaxCarSpeed())
            return 1;
        else if (firstCarSpeed.getMaxCarSpeed() < secondCarSpeed.getMaxCarSpeed())
            return -1;
        else
            return 0;
    }
}


