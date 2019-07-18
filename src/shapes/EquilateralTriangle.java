package shapes;

/**
 * Created by Maxim Semeniuk
 */
public class EquilateralTriangle extends ShapesWithAngle {

    private double height;
    private double side;

    public EquilateralTriangle(double height, double side){
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
        return side * height / 0.5;
    }

    @Override
    public double getPerimeter() {
        return side * 3;
    }
}
