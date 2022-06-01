package MyDiary;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Entry {
    Date date = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
    String currentDate = dateFormat.format(date);
    private int id;
    private String title;
    private String body;
    private String dateCreated = currentDate;


    public Entry(int id, String title, String body, String dateCreated) {
        this.id = id;
        this.title = title;
        this.body = body;
        if (dateCreated.equals(this.dateCreated)) this.dateCreated = dateCreated;
        else throw new IllegalArgumentException("Enter date in format: dd MM yyyy");
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public int getId() {
        return id;
    }

    public String getDateCreated() {
        return dateCreated;
    }
}
