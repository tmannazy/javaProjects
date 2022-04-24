package airconditioner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    @DisplayName("Given that AC is off test for turning on the AC when turned on")
    public void myACIsOffTest() {
        AirConditioner mideaRoomOne = new AirConditioner();
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
    @DisplayName("Given that AC is decreased when I increase temperature check that temperature increases")
    public void isTempOfACIncreasedTest() {
        AirConditioner mideaRoomThree = new AirConditioner();
        mideaRoomThree.setTemp(27);
        mideaRoomThree.decreaseTemp(12);
        mideaRoomThree.increaseTemp(30);
        int tempLevel = mideaRoomThree.getTempLevel();
        assertEquals(30, tempLevel);
    }

    @Test
    @DisplayName("Given that AC is on when I decrease temperature check that temperature decreases")
    public void isTempOfACDecreasedTest() {
        AirConditioner mideaRoomFour = new AirConditioner();
        mideaRoomFour.switchButton(true);
        assertTrue(mideaRoomFour.getSwitchStatus());
        mideaRoomFour.decreaseTemp(20);
        int tempLevel = mideaRoomFour.getTempLevel();
        assertEquals(-20, tempLevel);
    }

    @Test
    @DisplayName("Given that when AC is on when I increase temp it should not get beyond 30")
    public void isTempOfACIncreasedBeyondThirtyTest() {
        AirConditioner mideaRoomFive = new AirConditioner();
        mideaRoomFive.switchButton(true);
        assertTrue(mideaRoomFive.getSwitchStatus());
        mideaRoomFive.increaseTemp(45);
        int tempLevel = mideaRoomFive.getTempLevel();
        assertEquals(30, tempLevel);
    }

    @Test
    @DisplayName("Given that when AC is on when I increase temp it should not get beyond 30")
    public void isTempOfACDecreasedBelowSixteenTest() {
        AirConditioner mideaRoomSix = new AirConditioner();
        mideaRoomSix.switchButton(true);
        assertTrue(mideaRoomSix.getSwitchStatus());
        mideaRoomSix.decreaseTemp(15);
        int tempLevel = mideaRoomSix.getTempLevel();
        assertEquals(16, tempLevel);
    }

  }
