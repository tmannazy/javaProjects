package Phonebook;

public class Contact {
    private String lastName;
    private String phoneNumber;
    private String address;
    private String email;
    private String firstName;

    public Contact(String firstName, String lastName, String phoneNumber, String address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public Contact() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String name) {
        firstName = name;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public void setPhoneNumber(String newNum) {
        phoneNumber = newNum;
    }
}
