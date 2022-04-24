package bike;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {
    @Test
    @DisplayName("The Bike can be turned on")
    public void bikeCanBeTurnedOnTest() {
        Bike bajaj = new Bike();
        bajaj.startBike(true);
        assertTrue(bajaj.isBikeStarted());
    }

    @Test
    @DisplayName("The Bike can be turned off")
    public void bikeCanBeTurnedOffTest() {
        Bike ogbuawaSpecial = new Bike();
        ogbuawaSpecial.stopBike(true);
        assertTrue(ogbuawaSpecial.isBikeStopped());
    }

    @Test
    @DisplayName("The Bike can be accelerated")
    public void theBikeCanBeAccelerated() {
        Bike powerBike = new Bike();
        powerBike.accelerate(true);
        assertTrue(powerBike.isBikeAccelerating());
    }


    @Test
    @DisplayName("Increment bike gear one in sequence of ones")
    public void acceleratesGearOneInIncrementOfOnesTest() {
        Bike powerBikeOne = new Bike();
        powerBikeOne.gear(1);
        powerBikeOne.increaseGear(3);
        assertEquals(4, powerBikeOne.getGearSpeed());
    }

    @Test
    @DisplayName("Increment bike gear two in sequence of twos")
    public void acceleratesGearTwoInIncrementOfTwosTest() {
        Bike powerBikeTwo = new Bike();
        powerBikeTwo.gear(2);
        powerBikeTwo.increaseGear(24);
        assertEquals(26, powerBikeTwo.getGearSpeed());
    }

    @Test
    @DisplayName("Increment bike gear three in sequence of threes")
    public void acceleratesGearThreeInIncrementOfThreesTest() {
        Bike powerBikeThree = new Bike();
        powerBikeThree.gear(3);
        powerBikeThree.increaseGear(35);
        assertEquals(38, powerBikeThree.getGearSpeed());
    }

    @Test
    @DisplayName("Increment bike gear four in sequence of fours")
    public void acceleratesGearFourInIncrementOfFourTest() {
        Bike powerBikeFour = new Bike();
        powerBikeFour.gear(4);
        powerBikeFour.increaseGear(44);
        assertEquals(48, powerBikeFour.getGearSpeed());
    }

    @Test
    @DisplayName("The Bike can be decelerated")
    public void theBikeCanBeDecelerated() {
        Bike jianshe = new Bike();
        jianshe.decelerate(true);
        assertTrue(jianshe.isBikeDecelerating());
    }

    @Test
    @DisplayName("Decrement bike gear one in sequence of ones")
    public void deceleratesGearOneInIncrementOfOneTest() {
        Bike jiansheOne = new Bike();
        jiansheOne.gear(1);
        jiansheOne.decreaseGear(44);
        assertEquals(43, jiansheOne.getGearSpeedDecrease());
    }

    @Test
    @DisplayName("Decrement bike gear two in sequence of twos")
    public void deceleratesGearTwoInIncrementOfTwoTest() {
        Bike jiansheTwo = new Bike();
        jiansheTwo.gear(2);
        jiansheTwo.decreaseGear(35);
        assertEquals(33, jiansheTwo.getGearSpeedDecrease());
    }

    @Test
    @DisplayName("Decrement bike gear three in sequence of threes")
    public void deceleratesGearThreeInIncrementOfThreeTest() {
        Bike jiansheThree = new Bike();
        jiansheThree.gear(3);
        jiansheThree.decreaseGear(24);
        assertEquals(21, jiansheThree.getGearSpeedDecrease());
    }

    @Test
    @DisplayName("Decrement bike gear four in sequence of fours")
    public void deceleratesGearFourInIncrementOfFourTest() {
        Bike jiansheFour = new Bike();
        jiansheFour.gear(4);
        jiansheFour.decreaseGear(15);
        assertEquals(11, jiansheFour.getGearSpeedDecrease());
    }

//    @Test
//    @DisplayName("Speed acceleration gear auto change")
//    public void autoGearSelectionAccelerationTest() {
//        Bike chevrush = new Bike();
//        chevrush.gear(4);
//        chevrush.autoGearIncrease(15);
//        chevrush.autoGearIncrease();
//
//    }







}
