package Company;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;

public class EmployeeHolder  implements Iterable<Freelancer>{
        private final List<Freelancer> freelancers;

        public EmployeeHolder(List<Freelancer> freelancers){
            this.freelancers = freelancers;
        }

        @NotNull
        @Override
        public Iterator<Freelancer> iterator() {
            return freelancers.iterator();
        }
}
