package info.my.circle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        Circle circle=new Circle(1);
        double result = circle.getArea();
        assertEquals(3.14, result);
    }
}