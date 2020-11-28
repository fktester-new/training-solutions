package week05d05;

public class User {

    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        int indexOfAt = email.indexOf("@");
        if (indexOfAt == -1 || !email.substring(indexOfAt).contains(".")) {
            throw new IllegalArgumentException("Hibás e-mail cím \'@\' vagy \'.\' hiányzik!");
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getEmail() {
        return email;
    }
}
