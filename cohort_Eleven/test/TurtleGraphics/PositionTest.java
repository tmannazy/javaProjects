package TurtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    Position position;
    SketchPad sketchPad;


    @BeforeEach
    void setUp() {
        position = new Position(3, 6);
        sketchPad = new SketchPad(10, 10);
    }

    @Test
    void testThatTurtleIsAtTheStartingPosition() {
        sketchPad.fillArray("_");
        String[][] arrayOfSketches = sketchPad.getSketchPad();
//        position.moveForward(4, 7, 5);
//        assertTrue(position.isAtBeginning());
    }
}