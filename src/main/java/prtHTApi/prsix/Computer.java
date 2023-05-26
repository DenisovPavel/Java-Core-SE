package prtHTApi.prsix;

public class Computer {
    /**
     * Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
     * <p>
     * Создать множество ноутбуков.
     * <p>
     * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
     * Критерии фильтрации можно хранить в Map. Например:
     * <p>
     * “Введите цифру, соответствующую необходимому критерию:
     * 1 - ОЗУ
     * 2 - Объём ЖД
     * 3 - Операционная система
     * 4 - Цвет …
     * <p>
     * // ram 400 => вывести ноутбуки, имеющие оперативную память, объем которой больше, чем 400
     * <p>
     * Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
     * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
     */
    private  int randomAccessMemory;
    private int hardDisk;
    private String operationSystem;
    private String color;


    public Computer(int randomAccessMemory, int hardDisk, String operationSystem, String color) {
        this.randomAccessMemory = randomAccessMemory;
        this.hardDisk = hardDisk;
        this.operationSystem = operationSystem;
        this.color = color;
    }






}
