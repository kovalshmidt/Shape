/**
 * created by Vika and Nazar
 */
public class Parallelogram extends ShapesWithAngle {

    private double height;
    private double side;
    private double sideOne;
    private double sideTwo;

    public Parallelogram(double height, double side) {
        this.height = height;
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return getHeight() * getSide();
    }

    @Override
    public double getPerimeter() {
        return side + sideOne + sideTwo;
    }
}
