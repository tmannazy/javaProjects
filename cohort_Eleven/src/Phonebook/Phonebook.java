package Phonebook;


import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Objects;

public class Phonebook {
    Contact contact;
    private final ArrayList<Contact> listOfContacts;

    public Phonebook() {
        listOfContacts = new ArrayList<>();
        contact = new Contact();
    }

    public void addNewContact(Contact contact) {
        listOfContacts.add(contact);
    }

    public int getSize() {
        return listOfContacts.size();
    }

    public Contact searchContact(String name) {
        Contact listOfContact = getContactInfo(name);
        if (listOfContact != null) return listOfContact;
        return null;
    }

    @Nullable
    private Contact getContactInfo(String name) {
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

    public Contact getContactEmail(String email) {
        for (Contact listOfContact : listOfContacts) {
            if (Objects.equals(listOfContact.getEmail(), email)) {
                return listOfContact;
            }
        }
        return null;
    }

    public Contact getContactAddress(String address) {
        for (Contact listOfContact : listOfContacts) {
            if (Objects.equals(listOfContact.getAddress(), address)) {
                return listOfContact;
            }
        }
        return null;
    }

    public ArrayList<Contact> getListOfContacts() {
        return listOfContacts;
    }

    public void editContactName(String firstName, String lastName, String newFirstName, String newLastName) {
        for (Contact listOfContact : listOfContacts) {
            if (Objects.equals(listOfContact.getFirstName(), firstName) ||
                Objects.equals(listOfContact.getLastName(), lastName)) {
                if (!newFirstName.isEmpty()) {
                    listOfContact.setFirstName(newFirstName);
                }
                if (!newLastName.isEmpty()) {
                    listOfContact.setLastName(newLastName);
                }
                break;
            }

        }
    }

    public void editEmail(String oldEmail, String newEmail) {
        for (Contact listOfContact : listOfContacts) {
            if (Objects.equals(listOfContact.getEmail(), oldEmail)) {
                listOfContact.setEmail(newEmail);
                break;
            }
        }
    }

    public void editPhoneNumber(String oldNum, String newNum) {
        for (Contact listOfContact : listOfContacts) {
            if (Objects.equals(listOfContact.getPhoneNumber(), oldNum)) {
                listOfContact.setPhoneNumber(newNum);
            }
        }
    }
}
