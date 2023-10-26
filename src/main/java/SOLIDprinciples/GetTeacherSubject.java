package SOLIDprinciples;

public class GetTeacherSubject extends Teacher {
    public GetTeacherSubject(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age, subject);
    }

    public String getSubject() {
        return subject;
    }
}
