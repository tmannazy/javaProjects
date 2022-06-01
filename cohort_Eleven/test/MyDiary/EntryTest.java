package MyDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EntryTest {
    Entry entry;

    @BeforeEach
    void setUp() {
        entry = new Entry(2, "Call Mum", "I need to speak to mum about the feeding and accommodation in Juno",
                "01 June 2022");
    }

    @Test
    void testThatTitleOfEntryIsSet() {
        assertEquals("Call Mum", entry.getTitle());
    }

    @Test
    void testThatBodyOfEntryIsSet() {
        assertEquals("I need to speak to mum about the feeding and accommodation in Juno", entry.getBody());
    }

    @Test
    void testThatIdIsSet() {
        assertEquals(2, entry.getId());
    }

    @Test
    void testThatDateIsSet() {
        assertEquals("01 June 2022", entry.getDateCreated());
    }

    @Test
    void testThatIdSetIsUnique() {
        entry = new Entry(3, "Call Dad", "Dad is one person that always cares about his kids big time",
                "01 June 2022");
        assertEquals(3, entry.getId());
    }

    @Test
    void testThatExceptionIsThrownWhenIllegalValueProvided() {
        IllegalArgumentException valueEntered = assertThrows(IllegalArgumentException.class,
                () ->entry = new Entry(3, "Call Dad", "Dad is one person that always cares about his kids big time",
                        "01 Junne 2022"));
        assertEquals("Enter date in format: dd MM yyyy", valueEntered.getMessage());
    }
}