package JavaCoreEX;

public abstract class BaseHuman {

    protected String name;

    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3){
            throw new RuntimeException("Имя указано некорректно.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            throw new RuntimeException("Возраст указан некорректно.");
        }
        this.age = age;
    }

    protected BaseHuman(String name){
        this(name, 18);
    }

    /**
     * Инициализация состояния человека
     * @param name Имя
     * @param age Возраст
     * @throws RuntimeException Некорректное имя или возраст человека
     */
    protected BaseHuman(String name, int age) throws RuntimeException {
        this.name = name;
        this.age = age;
    }


    public abstract String getDisplayInfo();

}
