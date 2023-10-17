package AutoProg.Prog;

import AutoProg.Car.Avto;
import AutoProg.Car.AvtoComparatorSpeed;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Avto> avtoList = new ArrayList<>();
        Avto bmv = new Avto(" BMV ", " Sedan ", " Black ", 320, 2005);
        Avto lada = new Avto(" Lada ", " Sedan ", " Yellow ", 120, 2010);
        Avto ferrari = new Avto(" Ferrari ", " Sedan ", " Red ", 450, 2023);
        Avto smart = new Avto(" Smart ", " Hatchback ", " Blue ", 100, 2015);
        avtoList.add(bmv);
        avtoList.add(lada);
        avtoList.add(ferrari);
        avtoList.add(smart);

        System.out.println();
        Iterator<Avto> iter = avtoList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next()); }

        System.out.println();
        Comparator<Avto> speedCompare = new AvtoComparatorSpeed().thenComparing(new AvtoComparatorSpeed());
        TreeSet<Avto> listAvto = new TreeSet<>(speedCompare);
        listAvto.add(bmv);
        listAvto.add(lada);
        listAvto.add(ferrari);
        listAvto.add(smart);
        for (Avto car:listAvto) {
            System.out.println(" Statistics car speed: " +car.getCarName() + car.getMaxCarSpeed() + " km/h ");
        }
    }
}


