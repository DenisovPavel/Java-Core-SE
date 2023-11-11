package Company;

import java.util.Comparator;

public class WorkerComporator implements Comparator<Worker> {
    @Override
    public int compare(Worker w1, Worker w2) {
        if (w1.middleSalaryProMonth > w2.middleSalaryProMonth)
            return 1;
        if (w1.middleSalaryProMonth < w2.middleSalaryProMonth) {
            return -1;
        }
        return 0;
    }
}
