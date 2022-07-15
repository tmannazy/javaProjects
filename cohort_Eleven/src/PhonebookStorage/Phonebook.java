package PhonebookStorage;


import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Objects;

public class Phonebook {
    private final ArrayList<Contact> listOfContacts;

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

    public void editContactInfo(String firstName, String lastName, String oldEmail, String oldNum, String address,
                                String newFirstName, String newLastName, String newEmail, String newNum, String newAddress) {
        for (Contact listOfContact : listOfContacts) {
            if (listOfContact.getFirstName().equalsIgnoreCase(firstName) ||
                listOfContact.getLastName().equalsIgnoreCase(lastName) ||
                listOfContact.getEmail().equalsIgnoreCase(oldEmail) ||
                listOfContact.getPhoneNumber().equalsIgnoreCase(oldNum)||
                listOfContact.getAddress().equalsIgnoreCase(address)) {
                if (!newFirstName.isEmpty()) {
                    listOfContact.setFirstName(newFirstName);
                }
                if (!newLastName.isEmpty()) {
                    listOfContact.setLastName(newLastName);
                }
                if (!newEmail.isEmpty()) {
                    listOfContact.setEmail(newEmail);
                }
                if (!newNum.isEmpty()) {
                    listOfContact.setPhoneNumber(newNum);
                }
                break;
            }
        }
    }

    public void editEmail(String oldEmail, String newEmail) {
        for (Contact listOfContact : listOfContacts) {
            if (Objects.equals(listOfContact.getEmail(), oldEmail)) {
                if (!newEmail.isEmpty()) {
                    listOfContact.setEmail(newEmail);
                    break;
                }
            }
        }
    }

    public void editPhoneNumber(String oldNum, String newNum) {
        for (Contact listOfContact : listOfContacts) {
            if (Objects.equals(listOfContact.getPhoneNumber(), oldNum)) {
                if (!newNum.isEmpty()) {
                    listOfContact.setPhoneNumber(newNum);
                    break;
                }
            }
        }
    }
}
