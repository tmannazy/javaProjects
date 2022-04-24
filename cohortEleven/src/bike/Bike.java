package bike;

public class Bike {
    private boolean bikePowerCondition;
    private boolean accelerateBike;
    private int selectedGearLevel;
    private int gearLevelIncrease;
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

    public void gearSelection(int gearSelected) {
        if (gearSelected >= 1 && gearSelected <= 4)
            selectedGearLevel = gearSelected;
    }

    private void increaseSpeed(int speedLevelToIncrease) {
        if (speedLevelToIncrease >= 0 && speedLevelToIncrease <= 20)
            gearLevelIncrease = selectedGearLevel + speedLevelToIncrease;

        if (speedLevelToIncrease >= 21 && speedLevelToIncrease <= 30)
            gearLevelIncrease = selectedGearLevel + speedLevelToIncrease;

        if (speedLevelToIncrease >= 31 && speedLevelToIncrease <= 40)
            gearLevelIncrease = selectedGearLevel + speedLevelToIncrease;

        if (speedLevelToIncrease >= 41)
            gearLevelIncrease = selectedGearLevel + speedLevelToIncrease;
    }

    public int getSpeedIncrease() {
        return gearLevelIncrease;
    }

        public boolean isBikeDecelerating() {
        return decelerateBike;
    }

    private void decreaseSpeed(int speedLevelToDecrease) {
        if (speedLevelToDecrease >= 0 && speedLevelToDecrease <= 20)
            decreaseGearLevel = speedLevelToDecrease - selectedGearLevel;

        if (speedLevelToDecrease >= 21 && speedLevelToDecrease <= 30)
            decreaseGearLevel = speedLevelToDecrease - selectedGearLevel;

        if (speedLevelToDecrease >= 31 && speedLevelToDecrease <= 40)
            decreaseGearLevel = speedLevelToDecrease - selectedGearLevel;

        if (speedLevelToDecrease >= 41)
            decreaseGearLevel = speedLevelToDecrease - selectedGearLevel;
    }

    public int getSpeedDecrease() {
        return decreaseGearLevel;
    }

    public String checkForGearRange() {
        String gearRangeSelected = null;
        if (selectedGearLevel >= 0 && selectedGearLevel <= 20)
            gearRangeSelected = "Gear 1";

        if (selectedGearLevel >= 21 && selectedGearLevel <= 30)
            gearRangeSelected = "Gear 2";


        return gearRangeSelected;
    }
}
