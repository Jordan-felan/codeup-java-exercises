package shapes;

import java.util.Scanner;

public class Circle {

    private double radius;
    private double PI = Math.PI;

//    public Circle() {
//        radius = 0.0;
//    }

    public Circle(double r) {
        this.radius = r;
    }

    public void setRadius(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }


    public double getDiameter() {
        return radius * 2;
    }

    public double getArea(){
        return PI * radius * radius;

    }

    public double getCircumference(){
        return 2 * PI * radius;

    }
}
