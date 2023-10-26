package SOLIDprinciples;

public class ChangeTeacherSubject extends Teacher{

    public ChangeTeacherSubject(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age, subject);
    }
    public void setTeacherSubject(String subject){
         this.subject = subject;
    }
}
