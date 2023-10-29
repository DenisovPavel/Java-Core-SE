## Задачи:
- Взять реализованный код   и продемонстрировать применение принципов.
- Нужно в проекте прокомментировать участки кода, которые рефакторим, 
какой принцип применяем и почему.

 ### Принципы SOLID:
1. Single Responsibility Principle (Принцип единственной ответственности).
- Класс User,Teacher с полями  firstName,lastName,age,subject- поделены на отдельные классы с выводом и изменением 
- информации каждого поля в отдельности. 
2. Open Closed Principle (Принцип открытости/закрытости).
- Создан Класс SaveTeacherInGroup , который имплементирует созданный интерфейс SaveTeacherInTeacherGroup
- (c методом сохранения учителя в список) ;
3. Liskov’s Substitution Principle (Принцип подстановки Барбары Лисков).
   В качестве примера создано 2 интерфейса Save&Show TeachersInGroup
4. Interface Segregation Principle (Принцип разделения интерфейса).В качестве примера создано 2 интерфейса
   Save&Show TeachersInGroup
5. Dependency Inversion Principle (Принцип инверсии зависимостей).В качестве примера создано 2 интерфейса 
Save&Show TeachersInGroup.
<div align="center">
  <img src="https://wpvip.edutopia.org/wp-content/uploads/2022/10/danpage-Edutopia-ClassFF2.jpg?w=2000&quality=85" width="600" height="300"/>
</div>