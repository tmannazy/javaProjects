package bike;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    @DisplayName("The Bike can be turned on")
    public void bikeCanBeTurnedOnTest() {
        Bike bajaj = new Bike();
        bajaj.startAndStopBike(true);
        assertTrue(bajaj.isBikeStartedOrStopped());
    }

    @Test
    @DisplayName("The Bike can be turned off")
    public void bikeCanBeTurnedOffTest() {
        Bike ogbuawaSpecial = new Bike();
        ogbuawaSpecial.startAndStopBike(true);
        assertTrue(ogbuawaSpecial.isBikeStartedOrStopped());
    }

    @Test
    @DisplayName("The Bike can be accelerated")
    public void theBikeCanBeAccelerated() {
        Bike yamaha = new Bike();
        yamaha.startAndStopBike(true);
        int speedCount = 0;
        yamaha.accelerate(true, speedCount);
        assertTrue(yamaha.isBikeAccelerating());
    }

    @Test
    @DisplayName("Increment bike gear one in sequence of ones")
    public void acceleratesGearOneInIncrementOfOnesTest() {
        Bike kawasaki = new Bike();
        kawasaki.startAndStopBike(true);
        assertFalse(kawasaki.isBikeDecelerating());
        int counter = 0;
        while (counter <= 19) {
            kawasaki.accelerate(true, counter);
            counter++;
        }
        int getGearInUse = kawasaki.displaySelectedGear();
        assertEquals(20, kawasaki.getGearMaxSpeed());
        assertEquals(1, getGearInUse);
    }

    @Test
    @DisplayName("Increment bike gear two in sequence of twos")
    public void acceleratesGearTwoInIncrementOfTwosTest() {
        Bike honda = new Bike();
        honda.startAndStopBike(true);
        assertFalse(honda.isBikeDecelerating());
        int counter = 0;
        while (counter < 29) {
            honda.accelerate(true, counter);
            counter++;
        }
        int getGearInUse = honda.displaySelectedGear();
        assertEquals(30, honda.getGearMaxSpeed());
        assertEquals(2, getGearInUse);
    }

    @Test
    @DisplayName("Increment bike gear three in sequence of threes")
    public void acceleratesGearThreeInIncrementOfThreesTest() {
        Bike harleyDavidson = new Bike();
        harleyDavidson.startAndStopBike(true);
        assertFalse(harleyDavidson.isBikeDecelerating());
        int counter = 0;
        while (counter < 39) {
            harleyDavidson.accelerate(true, counter);
            counter++;
        }
        int getGearInUse = harleyDavidson.displaySelectedGear();
        assertEquals(41, harleyDavidson.getGearMaxSpeed());
        assertEquals(3, getGearInUse);
    }

    @Test
    @DisplayName("Increment bike gear four in sequence of fours")
    public void acceleratesGearFourInIncrementOfFourTest() {
        Bike suzuki = new Bike();
        suzuki.startAndStopBike(true);
        assertFalse(suzuki.isBikeDecelerating());
        int counter = 0;
        while (counter < 49) {
            suzuki.accelerate(true, counter);
            counter++;
        }
        int getGearInUse = suzuki.displaySelectedGear();
        assertEquals(52, suzuki.getGearMaxSpeed());
        assertEquals(4, getGearInUse);
    }

//    @Test
//    @DisplayName("The Bike can be decelerated")
//    public void theBikeCanBeDecelerated() {
//        Bike roadrush = new Bike();
//        roadrush.startAndStopBike(true);
//        roadrush.decelerate(true, 1);
//        assertTrue(roadrush.isBikeDecelerating());
//    }
//
//    @Test
//    @DisplayName("Decrement bike gear one in sequence of ones")
//    public void deceleratesGearOneInIncrementOfOneTest() {
//        Bike tvs = new Bike();
//        tvs.startAndStopBike(true);
//        tvs.decelerate(true, 13);
//        int getGearInUse = tvs.displaySelectedGear();
//        assertEquals(12, tvs.getSpeedDecrease());
//        assertEquals(1, getGearInUse);
//    }
//
//    @Test
//    @DisplayName("Decrement bike gear two in sequence of twos")
//    public void deceleratesGearTwoInIncrementOfTwoTest() {
//        Bike innoson = new Bike();
//        innoson.startAndStopBike(true);
//        innoson.decelerate(true, 27);
//        int getGearInUse = innoson.displaySelectedGear();
//        assertEquals(25, innoson.getSpeedDecrease());
//        assertEquals(2, getGearInUse);
//    }
//
//    @Test
//    @DisplayName("Decrement bike gear three in sequence of threes")
//    public void deceleratesGearThreeInIncrementOfThreeTest() {
//        Bike polaris = new Bike();
//        polaris.startAndStopBike(true);
//        polaris.decelerate(true, 39);
//        int getGearInUse = polaris.displaySelectedGear();
//        assertEquals( 36, polaris.getSpeedDecrease());
//        assertEquals(3, getGearInUse);
//    }
//
//    @Test
//    @DisplayName("Decrement bike gear four in sequence of fours")
//    public void deceleratesGearFourInIncrementOfFourTest() {
//        Bike kymco = new Bike();
//        kymco.startAndStopBike(true);
//        kymco.decelerate(true, 48);
//        int getGearInUse = kymco.displaySelectedGear();
//        assertEquals(44, kymco.getSpeedDecrease());
//        assertEquals(4, getGearInUse);
//    }
}
