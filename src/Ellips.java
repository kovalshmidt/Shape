public abstract class Ellips extends ShapesWithoutAngles {

    public Ellips(double radiusOne) {
        super(radiusOne);
    }


    public double getArea(double radiusTwo){
        return getRadius() * radiusTwo * Math.PI;
    }
}
