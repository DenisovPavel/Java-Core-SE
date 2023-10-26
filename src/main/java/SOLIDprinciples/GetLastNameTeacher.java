package SOLIDprinciples;

public class GetLastNameTeacher extends Teacher {
    public GetLastNameTeacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age, subject);
    }

    public String getLastName() {
    return lastName;
}
}
