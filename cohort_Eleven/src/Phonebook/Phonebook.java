package Phonebook;


import java.util.ArrayList;
import java.util.Objects;

public class Phonebook {
    private ArrayList<Contact> listOfContacts;

    public Phonebook() {
        listOfContacts = new ArrayList<>();
    }

    public void addNewContact(Contact contact) {
        listOfContacts.add(contact);
    }

    public int getSize() {
        return listOfContacts.size();
    }

    public Contact searchContact(String name) {
        for (Contact listOfContact : listOfContacts) {
            if (Objects.equals(listOfContact.getFirstName(), name) ||
                Objects.equals(listOfContact.getLastName(), name)) {
                return listOfContact;
            }
        }
        return null;
    }

    public Contact searchByNum(String phoneNumber) {
        for (Contact listOfContact : listOfContacts) {
            if (Objects.equals(listOfContact.getPhoneNumber(), phoneNumber)) {
                return listOfContact;
            }
        }
        return null;
    }

//    public String getContactFirtName() {
//    }
}
