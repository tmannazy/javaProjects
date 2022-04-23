package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    @DisplayName("Given that AC is off test for turning on the AC when turned on")
    public void myACIsOffTest() {
        AirConditioner mideaRoomOne = new AirConditioner();
        mideaRoomOne.getSwitchStatus();
        mideaRoomOne.switchButton(true);
        assertTrue(mideaRoomOne.getSwitchStatus());
    }

    @Test
    @DisplayName("Given that AC is on test that AC is off when turned off")
    public void myACIsOnTest() {
        AirConditioner mideaRoomTwo = new AirConditioner();
        mideaRoomTwo.switchButton(true);
        mideaRoomTwo.switchButton(false);
        assertFalse(mideaRoomTwo.getSwitchStatus());
    }

    @Test
    @DisplayName("Given that AC is on when I increase temperature assert that temperature increases")
    public void isTempOfACIncreasedTest() {
        AirConditioner mideaRoomThree = new AirConditioner();
        mideaRoomThree.increaseTemp();
        assertEquals(25, mideaRoomThree.getTemp);

    }
  }
