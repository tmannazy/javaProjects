package PhonebookStorage;

import java.util.ArrayList;

public class User {
    private final String lastName;
    private final String pin;
    private final String firstName;
    Phonebook phonebook;
    private ArrayList<Phonebook> userContacts;

    public User(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        phonebook = new Phonebook();
        userContacts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isPinCorrect(String name, String pin) {
        if (this.pin.equalsIgnoreCase(pin) && this.firstName.equalsIgnoreCase(name)) {
            return true;
        }
        throw new IllegalArgumentException("Pin is not correct!");
    }

    public void addNewContact(Contact newContact) {
        phonebook.addNewContact(newContact);
        userContacts.add(phonebook);
    }

    public ArrayList<Phonebook> getPhonebookContactList() {
        return userContacts;
    }

    public void removeContact(int contact) {
        for (int j = 0; j < phonebook.getListOfContacts().size(); j++) {
            if (j == contact - 1) {
                phonebook.getListOfContacts().remove(j);
                userContacts.remove(userContacts.get(j));
                break;
            }
        }
    }

    public int getContactSize() {
        return userContacts.size();
    }

//    public String toString() {
//
//    }


}
