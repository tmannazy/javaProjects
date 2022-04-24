package airconditioner;

public class AirConditioner {
    private boolean power;
    private int tempLevel;
    public void switchButton(boolean status) {
        if (status) power = true;

        if (!status) power = false;
    }

    public Boolean getSwitchStatus() {
        return power;
    }

    public void increaseTemp(int level) {
        if (level > 15 && level <= 30)
            tempLevel = level;
        if (level > 30)
            tempLevel = 30;
    }

    public int getTempLevel() {
        return tempLevel;
    }

    public void decreaseTemp(int level) {
        if (level >= 16 && level <= 30)
            tempLevel = level;
    }

    public void setTemp(int level) {
        if (level >=16 && level <= 30)
            tempLevel = level;
    }
}
