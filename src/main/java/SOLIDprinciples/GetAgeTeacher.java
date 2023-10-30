package SOLIDprinciples;

public class GetAgeTeacher extends Teacher{
    public GetAgeTeacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age, subject);
    }

    public int getAgeTeacher() {
        return age;
    }

}
