package Company;


import java.util.*;


public class MainApp {
    public static void main(String[] args) {

        List<BaseEmployee> baseEmployees = new ArrayList<>();

        Freelancer Pavel = new Freelancer("Pavel", "UX/UI designer", 3700.22);
/**
 * Далее идет проверка Сотрудника с почасовой оплатой, отработка метода checkSalary();
 */
        System.out.println("----------------------");
        Pavel.checkSalary();
        System.out.println(Pavel);
        System.out.println("----------------------");

        Freelancer Leo = new Freelancer("Leo", "SMM specialist", 3500.78);
        Freelancer Mark = new Freelancer("Mark", "Developer ", 4200.18);
        Freelancer Ekaterina = new Freelancer("Ekaterina", "SEO", 4700.57);
        Freelancer Elizaveta = new Freelancer("Elizaveta", "DevOps", 5000.30);
/**
 * Далее идет проверка Сотрудника с фиксированной оплатой, отработка метода checkSalary();
 */

        Worker Mary = new Worker("Mary", "Businesswoman", 300000.22);
        Mary.checkSalary();
        System.out.println(Mary);
        System.out.println("----------------------");

        Worker Kate = new Worker("Kate", "Doctor", 70000.700);
        Worker Bob = new Worker("Bob", "Driver", 120000.700);
        Worker John = new Worker("John", "Fireman", 90000.700);
        Worker Ivan = new Worker("Ivan", "Builder", 85000.700);

        TeamEmployees teamEmployees = new TeamEmployees();
        /**
         * @createCollection создание единой коллекции сотрудников(с фикс и почасовой - ставками)
         */
        teamEmployees.createCollection(baseEmployees, Mary, Pavel);
        teamEmployees.createCollection(baseEmployees, Kate, Leo);
        teamEmployees.createCollection(baseEmployees, Bob, Mark);
        teamEmployees.createCollection(baseEmployees, John, Ekaterina);
        teamEmployees.createCollection(baseEmployees, Ivan, Elizaveta);
        System.out.println(baseEmployees);


        /**
         * В качестве пeребора было использованно поле профессия Freelancer's;
         */
        FreelancerComporator freelancerComporator = new FreelancerComporator();
        TreeSet<Freelancer> freelancers = new TreeSet<Freelancer>(freelancerComporator);
        freelancers.add(new Freelancer("Pavel", "UX/UI designer", 3700.22));
        freelancers.add(new Freelancer("Leo", "SMM specialist", 3500.78));
        freelancers.add(new Freelancer("Mark", "Developer ", 4200.18));
        freelancers.add(new Freelancer("Ekaterina", "SEO", 4700.57));
        freelancers.add(new Freelancer("Elizaveta", "DevOps", 5000.30));
        for (Freelancer freelancer : freelancers) {
            System.out.println(freelancer.job);
        }
/**
 * Далее, в качестве проверки проверяем сотрудников по фиксированной зарплате;
 * Исходя из того что мы используем Treeset, порядок будет от меньшего к большему.
 */
        System.out.println("---------------------");
        WorkerComporator workerComporator = new WorkerComporator();
        TreeSet<Worker> workers = new TreeSet<Worker>(workerComporator);
        workers.add(Kate);
        workers.add(Bob);
        for (Worker w : workers) {
            System.out.println(w.name + w.middleSalaryProMonth);
        }


//        EmployeeHolder holder = new EmployeeHolder(Arrays.stream().toList());
//        for (Freelancer freelancer : holder) {
//            System.out.println(freelancer);
    }

}



