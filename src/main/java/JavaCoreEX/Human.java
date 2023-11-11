package JavaCoreEX;

public class Human extends BaseHuman implements Runner{

    private int maxRun;

    private int maxJump;

    private Human(String name, int age, int maxRun, int maxJump){
        super(name, age);
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    /**
     * Фабричный метод для создания объекта Human
     * @param name Имя
     * @param age Возраст
     * @return объект Human
     * @throws RuntimeException Некорректное имя или возраст человека
     */
    public static Human create(String name, int age, int maxRun, int maxJump) throws RuntimeException{
        if (name == null || name.length() < 3){
            throw new RuntimeException("Имя указано некорректно.");
        }
        if (age <= 0){
            throw new RuntimeException("Возраст указан некорректно.");
        }

        return new Human(name, age, maxRun, maxJump);
    }


    @Override
    public String getDisplayInfo() {
        return String.format("%s - %d", name, age);
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

}
