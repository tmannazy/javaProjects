package airconditioner;

public class AirConditioner {
    private boolean power;
    private int tempLevel;

    public void switchButton(boolean status) {
        if (status) power = true;

        if (!status) power = false;
    }

    public boolean getSwitchStatus() {
        return power;
    }

    public void temperatureLevel(int level) {
        if (level > 15 && level <= 30)
            tempLevel = level;
        if (level > 30)
            tempLevel = 30;
        if (level < 16)
            tempLevel = 16;
    }

    public int getTempLevel() {
        return tempLevel;
    }
}
