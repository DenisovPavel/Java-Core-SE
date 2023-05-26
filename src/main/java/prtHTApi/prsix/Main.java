package prtHTApi.prsix;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Computer comp1 = new Computer("Asus", 512, 100, "Windows",
                "Silver", "Taiwan", 4090, 17);
        Computer comp2 = new Computer("Dell", 4000, 800, "Linux",
                "Black", "China", 3080, 24);
        Computer comp3 = new Computer("Acer", 2000, 200, "Windows",
                "White", "Taiwan", 4090, 15);
        Computer comp4 = new Computer("Honor", 512, 500, "Linux",
                "Black", "China", 4090, 17);
        Computer comp5 = new Computer("MacBook", 4000, 100, "MACOS",
                "Black", "USA", 4080, 15);
        Computer comp6 = new Computer("Intel", 512, 500, "Windows",
                "Silver", "USA", 3090, 17);
        Computer comp7 = new Computer("Lenovo", 512, 280, "Windows",
                "Black", "China", 3070, 15);
        Computer comp8 = new Computer("HP", 512, 1000, "Linux",
                "White", "USA", 4090, 15);
        Computer comp9 = new Computer("Huawei", 512, 250, "Windows",
                "Grey", "China", 3080, 15);
        Computer comp10 = new Computer("Dell", 512, 500, "Windows",
                "Black", "China", 4090, 24);

        HashSet<Computer> compSet = new HashSet<>();
        compSet.add(comp1);
        compSet.add(comp2);
        compSet.add(comp3);
        compSet.add(comp4);
        compSet.add(comp5);
        compSet.add(comp6);
        compSet.add(comp7);
        compSet.add(comp8);
        compSet.add(comp9);
        compSet.add(comp10);

        Computer userInParam = Computer.inputUserComputer(null, 0, 0, null,
                null, null, 0, null);
        showMatches(compSet,userInParam);
    }

    public static void showMatches(HashSet<Computer> compSet, Computer userInParam) {

        for (Computer outcomp : compSet) {

            if (outcomp.getBrand().matches( userInParam.getBrand()) &&
                    outcomp.getRandomAccessMemory().intValue() == userInParam.getRandomAccessMemory().intValue() &&
                    outcomp.getHardDisk().intValue() == userInParam.getHardDisk().intValue() &&
                    outcomp.getOperationSystem().matches( userInParam.getOperationSystem()) &&
                    outcomp.getColor().matches( userInParam.getColor()) &&
                    outcomp.getManufacturerCountry().matches( userInParam.getManufacturerCountry()) &&
                    outcomp.getTypeOfVideoCard().intValue() == userInParam.getTypeOfVideoCard().intValue() &&
                    outcomp.getComputerScreenDiagonal().intValue() ==
                            userInParam.getComputerScreenDiagonal().intValue()) {
                System.out.println("Brand: " + outcomp.getBrand() + " " +
                        "Color: " + outcomp.getColor() + " " +
                        "Diagonal: " +
                        outcomp.getComputerScreenDiagonal() + " " +
                        "Country: " +
                        outcomp.getManufacturerCountry() + " " +
                        "Operation System: " +
                        outcomp.getOperationSystem() + " "
                        + "Ram: " +
                        outcomp.getRandomAccessMemory() + " " +
                        "Capacity of HardDisk: " +
                        outcomp.getHardDisk() + " "
                        + "Type of VideoCard: " +
                        outcomp.getTypeOfVideoCard());

            } else {

                System.out.println("Brand: " + outcomp.getBrand() +
                        " ->  zero matches!");

            }
        }

    }
}

