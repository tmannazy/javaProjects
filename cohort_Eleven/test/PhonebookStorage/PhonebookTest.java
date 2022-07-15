package PhonebookStorage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookTest {
    Phonebook phone;
    Contact contact;
    Contact contact2;
    Contact contact3;

    @BeforeEach
    void setUp() {
        phone = new Phonebook();
        contact = new Contact("Boyo", "Ace", "12345678900", "Sabo, Yaba", "ace@boyo.com");
        contact2 = new Contact("Delta", "Force", "01234567890", "Force Quarters", "force@quarters.com");
        contact3 = new Contact("Gabriel", "Grace", "08099990123", "Akoka, Lagos", "grace@gabe.com");
    }

    @Test
    void testToAddContact() {
        phone.addNewContact(contact);
        assertEquals(1, phone.getSize());
    }

    @Test
    void testToAddMultipleContacts() {
        phone.addNewContact(contact);
        phone.addNewContact(contact2);
        assertEquals(2, phone.getSize());
    }

    @Test
    void testToGetContactDataByAnyName() {
        phone.addNewContact(contact);
        assertNotNull(phone.searchContact("Ace"));
    }

    @Test
    void testToGetContactDataByPhoneNumber() {
        phone.addNewContact(contact2);
        assertNotNull(phone.searchByNum("01234567890"));
    }

    @Test
    void testToGetContactEmail() {
        phone.addNewContact(contact3);
        assertNotNull(phone.getContactEmail("grace@gabe.com"));
    }

    @Test
    void testToGetContactAddress() {
        phone.addNewContact(contact2);
        assertNotNull(phone.getContactAddress("Force Quarters"));
    }

    @Test
    void testThatContactNamesCanBeEdited() {
        phone.addNewContact(contact2);
        phone.editContactInfo("Delta", "Force", "Alpha", "Team");
        assertEquals("Alpha", contact2.getFirstName());
        assertEquals("Team", contact2.getLastName());
    }

    @Test
    void testThatContactEmailCanBeEdited() {
        phone.addNewContact(contact3);
        phone.editEmail("grace@gabe.com", "gabriel@semicolon.com");
        assertEquals("gabriel@semicolon.com", contact3.getEmail());
    }

    @Test
    void testThatPhoneNumberCanBeEdited() {
        phone.addNewContact(contact);
        phone.editPhoneNumber("12345678900", "98761234160");
        assertEquals("98761234160", contact.getPhoneNumber());
    }




}