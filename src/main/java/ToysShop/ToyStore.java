package ToysShop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
public class ToyStore {
        private ArrayList<Toys> toys = new ArrayList<Toys>();
        private ArrayList<Toys> toysForWinners = new ArrayList<Toys>();
        private Random random = new Random();

        public void addNewToy(Toys toy) {
            toys.add(toy);
        }

        public void changeToyWeight(int id, double weight) {
            for (Toys toy : toys) {
                if (toy.getToyID() == id) {
                    toy.setToyWeight(weight);
                }
            }
        }

        public Toys getWinnerToy() {
            if (toysForWinners.isEmpty()) {
                return null;
            }
            Toys winnerToy = toysForWinners.get(0);
            toysForWinners.remove(0);
            dropToysCount(winnerToy);
            saveToyToFile(winnerToy);
            return winnerToy;
        }

        public void chooseWinnerToy() {
            double totalWeight = 0;
            for (Toys toy : toys) {
                totalWeight += toy.getToyWeight();
            }
            double randomValue = random.nextDouble() * totalWeight;
            double weightSum = 0;
            for (Toys toy : toys) {
                weightSum += toy.getToyWeight();
                if (randomValue <= weightSum) {
                    toysForWinners.add(toy);
                    break;
                }
            }
        }

        private void dropToysCount(Toys toy) {
            for (Toys toys1 : toys) {
                if (toys1.getToyID() == toys1.getToyID()) {
                    toys1.setToyCount((toys1.getToyCount() - 1));
                    break;
                }
            }
        }

        private void saveToyToFile(Toys toy) {
            String newName = "toyWinners.txt";
            try {
                File file = new File(newName);
                FileWriter writer = new FileWriter(file, true);
                writer.write(toy.getToyName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Attention!Can`t add toy to list : " + e.getMessage());
            }
        }

    public String toString() {
        return "ToysStore:" + this.toys + "}";
    }
}