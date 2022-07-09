package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetImplementationTest {

    SetImplementation newSet;

    @BeforeEach
    void setUp() {
        newSet = new SetImplementation();
    }

    @Test
    void newSetIsNotEmpty() {
        assertTrue(newSet.isEmpty());
    }

    @Test
    void addItem_setIsNotEmpty() {
        newSet.add("Pink");
        assertFalse(newSet.isEmpty());
    }

    @Test
    void addX_addX_setTakesFirstX() {
        newSet.add("Pink");
        newSet.add("Pink");
        assertEquals(1, newSet.size());
    }

    @Test
    void addX_addY_addY_setIsTwo() {
        newSet.add("Pink");
        newSet.add("Pink");
        newSet.add("Lagos");
        assertEquals(2, newSet.size());
    }

}