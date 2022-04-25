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
        assertEquals(16, kawasaki.getSpeedIncrease(), "Gear " + kawasaki.displaySelectedGear());
    }

    @Test
    @DisplayName("Increment bike gear two in sequence of twos")
    public void acceleratesGearTwoInIncrementOfTwosTest() {
        Bike honda = new Bike();
        honda.startBike(true);
        honda.accelerate(true, 24);
        assertEquals(26, honda.getSpeedIncrease(), "Gear " + honda.displaySelectedGear());
    }

    @Test
    @DisplayName("Increment bike gear three in sequence of threes")
    public void acceleratesGearThreeInIncrementOfThreesTest() {
        Bike harleyDavidson = new Bike();
        harleyDavidson.startBike(true);
        harleyDavidson.accelerate(true, 35);
        assertEquals(38, harleyDavidson.getSpeedIncrease(), "Gear " + harleyDavidson.displaySelectedGear());
    }

    @Test
    @DisplayName("Increment bike gear four in sequence of fours")
    public void acceleratesGearFourInIncrementOfFourTest() {
        Bike suzuki = new Bike();
        suzuki.startBike(true);
        suzuki.accelerate(true, 44);
        assertEquals(48, suzuki.getSpeedIncrease(), "Gear " + suzuki.displaySelectedGear());
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
        assertEquals(12, tvs.getSpeedDecrease(), "Gear " + tvs.displaySelectedGear());
    }

    @Test
    @DisplayName("Decrement bike gear two in sequence of twos")
    public void deceleratesGearTwoInIncrementOfTwoTest() {
        Bike innoson = new Bike();
        innoson.startBike(true);
        innoson.decelerate(true, 27);
        assertEquals(25, innoson.getSpeedDecrease(), "Gear " + innoson.displaySelectedGear());
    }

    @Test
    @DisplayName("Decrement bike gear three in sequence of threes")
    public void deceleratesGearThreeInIncrementOfThreeTest() {
        Bike polaris = new Bike();
        polaris.startBike(true);
        polaris.decelerate(true, 39);
        assertEquals( 36, polaris.getSpeedDecrease(), "Gear " + polaris.displaySelectedGear());
    }

    @Test
    @DisplayName("Decrement bike gear four in sequence of fours")
    public void deceleratesGearFourInIncrementOfFourTest() {
        Bike kymco = new Bike();
        kymco.startBike(true);
        kymco.decelerate(true, 48);
        assertEquals(44, kymco.getSpeedDecrease(), "Gear " + kymco.displaySelectedGear());
    }
}
