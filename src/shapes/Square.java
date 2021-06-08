package shapes;

public class Square extends Quadritlateral {

    public Square (double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;

    }

    @Override
    public void setWidth(double width) {
        this.length = length;
        this.width = width;

    }
//    private double side;
//
//    public Square(double side) {
//        super(side, side); //overrides the original length and width parameters of Rectangle
//        this.side = side;
//    }
//
//    @Override
//    public double getPerimeter(){
////        super.getPerimeter();
//        return 4 * side;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.pow(side, 2);
//    }
}
