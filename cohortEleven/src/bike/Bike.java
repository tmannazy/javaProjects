package bike;

public class Bike {
    private boolean bikePowerCondition;
    private boolean accelerateBike;
    private int selectedGearLevel;
    private int speedLevelIncrease;
    private boolean decelerateBike;
    private int decreaseGearLevel;

    public void startBike(boolean status) {
        bikePowerCondition = status;
    }

    public boolean isBikeStarted() {
        return bikePowerCondition;
    }

    public void stopBike(boolean action) {
        bikePowerCondition = action;
    }

    public boolean isBikeStopped() {
        return bikePowerCondition;
    }

    public void accelerate(boolean action, int speedLevel) {
        accelerateBike = action;
        increaseSpeed(speedLevel);
    }

    public void decelerate(boolean action, int speedLevel) {
        decelerateBike = action;
        decreaseSpeed(speedLevel);
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

    public int getSpeedIncrease() {
        return speedLevelIncrease;
    }

    public int getSpeedDecrease() {
        return decreaseGearLevel;
    }

    public int displaySelectedGear() {
        return selectedGearLevel;
    }

    private void decreaseSpeed(int speedLevelToDecrease) {
        if (speedLevelToDecrease >= 0 && speedLevelToDecrease <= 20) {
            gearSelection(1);
            decreaseGearLevel = speedLevelToDecrease - selectedGearLevel;
        }

        if (speedLevelToDecrease >= 21 && speedLevelToDecrease <= 30) {
            gearSelection(2);
            decreaseGearLevel = speedLevelToDecrease - selectedGearLevel;
        }

        if (speedLevelToDecrease >= 31 && speedLevelToDecrease <= 40) {
            gearSelection(3);
            decreaseGearLevel = speedLevelToDecrease - selectedGearLevel;
        }

        if (speedLevelToDecrease >= 41) {
            gearSelection(4);
            decreaseGearLevel = speedLevelToDecrease - selectedGearLevel;
        }
    }

    private void increaseSpeed(int speedLevelToIncrease) {
        if (speedLevelToIncrease >= 0 && speedLevelToIncrease <= 20) {
            gearSelection(1);
            speedLevelIncrease = selectedGearLevel + speedLevelToIncrease;
        }

        if (speedLevelToIncrease >= 21 && speedLevelToIncrease <= 30) {
            gearSelection(2);
            speedLevelIncrease = selectedGearLevel + speedLevelToIncrease;
        }

        if (speedLevelToIncrease >= 31 && speedLevelToIncrease <= 40) {
            gearSelection(3);
            speedLevelIncrease = selectedGearLevel + speedLevelToIncrease;
        }

        if (speedLevelToIncrease >= 41) {
            gearSelection(4);
            speedLevelIncrease = selectedGearLevel + speedLevelToIncrease;
        }
    }

}
