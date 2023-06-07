package ToysShop;

public class processObjects {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        toyStore.addNewToy(new Toys(1, "Rabbit", 2, 25));//ID|кролик|количество|вес
        toyStore.addNewToy(new Toys(2, "Robot", 4, 6));//ID|робот|количество|вес
        toyStore.addNewToy(new Toys(3, "Doll", 18, 5));//ID|кукла|количество|вес
        toyStore.addNewToy(new Toys(4, "Aircraft", 3, 3));//ID|самолет|количество|вес
        toyStore.addNewToy(new Toys(5, "Pyramid", 15, 10));//ID|пирамида|количество|вес
        toyStore.addNewToy(new Toys(6, "SpinningTop", 22, 2));//ID|волчек|количество|вес
        toyStore.addNewToy(new Toys(7, "Ball", 7, 6));//ID|мяч|количество|вес
        toyStore.addNewToy(new Toys(8, "Book", 25, 1));//ID|книга|количество|вес
        toyStore.addNewToy(new Toys(9, "Bird", 4, 8));//ID|птица|количество|вес
        toyStore.addNewToy(new Toys(10, "Cube", 17, 4));//ID|куб|количество|вес
        //-------------------------------------
        toyStore.changeToyWeight(1,  6);
        toyStore.changeToyWeight(2, 7);
        toyStore.changeToyWeight(3, 6);
        toyStore.changeToyWeight(4, 4);
        toyStore.changeToyWeight(5, 12);
        toyStore.changeToyWeight(6, 23);
        toyStore.changeToyWeight(7, 5);
        toyStore.changeToyWeight(8, 20);
        toyStore.changeToyWeight(9, 9);
        toyStore.changeToyWeight(10, 22);
        //---------------------------------------
        for (int i = 0; i <= 3; i++) {
            toyStore.chooseWinnerToy();
            Toys winnerToy = toyStore.getWinnerToy();
            System.out.println("===========================>");
            System.out.println("Congrats!!!You win FREE TOY ======> " + winnerToy.getToyName() + " <====================")  ;
            System.out.println("===========================>");
            System.out.println("---------------------------------------------------------");
            System.out.println("ToysStore: \n" + toyStore);
        }
    }
}