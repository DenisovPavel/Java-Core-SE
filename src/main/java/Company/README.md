##   

1. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой

- _[BaseEmployee][1]_
- _[Freelancer][2]_
- _[Worker][3]_

2. Создал интерфейс для абстрактного метода с формулами расчета зарплаты(изначально пустой, далее переопределен
   в классах наследниках);

- [operationSalary][4]

3. Создать на базе абстрактного класса массив/коллекцию сотрудников и заполнить его.

- _[EmployeeList][5]_ -> _[TeamEmployees][6]_

4. Реализовать интерфейсы для возможности сортировки массива/коллекции

- обратите ваше внимание на интерфейсы Comparator, Comparable)
- добавьте новое состояние на урове базового типа
  и создайте свой уникальный компаратор.
- _[WorkerComparator][7]_
- _[FreelancerComparator][8]_

5. Дальнейшие действия определены в классе [MainApp][9]

[1]: https://github.com/DenisovPavel/Java-Core-SE/blob/main/src/main/java/Company/BaseEmployee.java

[2]: https://github.com/DenisovPavel/Java-Core-SE/blob/main/src/main/java/Company/Freelancer.java

[3]: https://github.com/DenisovPavel/Java-Core-SE/blob/main/src/main/java/Company/Worker.java

[4]: https://github.com/DenisovPavel/Java-Core-SE/blob/main/src/main/java/Company/operationsSalary.java

[5]: https://github.com/DenisovPavel/Java-Core-SE/blob/main/src/main/java/Company/EmployeeList.java

[6]: https://github.com/DenisovPavel/Java-Core-SE/blob/main/src/main/java/Company/TeamEmployees.java

[7]: https://github.com/DenisovPavel/Java-Core-SE/blob/main/src/main/java/Company/WorkerComporator.java

[8]: https://github.com/DenisovPavel/Java-Core-SE/blob/main/src/main/java/Company/FreelancerComporator.java

[9]: https://github.com/DenisovPavel/Java-Core-SE/blob/main/src/main/java/Company/MainApp.java