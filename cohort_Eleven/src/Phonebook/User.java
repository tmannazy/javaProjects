package Phonebook;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private final String lastName;
    private final String pin;
    private final String firstName;
    Phonebook phonebook;
    private ArrayList<User> listOfUsers;
    private ArrayList<Phonebook> userContacts;

    public User(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        phonebook = new Phonebook();
        listOfUsers = new ArrayList<>();
        userContacts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public boolean isPinCorrect(String pin) {
        if (Objects.equals(pin, this.pin)) {
            return true;
        }
        return false;
    }

    public int getSize() {
        return listOfUsers.size();
    }

    public ArrayList<User> getArrOfUsers() {
        return listOfUsers;
    }

    public void addNewUser(User newUser) {
        listOfUsers.add(newUser);
    }

    public void addNewContact(Contact newContact) {
        phonebook.addNewContact(newContact);
        userContacts.add(phonebook);
    }

    public ArrayList<Phonebook> getContactList() {
        return userContacts;
    }

    public void removeContact(Contact contact) {
        for (int j = 0; j < phonebook.getListOfContacts().size(); j++) {
            if (Objects.equals(phonebook.getListOfContacts().get(j).getPhoneNumber(), contact.getPhoneNumber())) {
                phonebook.getListOfContacts().remove(j);
                userContacts.remove(userContacts.get(j));
                break;
            }
        }
    }

    public int getContactSize() {
        return userContacts.size();
    }
}
