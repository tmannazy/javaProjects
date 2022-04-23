package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {
    @Test
    public void myACIsOffTest() {
        AirConditioner midea = new AirConditioner();
        midea.getSwitchStatus();
        midea.switchButton(true);
        assertTrue(midea.getSwitchStatus());
    }

    @Test
    public void myACIsOnTest() {
        AirConditioner mideaRoomTwo = new AirConditioner();
        mideaRoomTwo.switchButton(true);
        mideaRoomTwo.switchButton(false);
        assertFalse(mideaRoomTwo.getSwitchStatus());
    }



}
