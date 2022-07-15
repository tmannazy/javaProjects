package Phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    User user2;
    User user3;

    @BeforeEach
    void setUp() {
        user = new User("Tunde", "Oloye", "1234");
        user2 = new User("Odogwu", "Nwoke", "7890");
        user3 = new User("Peter", "Datti", "2023");
    }

    @Test
    void testThatUserFirstNameIsSet() {
        assertEquals("Tunde", user.getFirstName());
    }

    @Test
    void testThatUserLastNameIsSet() {
        assertEquals("Datti", user3.getlastName());
    }

    @Test
    void testThatPinIsTrue() {
        assertTrue(user3.isPinCorrect("2023"));
    }

    @Test
    void testThatNewUserIsAdded() {
        user.addNewUser(user);
        assertNotNull(user.getArrOfUsers());
    }

    @Test
    void testUserSize() {
        user.addNewUser(user);
        user.addNewUser(user2);
        user.addNewUser(user3);
        assertEquals(3, user.getSize());
    }

    @Test
    void testThatUserCanAddContact() {
        Contact contact = new Contact("Boyo", "Ace", "12345678900", "Sabo, Yaba", "ace@boyo.com");
        user.addNewContact(contact);
        assertNotNull(user.getContactList());
    }

    @Test
    void testThatUserCanRemoveContact() {
        Contact contact = new Contact("Boyo", "Ace", "12345678900", "Sabo, Yaba", "ace@boyo.com");
        Contact contact2 = new Contact("Delta", "Force", "01234567890", "Force Quarters", "force@quarters.com");
        Contact contact3 = new Contact("Gabriel", "Grace", "08099990123", "Akoka, Lagos", "grace@gabe.com");
        user.addNewContact(contact);
        user.addNewContact(contact2);
        user.addNewContact(contact3);
        user.removeContact(contact2);
        assertEquals(2, user.getContactSize());
    }
}