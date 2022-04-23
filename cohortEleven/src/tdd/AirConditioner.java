package tdd;

public class AirConditioner {
    private boolean power;
    public void switchButton(boolean status) {
        if (!status) power = true;

        if (status) power = false;
    }

    public boolean getSwitchStatus() {
        return power;
    }
}
