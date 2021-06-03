package shapes;

import util.Input;


public class CircleApp {

    public static void main(String[] args) {
        Input input2 = new Input();

        System.out.println("Give me a radius!");
        Circle circle2 = new Circle(input2.getDouble());
//        double radius = input2.getDouble();
//        circle2.setRadius(radius);
        System.out.println("The diameter of the circle is: " + Math.floor((circle2.getDiameter())*100) / 100);
        System.out.println("The area of the circle is: " + Math.floor(circle2.getArea()* 100) / 100);
        System.out.println("The circumference of the circle is: " + Math.floor(circle2.getCircumference() * 100) /100);

    }

}
//    DecimalFormat f = new DecimalFormat("#.##");