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
        powerBike.startBike(true);
        assertTrue(powerBike.isBikeAccelerating());
    }

    @Test
    @DisplayName("Increment bike gear one in sequence of ones")
    public void acceleratesGearOneInIncrementOfOnesTest() {
        Bike powerBikeOne = new Bike();
        powerBikeOne.gearOne(1);
        powerBikeOne.accelerate(true, 15);
        assertEquals(16, powerBikeOne.getGearSpeed());
    }

    @Test
    @DisplayName("Increment bike gear two in sequence of twos")
    public void acceleratesGearTwoInIncrementOfTwosTest() {
        Bike powerBikeTwo = new Bike();
        powerBikeTwo.startBike(true);
        powerBikeTwo.gearTwo(2);
        powerBikeTwo.accelerate(true, 24);
        assertEquals(26, powerBikeTwo.getGearSpeed());
    }

    @Test
    @DisplayName("Increment bike gear three in sequence of threes")
    public void acceleratesGearThreeInIncrementOfThreesTest() {
        Bike powerBikeThree = new Bike();
        powerBikeThree.startBike(true);
        powerBikeThree.gearThree(3);
        powerBikeThree.accelerate(true, 35);
        assertEquals(38, powerBikeThree.getGearSpeed());
    }

    @Test
    @DisplayName("Increment bike gear four in sequence of fours")
    public void acceleratesGearFourInIncrementOfFourTest() {
        Bike powerBikeFour = new Bike();
        powerBikeFour.startBike(true);
        powerBikeFour.gearFour(4);
        powerBikeFour.accelerate(true, 44);
        assertEquals(48, powerBikeFour.getGearSpeed());
    }

    @Test
    @DisplayName("The Bike can be decelerated")
    public void theBikeCanBeDecelerated() {
        Bike jianshe = new Bike();
        jianshe.startBike(true);
        assertTrue(jianshe.isBikeDecelerating());
    }

    @Test
    @DisplayName("Decrement bike gear one in sequence of ones")
    public void deceleratesGearOneInIncrementOfOneTest() {
        Bike jiansheOne = new Bike();
        jiansheOne.startBike(true);
        jiansheOne.gearOne(1);
        jiansheOne.decelerate(true, 44);
        assertEquals(43, jiansheOne.getGearSpeedDecrease());
    }

    @Test
    @DisplayName("Decrement bike gear two in sequence of twos")
    public void deceleratesGearTwoInIncrementOfTwoTest() {
        Bike jiansheTwo = new Bike();
        jiansheTwo.startBike(true);
        jiansheTwo.gearTwo(2);
        jiansheTwo.decelerate(true, 35);
        assertEquals(33, jiansheTwo.getGearSpeedDecrease());
    }

    @Test
    @DisplayName("Decrement bike gear three in sequence of threes")
    public void deceleratesGearThreeInIncrementOfThreeTest() {
        Bike jiansheThree = new Bike();
        jiansheThree.startBike(true);
        jiansheThree.gearThree(3);
        jiansheThree.decelerate(true, 24);
        assertEquals(21, jiansheThree.getGearSpeedDecrease());
    }

    @Test
    @DisplayName("Decrement bike gear four in sequence of fours")
    public void deceleratesGearFourInIncrementOfFourTest() {
        Bike jiansheFour = new Bike();
        jiansheFour.startBike(true);
        jiansheFour.gearFour(4);
        jiansheFour.decelerate(true, 15);
        assertEquals(11, jiansheFour.getGearSpeedDecrease());
    }
//
//    @Test
//    @DisplayName("Speed acceleration gear auto change")
//    public void autoGearSelectionAccelerationTest() {
//        Bike bikeyCrush = new Bike();
//        start at a given gear range
//        bikeyCrush.gearOne(20);
//        check the starting gear for the gear range it falls under
//        String getGearRange = bikeyCrush.checkForGearRange();
//        assert the range is expected one
//        assertEquals("Gear 1", getGearRange);
//        change gear by more acceleration
//        bikeyCrush.gearTwo(30);
//        getGearRange = bikeyCrush.checkForGearRange();
//        assertEquals("Gear 2", getGearRange);

//        bikeyCrush.gear
//        asserTrue(bikeyCrush.gearRange())
//        bikeyCrush.autoGearIncrease(15);
//        bikeyCrush.autoGearIncrease();

    }
//
//
//
//
//
//

//}
