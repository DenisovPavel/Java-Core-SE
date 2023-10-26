package SOLIDprinciples;

public class ChangeLastNameTeacher extends Teacher{

    public ChangeLastNameTeacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age, subject);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
