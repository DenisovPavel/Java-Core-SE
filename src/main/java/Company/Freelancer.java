package Company;

/**
 * @params Freelancer - Временный сотрудник(На сделке с почасовой оплатой)
 * @params hourlyPay - почасовая оплата;
 * @params checkSalary - метод расчёта среднемесячной заработной платы.
 */

public class Freelancer extends BaseEmployee implements operationsSalary {
    double hourlyPay;

    public Freelancer(String name, String job, double hourlyPay) {
        super(name, job);
        this.hourlyPay = hourlyPay;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    @Override
    public double checkSalary() {
        double middleSalaryProMonth = 20.8 * 8 * hourlyPay;
        return middleSalaryProMonth;
    }

    @Override
    public String toString() {
        return " Freelancer " +
                "Name: " + name + "," +
                " Job: " + job + "," +
                " HourlyPay: " + hourlyPay + " Salary pro Month: " + checkSalary() + " RUB" + "\n";
    }
}
