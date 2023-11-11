package Company;

import java.util.Iterator;
import java.util.List;

/**
 * @params TeamEmployees класс на основе EmployeeList создает общий список сотрудников;
 */
public class TeamEmployees extends EmployeeList {

    @Override
    public void createCollection(List<BaseEmployee> baseEmployeeList, Worker worker, Freelancer freelancer) {
        baseEmployeeList.add(worker);
        baseEmployeeList.add(freelancer);
    }

}

