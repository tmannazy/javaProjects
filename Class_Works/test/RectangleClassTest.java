package test;

import org.junit.jupiter.api.Test;
import src.RectangleClass;

import static org.junit.jupiter.api.Assertions.*;

class RectangleClassTest {
    RectangleClass rectangle;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        rectangle = new RectangleClass();
    }

    @Test
    void testThatLengthIsSetToDefault() {
        double length = 1.0;
        rectangle.setLength(length);
        assertEquals(1.0, rectangle.getLength());
    }

    @Test
    void testThatWidthIsSetToDefault() {
        double width = 1.0;
        rectangle.setWidth(width);
        assertEquals(1.0, rectangle.getWidth());
    }

    @Test
    void testThePerimeterMethod(){
        double width = 2.0;
        double length = 5.0;
        rectangle.calculatePerimeter(width, length);
        assertEquals(14.0, rectangle.getPerimeter());
    }

    @Test
    void testTheAreaMethod(){
        double width = 3.0;
        double length = 5.0;
        rectangle.calculateArea(width, length);
        assertEquals(15.0, rectangle.getArea());
    }

    @Test
    void testThatExceptionIsThrownWhenIllegalValueProvided() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> rectangle.setLength(120));
        assertEquals(" length value is out of range", ex.getMessage());
    }

}