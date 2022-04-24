package bike;

public class Bike {
    private boolean bikePowerCondition;
    private boolean moves;
    private int gearLevel;
    private int gearLevelIncrease;
    private boolean decelerateMoves;
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

    public void accelerate(boolean level) {
    moves = level;
    }

    public boolean isBikeAccelerating() {
    return moves;
    }

    public void gear(int gearRange) {
        gearLevel = gearRange;
    }

    public void increaseGear(int gearIncrease) {
        gearLevelIncrease = gearLevel + gearIncrease;
    }

    public int getGearSpeed() {
        return gearLevelIncrease;
    }

    public void decelerate(boolean action) {
    decelerateMoves = action;
    }

    public boolean isBikeDecelerating() {
    return decelerateMoves;
    }

    public void decreaseGear(int gearDecrease) {
        decreaseGearLevel = gearDecrease - gearLevel;
    }

    public int getGearSpeedDecrease() {
        return decreaseGearLevel;
    }
}
