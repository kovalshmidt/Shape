/**
 * created by Vika and Nazar
 */

public class Ellips extends ShapesWithoutAngles {

    private double radiusTwo;


    public Ellips(double radiusOne, double radiusTwo) {
        super(radiusOne);
        this.radiusTwo = radiusTwo;
    }

    public double getRadiusTwo() {
        return radiusTwo;
    }

    public void setRadiusTwo(double radiusTwo) {
        this.radiusTwo = radiusTwo;
    }

    public double getArea() {
        return getRadius() * radiusTwo * Math.PI;
    }
}
