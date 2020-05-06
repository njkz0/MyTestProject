package info.my.mainclass;

import info.my.circle.Circle;
import info.my.square.Square;
import info.my.triangle.Triangle;

import java.util.logging.Logger;

public class MainClass {
   static Logger log=Logger.getLogger(MainClass.class.getName());
    public static void main(String[] args) {
        Circle c1= new Circle(15.5);
        Square sq1= new Square(20);
        Triangle tr1= new Triangle(14.5, 20.0, 30.7);

        log.info("Area of circle - "+ c1.getArea());
        log.info("Area of triangle - "+ tr1.getArea());
        log.info("Area of square - "+ sq1.getArea());
    }


}
