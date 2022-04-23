package tdd;

public class AirConditioner {
    private boolean power;
    public void switchButton(boolean status) {
        if (status == true) power = true;

        if (status == false) power = false;
    }

    public Boolean getSwitchStatus() {
        return power;
    }
}
