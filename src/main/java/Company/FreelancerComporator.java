package Company;

import java.util.Comparator;

public class FreelancerComporator implements Comparator<Freelancer> {

    @Override
    public int compare(Freelancer f1, Freelancer f2) {
        return f1.job.compareTo(f2.job);
    }
}

