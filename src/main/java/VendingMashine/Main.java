package VendingMashine;



import java.util.List;

/**
 * Клиентский код программы
 */
public class Main {
    public static void main(String[] args) {
        HotDrink Coffee = new HotDrink("Latte", 100, 70);
        HotDrink Tea = new HotDrink("Tess", 80, 80);
        HotDrink Hotchocolate = new HotDrink("HotChocolate ", 120, 60);
        System.out.println();
        HotDrinksMashine FirstApparatHotDrinks = new HotDrinksMashine(List.of(Coffee));
        System.out.println(FirstApparatHotDrinks.getHotDrink());
        System.out.println();
        HotDrinksMashine SecondApparatHotDrinks = new HotDrinksMashine(List.of(Tea));
        System.out.println(SecondApparatHotDrinks.getHotDrink());
        System.out.println();
        HotDrinksMashine ThirdApparatHotDrinks = new HotDrinksMashine(List.of(Hotchocolate));
        System.out.println(ThirdApparatHotDrinks.getHotDrink());
    }
}
