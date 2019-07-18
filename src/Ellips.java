public abstract class Ellips extends ShapesWithoutAngles {

    private double radiusTwo;


    public double getRadiusTwo() {
        return radiusTwo;
    }

    public void setRadiusTwo(double radiusTwo) {
        this.radiusTwo = radiusTwo;
    }

    public Ellips(double radiusOne) {
        super(radiusOne);
    }


    public double getArea(){
        return getRadius() * radiusTwo * Math.PI;
    }
}
