package VendingMashine;

/**
 * Шаблон горячего напитка
 */
public class HotDrink extends Product {
    int temperatureHotDrink;

    /**
     * @param nameProduct         Название горячего напитка
     * @param priceProduct        Стоимость горячего напитка
     * @param temperatureHotDrink Температура горячего напитка
     */
    public HotDrink(String nameProduct, int priceProduct, int temperatureHotDrink) {
        super(nameProduct, priceProduct);
        this.temperatureHotDrink = temperatureHotDrink;
    }

    @Override
    public String toString() {
        return
                "nameProduct" + " : " + nameProduct +
                ", priceProduct " + " : " + priceProduct +
                ", temperatureHotDrink" + " : " + priceProduct;
    }
}





