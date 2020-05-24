package info.my.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea() {
        Square square= new Square(5);
        double result= square.getArea();
        assertEquals(25, result);
    }
}