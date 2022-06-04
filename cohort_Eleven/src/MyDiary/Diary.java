package MyDiary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Diary {
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    LocalDate date = LocalDate.now();
    String dateCreated = date.format(dateFormat);
    private String name;
    private ArrayList<Entry> entries = new ArrayList<>();

    Diary(String name) {
        if (name.isEmpty())
            throw new IllegalArgumentException("Diary name must be entered.");
        this.name = name;
    }


public String getName() {
        return name;
    }

    public Entry getAnEntry(String titleOfEntry) {
        return findEntry(titleOfEntry);
    }

    private Entry findEntry(String titleOfEntry) {
        for (Entry entry : entries) {
            if (entry.getTitle().equals(titleOfEntry)) {
                return entry;
            }
        }
        return null;
    }

    public String getDate() {
        return dateCreated;
    }

    public void addEntry(Entry newEntry) {
        for (Entry entry : entries) {
            if (entry.getTitle().equals(newEntry.getTitle())) {
                throw new IllegalArgumentException("Title already exists");
            }
        }
        this.entries.add(newEntry);
    }

    public String getAllEntries() {
        String allEntries = """
                """;
        for (Entry entry : entries) {
            allEntries += entry;
        }
        return allEntries;
    }

    public void editEntry(String titleOfEntry, String bodyOfEntryToEdit) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getTitle().equals(titleOfEntry)) {
                entries.set(i, new Entry(titleOfEntry, bodyOfEntryToEdit));
                break;
            }
        }
    }

    public boolean deleteEntry(String titleOfEntry) {
        Entry entryToDelete = findEntry(titleOfEntry);
        if (this.entries.remove(entryToDelete))
            return true;
        return false;
    }
}
