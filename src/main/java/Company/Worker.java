package Company;

/**
 * @params Worker - Сотрудник работающий на постоянной основе;
 * @params checkSalary - метод расчёта среднемесячной заработной платы.
 */
public class Worker extends BaseEmployee implements operationsSalary {
    public double getMiddleSalaryProMonth() {
        return middleSalaryProMonth;
    }

    double middleSalaryProMonth;

    public Worker(String name, String job, double middleSalaryProMonth) {
        super(name, job);
        this.middleSalaryProMonth = middleSalaryProMonth;
    }

    @Override
    public double checkSalary() {
        return middleSalaryProMonth;
    }

    @Override
    public String toString() {
        return " Worker" +
                "Name: " + name + "," +
                " Job: " + job + "," +
                " Salary pro Month: " + middleSalaryProMonth + " RUB" + "\n";
    }
}
