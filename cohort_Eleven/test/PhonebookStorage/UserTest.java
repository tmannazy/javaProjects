package PhonebookStorage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    User user2;
    User user3;
    private ArrayList<User> listOfUsers;

    @BeforeEach
    void setUp() {
        user = new User("Tunde", "Oloye", "1234");
        user2 = new User("Odogwu", "Nwoke", "7890");
        user3 = new User("Peter", "Datti", "2023");
        listOfUsers = new ArrayList<>();
    }

    @Test
    void testThatUserFirstNameIsSet() {
        assertEquals("Tunde", user.getFirstName());
    }

    @Test
    void testThatUserLastNameIsSet() {
        assertEquals("Datti", user3.getLastName());
    }

    @Test
    void testThatPinIsTrue() {
        assertTrue(user3.isPinCorrect("Datti","2023"));
    }

    @Test
    void testThatUserCanAddContact() {
        Contact contact = new Contact("Boyo", "Ace", "12345678900", "Sabo, Yaba", "ace@boyo.com");
        user.addNewContact(contact);
        assertNotNull(user.getPhonebookContactList());
    }

    @Test
    void testThatUserCanRemoveContact() {
        Contact contact = new Contact("Boyo", "Ace", "12345678900", "Sabo, Yaba", "ace@boyo.com");
        Contact contact2 = new Contact("Delta", "Force", "01234567890", "Force Quarters", "force@quarters.com");
        Contact contact3 = new Contact("Gabriel", "Grace", "08099990123", "Akoka, Lagos", "grace@gabe.com");
        user.addNewContact(contact);
        user.addNewContact(contact2);
        user.addNewContact(contact3);
        user.removeContact(2);
        assertEquals(2, user.getContactSize());
    }

//    @Test
//    void userCanEditContact

}