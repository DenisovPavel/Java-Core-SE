package SOLIDprinciples;

public class GetFirstNameTeacher extends Teacher{
    public GetFirstNameTeacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age, subject);
    }
    public String getFirstName() {
        return firstName;
    }
}
