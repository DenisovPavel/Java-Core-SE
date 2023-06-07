package ToysShop;

public class Toys {
    private int toyID;
    private String toyName;
    private int toyCount;
    private double toyWeight;

    public Toys(int toyID, String toyName, int toyCount, double toyWeight) {
        this.toyID = toyID;
        this.toyName = toyName;
        this.toyCount = toyCount;
        this.toyWeight = toyWeight;
    }

    public int getToyID() {
        return toyID;
    }

    public String getToyName() {
        return toyName;
    }

    public int getToyCount() {
        return toyCount;
    }

    public void setToyCount(int toyCount) {
        this.toyCount = toyCount;
    }

    public double getToyWeight() {
        return toyWeight;
    }

    public void setToyWeight(double toyWeight) {
        this.toyWeight = toyWeight;
    }
        @Override
        public String toString () {
            return "\n " + "|Toy_ID: " + getToyID() + " " + "| Toy_Name: " + " " + getToyName() + " "
                    + "|Toy_count: " + getToyCount() + " " + "|Toy_Weight: " + getToyWeight() + "|" + "\n";

        }
    }


