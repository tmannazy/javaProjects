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
        assertFalse(yamaha.isBikeDecelerating());
    }

    @Test
    @DisplayName("Increment bike gear one in sequence of ones")
    public void acceleratesSpeedInGearOneTest() {
        Bike kawasaki = new Bike();
        kawasaki.startAndStopBike(true);
        assertFalse(kawasaki.isBikeDecelerating());
        int speedCount = 0;
        while (speedCount <= 19) {
            kawasaki.accelerate(true, speedCount);
            speedCount++;
        }
        int getGearInUse = kawasaki.displaySelectedGear();
        assertEquals(20, kawasaki.getGearMaxOrMinSpeed());
        assertEquals(1, getGearInUse);
    }

    @Test
    @DisplayName("Increment bike gear two in sequence of twos")
    public void acceleratesSpeedInGearTwoTest() {
        Bike honda = new Bike();
        honda.startAndStopBike(true);
        assertFalse(honda.isBikeDecelerating());
        int speedCount = 20;
        while (speedCount < 30) {
            honda.accelerate(true, speedCount);
            speedCount = speedCount + 2;
        }
        int getGearInUse = honda.displaySelectedGear();
        assertEquals(30, honda.getGearMaxOrMinSpeed());
        assertEquals(2, getGearInUse);
    }

    @Test
    @DisplayName("Increment bike gear three in sequence of threes")
    public void acceleratesSpeedInGearThreeTest() {
        Bike harleyDavidson = new Bike();
        harleyDavidson.startAndStopBike(true);
        assertFalse(harleyDavidson.isBikeDecelerating());
        int speedCount = 31;
        while (speedCount < 40) {
            harleyDavidson.accelerate(true, speedCount);
            speedCount = speedCount + 3;
        }
        int getGearInUse = harleyDavidson.displaySelectedGear();
        assertEquals(40, harleyDavidson.getGearMaxOrMinSpeed());
        assertEquals(3, getGearInUse);
    }

    @Test
    @DisplayName("Increment bike gear four in sequence of fours")
    public void acceleratesSpeedInGearFourTest() {
        Bike suzuki = new Bike();
        suzuki.startAndStopBike(true);
        assertFalse(suzuki.isBikeDecelerating());
        int speedCount = 41;
        while (speedCount <= 52) {
            suzuki.accelerate(true, speedCount);
            speedCount = speedCount + 4;
        }
        int getGearInUse = suzuki.displaySelectedGear();
        assertEquals(53, suzuki.getGearMaxOrMinSpeed());
        assertEquals(4, getGearInUse);
    }

    @Test
    @DisplayName("The Bike can be decelerated")
    public void theBikeCanBeDecelerated() {
        Bike roadRush = new Bike();
        roadRush.startAndStopBike(true);
        roadRush.decelerate(true, 0);
        assertTrue(roadRush.isBikeDecelerating());
    }

    @Test
    @DisplayName("Decrement bike gear one in sequence of ones")
    public void deceleratesSpeedInGearOneTest() {
        Bike tvs = new Bike();
        tvs.startAndStopBike(true);
        assertFalse(tvs.isBikeAccelerating());
        int speedCount = 19;
        while (speedCount >= 0) {
            tvs.decelerate(true, speedCount);
            speedCount--;
        }
        int getGearInUse = tvs.displaySelectedGear();
        assertEquals(0, tvs.getGearMaxOrMinSpeed());
        assertEquals(1, getGearInUse);
    }

    @Test
    @DisplayName("Decrement bike gear two in sequence of twos")
    public void deceleratesSpeedInGearTwoTest() {
        Bike innoson = new Bike();
        innoson.startAndStopBike(true);
        assertFalse(innoson.isBikeAccelerating());
        int speedCount = 30;
        while (speedCount > 21) {
            innoson.decelerate(true, speedCount);
            speedCount = speedCount - 2;
        }
        int getGearInUse = innoson.displaySelectedGear();
        assertEquals(20, innoson.getGearMaxOrMinSpeed());
        assertEquals(2, getGearInUse);
    }

    @Test
    @DisplayName("Decrement bike gear three in sequence of threes")
    public void deceleratesSpeedInGearThreeTest() {
        Bike polaris = new Bike();
        polaris.startAndStopBike(true);
        assertFalse(polaris.isBikeAccelerating());
        int speedCount = 40;
        while (speedCount > 31) {
            polaris.decelerate(true, speedCount);
            speedCount = speedCount - 3;
        }
        int getGearInUse = polaris.displaySelectedGear();
        assertEquals(31, polaris.getGearMaxOrMinSpeed());
        assertEquals(3, getGearInUse);
    }

    @Test
    @DisplayName("Decrement bike gear four in sequence of fours")
    public void deceleratesSpeedInGearFourTest() {
        Bike kymco = new Bike();
        kymco.startAndStopBike(true);
        assertFalse(kymco.isBikeAccelerating());
        int speedCount = 53;
        while (speedCount > 41) {
            kymco.decelerate(true, speedCount);
            speedCount = speedCount - 4;
        }
        int getGearInUse = kymco.displaySelectedGear();
        assertEquals(41, kymco.getGearMaxOrMinSpeed());
        assertEquals(4, getGearInUse);
    }
}
