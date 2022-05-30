package Estore;

class Users {
    private int age;
    private String emailAddress;
    private String homeAddress;
    private String name;
    private String password;
    private String phoneNumber;

    public int age() {
        return age;
    }

    public Users setAge(int age) {
        this.age = age;
        return this;
    }

    public String emailAddress() {
        return emailAddress;
    }

    public Users setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public String homeAddress() {
        return homeAddress;
    }

    public Users setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }

    public String name() {
        return name;
    }

    public Users setName(String name) {
        this.name = name;
        return this;
    }

    public Users setPassword(String password) {
        this.password = password;
        return this;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public Users setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}



