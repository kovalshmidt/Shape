public abstract class Elips extends ShapesWithoutAngles {

    public Elips(double radius) {
        super(radius);
    }

    public double getArea(double radiusTwo){
        return getRadius() * radiusTwo * Math.PI;
    }
}
