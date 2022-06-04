package MyDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    Entry entry;

    @BeforeEach
    void setUp() {
        entry = new Entry("Call Mum", "I need to speak to mum about the feeding and accommodation in Juno");
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
    void testThatDateIsSet() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        LocalDate date = LocalDate.now();
        String currentDate = date.format(dateFormat);
        assertEquals(currentDate, entry.getDateCreated());
    }

    @Test
    void testThatIdSetIsUnique() {
        assertNotNull(entry.getId());
    }

    @Test
    void testThatExceptionIsThrownWhenTitleAndBodyIsEmpty() {
        IllegalArgumentException emptyTitleSupplied = assertThrows(IllegalArgumentException.class,
                () -> entry = new Entry( "", "Dad is one person that always cares about his kids big time"));
        assertEquals("Title Must Not Be Empty", emptyTitleSupplied.getMessage());

        IllegalArgumentException emptyBodySupplied = assertThrows(IllegalArgumentException.class,
                () -> new Entry("Dad is back", ""));
        assertEquals("Body Must Not Be Empty", emptyBodySupplied.getMessage());
    }

    @Test
    void testThatUserValuesToStringAreReturned(){
        assertNotNull(entry.toString());
    }
}