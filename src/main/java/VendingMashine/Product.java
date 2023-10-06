package VendingMashine;

/**
 * Шаблон любого продукта
 */
public class Product {

    String nameProduct;
    int priceProduct;

    /**
     *
     * @param nameProduct  Название продукта
     * @param priceProduct  Стоимость продукта
     */
    public Product(String nameProduct, int priceProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    /**
     *
     * @return Метод вывода Название продукта
     */
    public String getNameProduct() {
        return nameProduct;
    }

    /**
     *
     * @return Метод вывода Стоимости продукта
     */
    public int getPriceProduct() {
        return priceProduct;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}

