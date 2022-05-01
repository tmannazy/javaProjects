package bike;

public class Bike {
    private boolean bikePowerCondition;
    private boolean accelerateBike;
    private int selectedGearLevel;
    private int gearMaxOrMinSpeed;
    private boolean decelerateBike;


    public void startAndStopBike(boolean status) {
        bikePowerCondition = status;
    }

    public boolean isBikeStartedOrStopped() {
        return bikePowerCondition;
    }

    public void accelerate(boolean action, int speedCount) {
        accelerateBike = action;
        if (speedCount <= 20) increaseSpeed(1, speedCount);
        else if (speedCount <= 30) increaseSpeed(2, speedCount);
        else if (speedCount <= 40) increaseSpeed(3, speedCount);
        else if (speedCount <= 53) increaseSpeed(4, speedCount);
    }

    public void decelerate(boolean action, int speedCount) {
        decelerateBike = action;
        if (speedCount >= 40) decreaseSpeed(4, speedCount);
        else if (speedCount >= 30) decreaseSpeed(3, speedCount);
        else if (speedCount >= 20) decreaseSpeed(2, speedCount);
        else if (speedCount == 0) decreaseSpeed(1, speedCount);
    }

    public boolean isBikeAccelerating() {
        return accelerateBike;
    }

    public boolean isBikeDecelerating() {
        return decelerateBike;
    }

    private void gearSelection(int gearSelected) {
        selectedGearLevel = gearSelected;
    }

    private void saveMaxOrMinSpeed(int speed) {
        gearMaxOrMinSpeed = speed;
    }

    public int getGearMaxOrMinSpeed() {
        return gearMaxOrMinSpeed;
    }

    public int displaySelectedGear() {
        return selectedGearLevel;
    }

    private void increaseSpeed(int gearLevel, int speedCount) {
        gearSelection(gearLevel);
        int increaseSpeedLevel = speedCount + gearLevel;
        saveMaxOrMinSpeed(increaseSpeedLevel);
    }

    private void decreaseSpeed(int gearLevel, int speedCount) {
        gearSelection(gearLevel);
        int decreaseSpeedLevel = 0;
        if (speedCount == 0) saveMaxOrMinSpeed(decreaseSpeedLevel);
        else decreaseSpeedLevel = speedCount - gearLevel;
        saveMaxOrMinSpeed(decreaseSpeedLevel);
    }
}
