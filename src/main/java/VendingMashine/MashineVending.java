package VendingMashine;


import java.util.ArrayList;
import java.util.List;

public class MashineVending {
    List<HotDrink> list = new ArrayList();


    public MashineVending(List<HotDrink> list) {
        this.list = list;
    }

    /**
     * @return Метод вывода Горячего напитка
     */
    public List<HotDrink> getHotDrink() {
        return list;
    }

    /**
     * @param list Метод пополнения Напитком -> Автомат
     */
    public void initProductName(List<HotDrink> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "MashineVending{" +
                "list=" + list +
                '}';
    }
}

