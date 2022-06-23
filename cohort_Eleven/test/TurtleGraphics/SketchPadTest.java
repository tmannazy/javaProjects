package TurtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SketchPadTest {
    SketchPad testSketch;

    @BeforeEach
    void setUp() {
        testSketch = new SketchPad(10, 10);
    }

    @Test
    void testThatSketchPadExist() {
        assertNotNull(testSketch.getSketchPad());
    }

    @Test
    void testThatSketchPadElementsAreNotFilled() throws Exception {
        try {
            assertEquals("Array not empty", testSketch.checkIfEmpty());
        } catch (Exception ignored) {
        }
    }

    @Test
    void testThatArrayCanBeFilled() throws Exception {
        testSketch.fillArray("#");
        assertEquals("#", testSketch.checkIfEmpty());
    }

//    @Test
//    void testThat
}