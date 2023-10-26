package SOLIDprinciples;

public class User {

    protected String firstName;
    protected String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public User() {
    }
    public String getFirstName() {
        return firstName;
    }
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName;
    }
}


