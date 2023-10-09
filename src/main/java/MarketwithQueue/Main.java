package MarketwithQueue;

public class Main {
    public static void main(String[] args) {
//            Human human = new Human();
//            human.setMakeOrder();
//            human.setTakeOrder();
//            human.isMakeOrder();
//            System.out.println(human.isMakeOrder());
//            human.isTakeOrder();
//            System.out.println(human.isTakeOrder());


        Market MRK = new Market();
        Human Ivan = new Human("Ivan");
        MRK.acceptToMarket(Ivan);
        MRK.update();

//        Market MRK = new Market();
//        Human Ivan = new Human("Ivan");
//        Human Oleg = new Human("Oleg");
//        Human Victor = new Human("Victor");
//        Human Misha = new Human("Misha");
//        MRK.acceptToMarket(Ivan);
//        MRK.acceptToMarket(Oleg);
//        MRK.acceptToMarket(Victor);
//        MRK.update();
//        MRK.acceptToMarket(Misha);

    }
}
