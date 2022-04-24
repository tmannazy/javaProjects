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

    public void accelerate(boolean level, int speed) {
        moves = level;
        increaseSpeed(speed);
    }

    public boolean isBikeAccelerating() {
        return moves;
    }

    public void gearOne(int gearRange) {
        gearLevel = gearRange;
    }

    public void gearTwo(int gearRange) {
        gearLevel = gearRange;
    }

    public void gearThree(int gearRange) {
        gearLevel = gearRange;
    }

    public void gearFour(int gearRange) {
        gearLevel = gearRange;
    }

    private void increaseSpeed(int gearIncrease) {
        if (gearIncrease >= 0 && gearIncrease <= 20)
            gearLevelIncrease = gearLevel + gearIncrease;

        if (gearIncrease >= 21 && gearIncrease <= 30)
            gearLevelIncrease = gearLevel + gearIncrease;

        if (gearIncrease >= 31 && gearIncrease <= 40)
            gearLevelIncrease = gearLevel + gearIncrease;

        if (gearIncrease >= 41)
            gearLevelIncrease = gearLevel + gearIncrease;
    }

    public int getGearSpeed() {
        return gearLevelIncrease;
    }

    public void decelerate(boolean action, int speed) {
        decelerateMoves = action;
        decreaseSpeed(speed);
    }

    public boolean isBikeDecelerating() {
        return decelerateMoves;
    }

    private void decreaseSpeed(int gearDecrease) {
        if (gearDecrease >= 0 && gearDecrease <= 20)
            decreaseGearLevel = gearDecrease - gearLevel;

        if (gearDecrease >= 21 && gearDecrease <= 30)
            decreaseGearLevel = gearDecrease - gearLevel;

        if (gearDecrease >= 31 && gearDecrease <= 40)
            decreaseGearLevel = gearDecrease - gearLevel;

        if (gearDecrease >= 41)
            decreaseGearLevel = gearDecrease - gearLevel;

    }

    public int getGearSpeedDecrease() {
        return decreaseGearLevel;
    }

    public String checkForGearRange() {
        String gearRangeSelected = null;
        if (gearLevel >= 0 && gearLevel <= 20)
            gearRangeSelected = "Gear 1";

        if (gearLevel >= 21 && gearLevel <= 30)
            gearRangeSelected = "Gear 2";


        return gearRangeSelected;
    }
}
