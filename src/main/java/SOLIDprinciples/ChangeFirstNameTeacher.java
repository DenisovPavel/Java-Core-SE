package SOLIDprinciples;

public class ChangeFirstNameTeacher extends Teacher {
    public ChangeFirstNameTeacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age, subject);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
