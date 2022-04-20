public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hourHand, int minuteHand, int secondHand) {
        if(hourHand > 23)
            this.hour = 0;
        if(hourHand < 24)
            this.hour = hourHand;
        if(minuteHand > 59)
            this.minute = 00;
        if (minuteHand <= 59)
            this.minute = minuteHand;
        if(secondHand > 59)
            this.second = 00;
        if(secondHand <= 59)
            this.second = secondHand;
    }

    public void setHour(int hourHand) {
       this.hour = hourHand;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minuteHand) {
        this.minute = minuteHand;

    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int secondHand) {
        this.second = secondHand;
    }

    public int getSecond() {
        return second;
    }

    public String displayTime() {
    return (hour + ":" + minute + ":" + second);
    }
    
}

