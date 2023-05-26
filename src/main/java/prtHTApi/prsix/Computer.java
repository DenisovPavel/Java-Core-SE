package prtHTApi.prsix;

import java.util.Objects;
import java.util.Scanner;

public class Computer {


    private String brand;
    private Integer randomAccessMemory;
    private Integer hardDisk;
    private String operationSystem;
    private String color;
    private String manufacturerCountry;
    private Integer typeOfVideoCard;
    private Integer computerScreenDiagonal;

    public Computer(String brand, Integer randomAccessMemory, Integer hardDisk, String operationSystem,
                    String color, String manufacturerCountry, Integer typeOfVideoCard, Integer computerScreenDiagonal) {
        this.brand = brand;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDisk = hardDisk;
        this.operationSystem = operationSystem;
        this.color = color;
        this.manufacturerCountry = manufacturerCountry;
        this.typeOfVideoCard = typeOfVideoCard;
        this.computerScreenDiagonal = computerScreenDiagonal;
    }



    public Integer getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public Integer getHardDisk() {
        return hardDisk;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public Integer getTypeOfVideoCard() {
        return typeOfVideoCard;
    }

    public Integer getComputerScreenDiagonal() {
        return computerScreenDiagonal;
    }

    public String toString() {
        return "Brand: " + getBrand() + " " + "Color: " + getColor() + " " + "Diagonal: " +
                getComputerScreenDiagonal() + " " + "Country: " + getManufacturerCountry() +
                " " + "Operation System: " + getOperationSystem() + " " + "Ram: " +
                getRandomAccessMemory() + " " + "Capacity: " + getHardDisk() + " "
                + "VideoCard: " + getTypeOfVideoCard();
    }

    public static Computer inputUserComputer(String brand, Integer randomAccessMemory, Integer hardDisk, String operationSystem,
                                             String color, String manufacturerCountry, Integer typeOfVideoCard,
                                             String computerScreenDiagonal) throws NumberFormatException {

        Computer userComputer = new Computer(null, 0, 0, null, null,
                null, 0, 0);

        Scanner iscanner = new Scanner(System.in);
        System.out.println(" Put Diagonal(Example -> 24): ");

        try {
            userComputer.computerScreenDiagonal = Integer.parseInt(iscanner.next());
        } catch (NumberFormatException e0) {
            System.err.printf(" Not Correct Format!Put NUMBER! ");
            System.exit(0);

        }
        System.out.println(" Put RAM Capacity(Example -> 512): ");
        try {
            userComputer.randomAccessMemory = Integer.parseInt(iscanner.next());
        } catch (NumberFormatException e1) {
            System.err.printf(" Not Correct Format!Put NUMBER!  ");
            System.exit(0);
        }
        System.out.println(" Put Capacity HardDisk in GBytes (Example -> 40  ): ");
        try {
            userComputer.hardDisk = Integer.parseInt(iscanner.next());
        } catch (NumberFormatException e1) {
            System.err.printf(" Not Correct Format!Put NUMBER!  ");
            System.exit(0);
        }
        System.out.println(" Put VideoCard Type(Example -> 3080): ");
        try {
            userComputer.typeOfVideoCard = Integer.parseInt(iscanner.next());
        } catch (NumberFormatException e1) {
            System.err.printf(" Not Correct Format!Put NUMBER!  ");
            System.exit(0);
        }
        System.out.println("Put PC Brand(Example -> Acer): ");
        userComputer.brand = iscanner.next();
        System.out.println("Put Type of Operational System(Example -> Windows):");
        userComputer.operationSystem = iscanner.next();
        System.out.println("Put PC Color( Example -> Black):");
        userComputer.color = iscanner.next();
        System.out.println("Put Country of Manufacture(Example -> China):");
        userComputer.manufacturerCountry = iscanner.next();
        iscanner.close();
        return userComputer;
    }
    public int hashCode() {
        return Objects.hash(brand, randomAccessMemory, hardDisk,operationSystem, color,manufacturerCountry,
                typeOfVideoCard,computerScreenDiagonal);

    }

}



