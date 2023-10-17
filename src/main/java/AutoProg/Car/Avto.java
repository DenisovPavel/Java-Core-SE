package AutoProg.Car;

/**
 * @params Avto Автомобиль;
 */
public class Avto implements Comparable<Avto> {
    /**
     * @params carName Бренд Автомобиля;
     * @params typeOfCar Тип Автомобиля;
     * @params color Цвет Автомобиля;
     * @params maxCarSpeed Скорость Автомобиля;
     * @params dateOfManufacture Дата Производства Автомобиля;
     */
    private String carName;
    private String typeOfCar;
    private String color;
    private int maxCarSpeed;
    private int dateOfManufacture;


    public Avto(String carName, String typeOfCar, String color, int maxCarSpeed, int dateOfManufacture) {
        this.carName = carName;
        this.typeOfCar = typeOfCar;
        this.color = color;
        this.maxCarSpeed = maxCarSpeed;
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getCarName() {
        return carName;
    }

    public int getMaxCarSpeed() {
        return maxCarSpeed;
    }

    @Override
    public String toString() {
        return "Avto = " +
                " Brand -> " + carName + "; " +
                " TypeOfCar -> " + typeOfCar +"; "  +
                " Color -> " + color + "; " +
                " MaxCarSpeed -> " + maxCarSpeed + " km/h " +
                " DateOfManufacture -> " + dateOfManufacture + " year;";
    }
    /**
     * @param otherAvto the object to be compared.
     * @return Сортировка Автомобиля по марке Автомобиля;
     */
    @Override
    public int compareTo(Avto otherAvto) {
        return carName.compareTo(otherAvto.getCarName());
    }
}
