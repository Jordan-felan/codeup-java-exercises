package shapes;

import util.Input;

import java.util.Scanner;
public class CircleApp {

    public static void main(String[] args) {
        Input input2 = new Input();
        Circle circle2 = new Circle(input2.getDouble());
//        double radius = input2.getDouble();
//        circle2.setRadius(radius);
        System.out.println("The diameter of the circle is: " + circle2.getDiameter());
        System.out.println("The area of the circle is: " + circle2.getArea());
        System.out.println("The circumference of the circle is: " + circle2.getCircumference());

    }

}
