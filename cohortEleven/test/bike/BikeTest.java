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
        Bike yamaha = new Bike();
        yamaha.startBike(true);
        yamaha.accelerate(true, 5);
        assertTrue(yamaha.isBikeAccelerating());
    }

    @Test
    @DisplayName("Increment bike gear one in sequence of ones")
    public void acceleratesGearOneInIncrementOfOnesTest() {
        Bike kawasaki = new Bike();
        kawasaki.accelerate(true, 15);
        int getGearInUse = kawasaki.displaySelectedGear();
        assertEquals(16, kawasaki.getSpeedIncrease());
        assertEquals(1, getGearInUse);
    }

    @Test
    @DisplayName("Increment bike gear two in sequence of twos")
    public void acceleratesGearTwoInIncrementOfTwosTest() {
        Bike honda = new Bike();
        honda.startBike(true);
        honda.accelerate(true, 24);
        int getGearInUse = honda.displaySelectedGear();
        assertEquals(26, honda.getSpeedIncrease());
        assertEquals(2, getGearInUse);
    }

    @Test
    @DisplayName("Increment bike gear three in sequence of threes")
    public void acceleratesGearThreeInIncrementOfThreesTest() {
        Bike harleyDavidson = new Bike();
        harleyDavidson.startBike(true);
        harleyDavidson.accelerate(true, 35);
        int getGearInUse = harleyDavidson.displaySelectedGear();
        assertEquals(38, harleyDavidson.getSpeedIncrease());
        assertEquals(3, harleyDavidson.displaySelectedGear());
    }

    @Test
    @DisplayName("Increment bike gear four in sequence of fours")
    public void acceleratesGearFourInIncrementOfFourTest() {
        Bike suzuki = new Bike();
        suzuki.startBike(true);
        suzuki.accelerate(true, 44);
        int getGearInUse = suzuki.displaySelectedGear();
        assertEquals(48, suzuki.getSpeedIncrease());
        assertEquals(4, getGearInUse);
    }

    @Test
    @DisplayName("The Bike can be decelerated")
    public void theBikeCanBeDecelerated() {
        Bike roadrush = new Bike();
        roadrush.startBike(true);
        roadrush.decelerate(true, 1);
        assertTrue(roadrush.isBikeDecelerating());
    }

    @Test
    @DisplayName("Decrement bike gear one in sequence of ones")
    public void deceleratesGearOneInIncrementOfOneTest() {
        Bike tvs = new Bike();
        tvs.startBike(true);
        tvs.decelerate(true, 13);
        int getGearInUse = tvs.displaySelectedGear();
        assertEquals(12, tvs.getSpeedDecrease());
        assertEquals(1, getGearInUse);
    }

    @Test
    @DisplayName("Decrement bike gear two in sequence of twos")
    public void deceleratesGearTwoInIncrementOfTwoTest() {
        Bike innoson = new Bike();
        innoson.startBike(true);
        innoson.decelerate(true, 27);
        int getGearInUse = innoson.displaySelectedGear();
        assertEquals(25, innoson.getSpeedDecrease());
        assertEquals(2, getGearInUse);
    }

    @Test
    @DisplayName("Decrement bike gear three in sequence of threes")
    public void deceleratesGearThreeInIncrementOfThreeTest() {
        Bike polaris = new Bike();
        polaris.startBike(true);
        polaris.decelerate(true, 39);
        int getGearInUse = polaris.displaySelectedGear();
        assertEquals( 36, polaris.getSpeedDecrease());
        assertEquals(3, getGearInUse);
    }

    @Test
    @DisplayName("Decrement bike gear four in sequence of fours")
    public void deceleratesGearFourInIncrementOfFourTest() {
        Bike kymco = new Bike();
        kymco.startBike(true);
        kymco.decelerate(true, 48);
        int getGearInUse = kymco.displaySelectedGear();
        assertEquals(44, kymco.getSpeedDecrease());
        assertEquals(4, getGearInUse);
    }
}
