package info.my.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getArea() {
        Triangle triangle= new Triangle(3, 4, 5);
        double result = triangle.getArea();
        assertEquals(6, result);
    }
}