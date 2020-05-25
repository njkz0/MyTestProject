package info.my.mainclass;

import info.my.AbstractShape;
import info.my.Shape;
import info.my.circle.Circle;
import info.my.square.Square;
import info.my.triangle.Triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MainClass {
    static Logger log = Logger.getLogger(MainClass.class.getName());

    public static void main(String[] args) {
        Circle circle1 = new Circle(15.5);
        Square square1 = new Square(20);
        Triangle triangle1 = new Triangle(14.5, 20.0, 30.7);
        Circle circle2 = new Circle(30);
        Square square2 = new Square(5);
        Triangle triangle2 = new Triangle(30, 20.0, 30);

        log.info("Area of circle - " + circle1.getArea());
        log.info("Area of triangle - " + triangle1.getArea());
        log.info("Area of square - " + square1.getArea());

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle1);
        shapeList.add(square1);
        shapeList.add(triangle1);
        shapeList.add(circle2);
        shapeList.add(square2);
        shapeList.add(triangle2);


        Shape withMinArea=null;
        Shape withMaxArea=null;

        for (int i = 0; i < shapeList.size() ; i++) {
            for (int n = i+1; n < shapeList.size() ; n++){
               Shape first= shapeList.get(i);
               Shape second= shapeList.get(n);
                    if(first.getArea()>second.getArea()){
                        withMaxArea=first;
                    } else {withMinArea=first;}
                }
            }
        log.info("Type of shape with max area  - " + withMaxArea.getClass().getSimpleName() + ", and area = " + withMaxArea.getArea());
        log.info("Type of shape with min area  - " + withMinArea.getClass().getSimpleName() + ", and area = " + withMinArea.getArea());
    }


    }



