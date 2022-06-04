package MyDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary diary;
    Entry entry;

    @BeforeEach
    void setUp() {
        diary = new Diary("Beverages and Cereals");
        entry = new Entry("Semicolon rules", "Rules at semicolon can be daunting sometimes");
    }

    @Test
    void testThatNameIsEntered() {
        assertEquals("Beverages and Cereals", diary.getName());
    }

    @Test
    void testThatIllegalArgumentIsThrownWhenNameIsNotEntered() {
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class,
                () -> new Diary(""));
        assertEquals("Diary name must be entered.", err.getMessage());
    }

    @Test
    void testThatDateCreatedIsSupplied() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        LocalDate date = LocalDate.now();
        String dateCreated = date.format(dateFormat);
        assertEquals(dateCreated, diary.getDate());
    }

    @Test
    void testThatAnEntryCanBeAdded() {
        diary.addEntry(entry);
        assertEquals("Semicolon rules", entry.getTitle());
    }

    @Test
    void testThatIllegalArgumentIsThrownWhenTitleExists() {
        Entry entry1 = new Entry("Semicolon rules", "Rules at semicolon can be daunting sometimes");
        diary.addEntry(entry1);
        Entry entry2 = new Entry("Semicolon rules", "Rules at semicolon can be daunting sometimes");
        IllegalArgumentException titleExists = assertThrows(IllegalArgumentException.class,
                () -> diary.addEntry(entry2));
        assertEquals("Title already exists", titleExists.getMessage());
    }

    @Test
    void testThatAnEntryCanBeGotten() {
        diary.addEntry(entry);
        assertEquals("Title: Semicolon rules\n" +
                     "Body: Rules at semicolon can be daunting sometimes\n" +
                     "Date: 04 June 2022\n\n", diary.getAnEntry("Semicolon rules").toString());
    }

    @Test
    void testThatAllEntriesAreGotten() {
        Entry entry2 = new Entry("Placidly", "Go placidly amidst the noise");
        diary.addEntry(entry);
        diary.addEntry(entry2);
        assertEquals("Title: Semicolon rules\n" +
                     "Body: Rules at semicolon can be daunting sometimes\n" +
                     "Date: 04 June 2022\n\n" +
                     "Title: Placidly\n"+
                     "Body: Go placidly amidst the noise\n" +
                     "Date: 04 June 2022\n\n", diary.getAllEntries().toString());
    }

    @Test
    void testThatAnEntryCanBeEdited() {
        diary.addEntry(entry);
        diary.editEntry("Semicolon rules", "Go placidly amidst the noise");
        assertEquals("Title: Semicolon rules\n" +
                     "Body: Go placidly amidst the noise\n" +
                     "Date: 04 June 2022\n\n", diary.getAnEntry("Semicolon rules").toString());
    }

    @Test
    void testThatAnEntryCanBeDeleted() {
        diary.addEntry(entry);
        assertTrue(diary.deleteEntry("Semicolon rules"));
    }
}