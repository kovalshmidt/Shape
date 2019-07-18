public abstract class Elips extends ShapesWithoutAngles {

    public Elips(double radiusOne) {
        super(radiusOne);
    }


    public double getArea(double radiusTwo){
        return getRadius() * radiusTwo * Math.PI;
    }
}
