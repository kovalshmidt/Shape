
package volume;

import shapes.Ellips;
/**
 * created by Vika, Nazar
 */
public class VolumeBaseEllips extends Ellips implements Volume {

    private double height;

    public VolumeBaseEllips(double radiusOne, double radiusTwo, double height) {
        super(radiusOne, radiusTwo, height);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public double getAllSurfaceArea() {
        return (getRadiusTwo() + getRadius())*getHeight();
    }
}
