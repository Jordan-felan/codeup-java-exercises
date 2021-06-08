package shapes;

public abstract class Quadritlateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadritlateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
         return length;
    }

    public double getWidth(){
        return width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);

}
