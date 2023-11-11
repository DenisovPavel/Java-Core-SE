package Company;

/**
 * @params BaseEmployee - базовый класс работника;
 * @params middleSalaryProMonth - среднемесячная заработная плата сотрудника;
 */

public class BaseEmployee {
    String name;
    String job;

    public BaseEmployee(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return " BaseEmployee: "
                + " Name of employee: "
                + name + " job: "
                + job + "\n";
    }
}
