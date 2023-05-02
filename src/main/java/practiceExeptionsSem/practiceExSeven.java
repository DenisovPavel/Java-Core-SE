package practiceExeptionsSem;



import java.io.FileReader;
import java.io.IOException;

public class practiceExSeven {
    public static void main(String[] args) {
        FileReader ireader = null;
        try {
            ireader = new FileReader("ifile");
            ireader.read();

        } catch (IOException | RuntimeException e) {// "е" говорит какой именно ех
            System.out.println("Catch Exception" + e.getClass().getSimpleName());

        } finally {
            if (ireader != null) {
                try {
                    ireader.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
        }

    }
}