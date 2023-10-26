package SOLIDprinciples;

public class GetUserInfoToString extends User{
    public GetUserInfoToString(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
