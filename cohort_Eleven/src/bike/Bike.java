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

    public void accelerate(boolean action) {
        int counter = 1;
        int increaseSpeedLevelOne = 0;
        if (!decelerateBike && selectedGearLevel == 0) {
            accelerateBike = action;
            selectedGearLevel = 1;
            while (counter <= 20 && increaseSpeedLevelOne <= 20) {
                counter++;
                increaseSpeedLevelOne += selectedGearLevel;
            }
            saveMaxSpeed(increaseSpeedLevelOne);
        }
        if (counter == 21) accelerateToGearTwo(increaseSpeedLevelOne);

    }

    private void accelerateToGearTwo(int increaseSpeedLevelOne) {
        int counter = increaseSpeedLevelOne;
        int increaseSpeedLevelTwo = increaseSpeedLevelOne;
        selectedGearLevel = 2;
        while (increaseSpeedLevelTwo < 30) {
            counter++;
            increaseSpeedLevelTwo += selectedGearLevel;
        }
        saveMaxSpeed(increaseSpeedLevelTwo);
        if (counter < increaseSpeedLevelTwo) {
            counter = increaseSpeedLevelTwo;
            accelerateToGearThree(increaseSpeedLevelTwo);
        }
    }

    private void accelerateToGearThree(int increaseSpeedLevelTwo) {

    }
//        if(counter >=20&&!(increaseSpeedLevelTwo ==0))
//
//    {
//        selectedGearLevel = 2;
//        increaseSpeedLevelTwo = increaseSpeedLevelOne;
//        increaseSpeedLevelTwo++;
//        while (increaseSpeedLevelTwo >= 21 && increaseSpeedLevelTwo <= 30) {
//            counter++;
//            increaseSpeedLevelTwo += selectedGearLevel;
//        }
//        counter = increaseSpeedLevelTwo;
//        saveMaxSpeed(increaseSpeedLevelTwo);
//    }
//
//        if(counter >=31)
//
//    {
//        selectedGearLevel = 3;
//        increaseSpeedLevelThree = increaseSpeedLevelTwo;
//        while (increaseSpeedLevelThree < 40) {
//            counter++;
//            increaseSpeedLevelThree += selectedGearLevel;
//        }
//        counter = increaseSpeedLevelThree;
//        saveMaxSpeed(increaseSpeedLevelThree);
//    }
//
//        if(counter >=40)
//
//    {
//        selectedGearLevel = 4;
//        increaseSpeedLevelFour = increaseSpeedLevelThree;
//        while (increaseSpeedLevelFour >= 40 && increaseSpeedLevelFour <= 50) {
//            counter++;
//            increaseSpeedLevelFour += selectedGearLevel;
//        }
//        saveMaxSpeed(increaseSpeedLevelFour);
//    }
//}
//void


    public void decelerate(boolean action, int speedLevel) {
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

}
