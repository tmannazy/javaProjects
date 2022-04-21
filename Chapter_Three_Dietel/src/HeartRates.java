import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;

    public HeartRates(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setFirstName(String userFirstName) {
        this.firstName = userFirstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String userLastName) {
        this.lastName = userLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDate(int userDay) {
        this.day = userDay;
    }

    public int getDate() {
        return day;
    }

    public void setMonth(int userMonth) {
        this.month = userMonth;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int userYear) {
        this.year = userYear;
    }

    public int getYear() {
        return year;
    }

    public int calculateAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        Period getAgeDifference =  Period.between(birthday, today);
        return getAgeDifference.getYears();
    }

    public int calculateHeartRate() {
        return 220 - calculateAge();
    }

    public double targetHeartRate() {
        double userGetAge = calculateHeartRate();
        return userGetAge * 0.5;
    }

}
