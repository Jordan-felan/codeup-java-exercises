package shapes;

public class Rectangle extends Quadritlateral implements Measurable {

    public Rectangle(double length, double width){
        super(length, width);
    }
    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

//    private double length;
//    private double width;
//
//    public Rectangle(double length,double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getPerimeter(){
//        return (2 * length) + (2 * width);
//    }
//
//    public double getArea(){
//        return length * width;
//    }
}
