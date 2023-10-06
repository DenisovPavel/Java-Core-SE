package VendingMashine;



import java.util.List;

public class HotDrinksMashine extends MashineVending {


    public HotDrinksMashine(List<HotDrink> list) {
        super(list);
    }

    @Override
    public List<HotDrink> getHotDrink() {
        return super.getHotDrink();

    }

    @Override
    public void initProductName(List<HotDrink> list) {
        super.initProductName(list);
        System.out.println();
    }

    @Override
    public String toString() {
        return "HotDrinksMashine{" +
                "list=" + list +
                '}';
    }
}
