/**
 * Created by Petro
 */
public abstract class ShapesWithoutAngles implements Shape {

    private double radius;

    public ShapesWithoutAngles(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract double getPerimeter();

}
