package MyDiary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Entry {
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    LocalDate date = LocalDate.now();
    String dateCreated = date.format(dateFormat);
    private final String id;
    private String title;
    private String body;


    public Entry(String id, String title, String body) {
        if (title.isEmpty())
            throw new IllegalArgumentException("Title Must Not Be Empty");
        if (body.length() == 0)
            throw new IllegalArgumentException("Body Must Not Be Empty");

        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Entry(String title, String body) {
        this(UUID.randomUUID().toString(), title, body);
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getId() {
        return id;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return ("Title: " + getTitle() +
                "\nBody: " + getBody() +
                "\nDate: " + getDateCreated() +
                "\n" + "\n"
        );
    }
}
