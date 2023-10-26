package SOLIDprinciples;

public class GetLastNameUser extends User {
    public GetLastNameUser(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getLastName() {
        return lastName;
    }
}
