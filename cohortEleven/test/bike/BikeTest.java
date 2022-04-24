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
        kawasaki.gearSelection(1);
        kawasaki.accelerate(true, 15);
        assertEquals(16, kawasaki.getSpeedIncrease());
    }

    @Test
    @DisplayName("Increment bike gear two in sequence of twos")
    public void acceleratesGearTwoInIncrementOfTwosTest() {
        Bike honda = new Bike();
        honda.startBike(true);
        honda.gearSelection(2);
        honda.accelerate(true, 24);
        assertEquals(26, honda.getSpeedIncrease());
    }

    @Test
    @DisplayName("Increment bike gear three in sequence of threes")
    public void acceleratesGearThreeInIncrementOfThreesTest() {
        Bike harleyDavidson = new Bike();
        harleyDavidson.startBike(true);
        harleyDavidson.gearSelection(3);
        harleyDavidson.accelerate(true, 35);
        assertEquals(38, harleyDavidson.getSpeedIncrease());
    }

    @Test
    @DisplayName("Increment bike gear four in sequence of fours")
    public void acceleratesGearFourInIncrementOfFourTest() {
        Bike suzuki = new Bike();
        suzuki.startBike(true);
        suzuki.gearSelection(4);
        suzuki.accelerate(true, 44);
        assertEquals(48, suzuki.getSpeedIncrease());
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
        tvs.gearSelection(1);
        tvs.decelerate(true, 44);
        assertEquals(43, tvs.getSpeedDecrease());
    }

    @Test
    @DisplayName("Decrement bike gear two in sequence of twos")
    public void deceleratesGearTwoInIncrementOfTwoTest() {
        Bike innoson = new Bike();
        innoson.startBike(true);
        innoson.gearSelection(2);
        innoson.decelerate(true, 35);
        assertEquals(33, innoson.getSpeedDecrease());
    }

    @Test
    @DisplayName("Decrement bike gear three in sequence of threes")
    public void deceleratesGearThreeInIncrementOfThreeTest() {
        Bike polaris = new Bike();
        polaris.startBike(true);
        polaris.gearSelection(3);
        polaris.decelerate(true, 24);
        assertEquals(21, polaris.getSpeedDecrease());
    }

    @Test
    @DisplayName("Decrement bike gear four in sequence of fours")
    public void deceleratesGearFourInIncrementOfFourTest() {
        Bike kymco = new Bike();
        kymco.startBike(true);
        kymco.gearSelection(4);
        kymco.decelerate(true, 15);
        assertEquals(11, kymco.getSpeedDecrease());
    }

    @Test
    @DisplayName("Speed acceleration gear auto change")
    public void autoGearSelectionAccelerationTest() {
        Bike bikeyCrush = new Bike();
//        start at a given gear range
        bikeyCrush.startBike(true);
//        bikeyCrush.accelerate(true,1);
//        bikeyCrush.accelerate(true,2);
//        bikeyCrush.accelerate(true,3);

        bikeyCrush.gearSelection(20);
//        check the starting gear for the gear range it falls under
        String getGearRange = bikeyCrush.checkForGearRange();
//        assert the range is expected one
        assertEquals("Gear 1", getGearRange);
//        change gear by more acceleration
        bikeyCrush.gearSelection(30);
        getGearRange = bikeyCrush.checkForGearRange();
        assertEquals("Gear 2", getGearRange);

//        bikeyCrush.gear
//        asserTrue(bikeyCrush.gearRange())
//        bikeyCrush.autoGearIncrease(15);
//        bikeyCrush.autoGearIncrease();
    }
}
