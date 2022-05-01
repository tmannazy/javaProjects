package bike;

public class Bike {
    private boolean bikePowerCondition;
    private boolean accelerateBike;
    private int selectedGearLevel;
    private int gearMaxSpeed;
    private boolean decelerateBike;
    private int speedLevelDecrease;


    public void startAndStopBike(boolean status) {
        bikePowerCondition = status;
    }

    public boolean isBikeStartedOrStopped() {
        return bikePowerCondition;
    }

    public void accelerate(boolean action, int counter) {
        accelerateBike = action;
        if (counter <= 20) increaseSpeed(1, counter);
        else if (counter <= 30) increaseSpeed(2, counter);
        else if (counter <= 40) increaseSpeed(3, counter);
        else if (counter <= 50) increaseSpeed(4, counter);
    }

    public void decelerate(boolean action, int speed) {
        decelerateBike = action;
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

    private void saveMaxSpeed(int speed) {
        gearMaxSpeed = speed;
    }

    public int getGearMaxSpeed() {
        return gearMaxSpeed;
    }

    public int getSpeedDecrease() {
        return speedLevelDecrease;
    }

    public int displaySelectedGear() {
        return selectedGearLevel;
    }

    private void increaseSpeed(int gearLevel, int counter) {
        gearSelection(gearLevel);
        int increaseSpeedLevel = counter + gearLevel;
        saveMaxSpeed(increaseSpeedLevel);
    }

}
