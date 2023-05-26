package SemApiTsks.sem6;

public class alwaysHungryCat extends Cat {

    public alwaysHungryCat(String name) {
        super(name, Integer.MAX_VALUE); // вызов конструктора родительского класса
    }

    @Override
    public void eat(Plate plate) {
//        super.eat(plate);
        hungry = true;
    }

}
