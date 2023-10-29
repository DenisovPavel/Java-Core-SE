package Teacher;

import Teacher.User;

public class Teacher extends User {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected String subject;
    public Teacher(String firstName, String lastName, int age,String subject) {
        super(firstName, lastName);
        this.age = age;
        this.subject = subject;
    }



//    public Teacher(String firstName, String lastName, int age, String subject) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.subject = subject;
//    }

    public String getFirstName() {
        return getFirstName();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher: " +
                "Name = " + firstName + '\'' +
                ", Surname = " + lastName + '\'' +
                ", age: " + age +
                ", subject: " + subject;
    }
}