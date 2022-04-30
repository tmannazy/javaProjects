package bike;

public class Bike {
    private boolean bikePowerCondition;
    private boolean accelerateBike;
    private int selectedGearLevel;
    private int speedLevelIncrease;
    private boolean decelerateBike;
    private int speedLevelDecrease;

    public void startAndStopBike(boolean status) {
        bikePowerCondition = status;
    }

    public boolean isBikeStartedOrStopped() {
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
        return speedLevelDecrease;
    }

    public int displaySelectedGear() {
        return selectedGearLevel;
    }

    private void decreaseSpeed(int speedLevelToDecrease) {
        if (speedLevelToDecrease >= 0 && speedLevelToDecrease <= 20) {
            gearSelection(1);
            speedLevelDecrease = speedLevelToDecrease - selectedGearLevel;
        }

        if (speedLevelToDecrease >= 21 && speedLevelToDecrease <= 30) {
            gearSelection(2);
            speedLevelDecrease = speedLevelToDecrease - selectedGearLevel;
        }

        if (speedLevelToDecrease >= 31 && speedLevelToDecrease <= 40) {
            gearSelection(3);
            speedLevelDecrease = speedLevelToDecrease - selectedGearLevel;
        }

        if (speedLevelToDecrease >= 41) {
            gearSelection(4);
            speedLevelDecrease = speedLevelToDecrease - selectedGearLevel;
        }
    }

    private void increaseSpeed(int speedLevelToIncrease) {
        if (speedLevelToIncrease >= 0 && speedLevelToIncrease <= 20) {
            gearSelection(1);
            speedLevelIncrease = speedLevelToIncrease + selectedGearLevel;
        }

        if (speedLevelToIncrease >= 21 && speedLevelToIncrease <= 30) {
            gearSelection(2);
            speedLevelIncrease = speedLevelToIncrease + selectedGearLevel;
        }

        if (speedLevelToIncrease >= 31 && speedLevelToIncrease <= 40) {
            gearSelection(3);
            speedLevelIncrease = speedLevelToIncrease + selectedGearLevel;
        }

        if (speedLevelToIncrease >= 41) {
            gearSelection(4);
            speedLevelIncrease = speedLevelToIncrease + selectedGearLevel;
        }
    }

}
