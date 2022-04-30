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

    public void accelerate(boolean action) {
        int counter = 0;
        if (!decelerateBike && selectedGearLevel == 0) {
            accelerateBike = action;
            gearSelection(1);
            while (counter < 20 && speedLevelIncrease <= 20) {
                counter++;
                speedLevelIncrease += selectedGearLevel;
            }
        }
        if (counter >= 20) {
            gearSelection(2);
            speedLevelIncrease++;
            while (speedLevelIncrease >= 21 && speedLevelIncrease <= 30) {
                speedLevelIncrease += selectedGearLevel;
                counter++;
            }
            counter = speedLevelIncrease;
        }

        if (counter >= 31) {
            gearSelection(3);
            speedLevelIncrease++;
            while (speedLevelIncrease >= 31 && speedLevelIncrease <= 40) {
                speedLevelIncrease += selectedGearLevel;
                counter++;
            }
            counter = speedLevelIncrease;
        }

        if (counter >= 41) {
            gearSelection(4);
            speedLevelIncrease++;
            while (speedLevelIncrease >= 41 && speedLevelIncrease <= 50) {
                speedLevelIncrease += selectedGearLevel;
                counter++;
            }
        }

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

}
