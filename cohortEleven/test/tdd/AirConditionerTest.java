package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class AirConditionerTest {
    @Test
    public void myACIsOffTest() {
        AirConditioner midea = new AirConditioner();
        midea.switchButton(true);
        assertFalse(midea.getSwitchStatus());
    }

}
