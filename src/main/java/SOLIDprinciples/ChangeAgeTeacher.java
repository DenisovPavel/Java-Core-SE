package SOLIDprinciples;

public class ChangeAgeTeacher extends Teacher{
    public ChangeAgeTeacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age, subject);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
