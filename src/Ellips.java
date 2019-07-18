/**
 * created by Vika and Nazar
 */

public class Ellips extends ShapesWithoutAngles {

    private double radiusTwo;
    private double sideOne;
    private double sideTwo;



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

    public double  getPerimeter(double sideOne, double sideTwo){
        return  (4 * Math.PI * sideOne * sideTwo + (sideOne - sideTwo)) / (sideOne + sideTwo);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
