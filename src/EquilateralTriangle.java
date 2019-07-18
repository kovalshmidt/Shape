/**
 * Created by Maxim Semeniuk
 */
public class EquilateralTriangle extends ShapesWithAngle {

    double height;

    double side;

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
}
