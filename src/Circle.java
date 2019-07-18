/**
 * Created by Maxim Semeniuk
 */

public class Circle extends ShapesWithoutAngles {


    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
