package SemApiTsks.sem3;
//cкиньте задание плиз
//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//        Вывести название каждой планеты и количество его повторений в списке.
//будем сразу закидывать значения или через цикл с другого листа?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class tsk2 {
//    public static void main(String[] args) {
//        String mercury = new String("Меркурий");
//        String venus = new String("Венера");
//        String earth = new String("Земля");
//        String mars = new String("Марс");
//        String jupiter = new String("Юпитер");
//        String saturn = new String("Сатурн");
//        String uranus = new String("Уран");
//        String neptune = new String("Нептун");

//        ArrayList<String> planets = new ArrayList<>(Arrays.asList(new String[]{"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"}));
//        //    addPlanetsNames(planets); //add
//        System.out.println(planets); // unsorted list
//        Collections.sort(planets); //sort
//        System.out.println(planets); //print
//    }
//    public static ArrayList<String> addPlanetsNames(ArrayList<String> inputList) {
//        ArrayList<String> outlist = new ArrayList<>();
//        for (int i = 0; i < inputList.size(); i++) {
//            outlist.add(inputList.get(i));
//        }
//        return inputList;
//    }
//}



    public static void main(String[] args) {
        ArrayList<String> planets = getPlanets();
        Map<String, Integer> map = new HashMap<>();
        for (String pl : planets) {
            Integer count = map.get(pl);
            if (count == null)
                map.put(pl, 1);
            else
                map.put(pl, ++count);
        }
        System.out.println(map.toString());
    }

    public static ArrayList<String> getPlanets() {
        ArrayList<String> planets = new ArrayList<>(Arrays.asList(new String[]{"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"}));
        //С помощью метода                          Arrays.asList() массив передается в конструктор List в качестве параметра для конструктора
        planets.add("Юпитер");
        planets.add("Юпитер");
        planets.add("Меркурий");
        planets.add("Юпитер");
        planets.add("Венера");
        planets.add("Меркурий");
        planets.add("Нептун");
        planets.add("Сатурн");
        planets.add("Земля");
        planets.add("Уран");
        planets.add("Меркурий");
        planets.add("Уран");
        planets.add("Юпитер");
        planets.add("Земля");
        planets.add("Меркурий");
        return planets;
    }
//    public class programm {
//        public static void main(String[] args) {
//            String[] array = new String[] { "Земля", "Сатурн", "Марс", "Венера", "Нептун", "Уран", "Меркурий", "Юпитер",
//                    "Плутон" };
//            List<String> planets = new ArrayList<String>();
//            Random rnd = new Random();
//            for (int i = 0; i < array.length; i++) {
//                planets.add(array[rnd.nextInt(array.length)]);
//            }
//            System.out.println(planets);
//            Map<String, Integer> dictionary = new HashMap<String, Integer>();
//            int count = 1;
//            for (int i = 0; i < planets.size(); i++) {
//                if (dictionary.containsKey(planets.get(i))) {
//                    dictionary.put(planets.get(i), dictionary.get(planets.get(i)) + 1);
//                } else {
//                    dictionary.put(planets.get(i), count);
//                }
//            }
//            System.out.println(dictionary);
//
//        }
//    }

}
