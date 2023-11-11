package JavaCoreEX;

public class Program {

    public static void main(String[] args) {

        BaseHuman human2;

        BaseHuman human1 = Human.create("Name", 34, 100, 20);
        //human1.age = -20;
        //human1.name = null;

        human1.getDisplayInfo();

    }

}
