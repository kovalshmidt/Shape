package volume;

import shapes.EquilateralTriangle;

public class VolumeBaseEquilateralTriangle extends EquilateralTriangle implements Volume {

    double lengthOfTheBaseOfThePyramid;

    public double getRadiusOfTheCircleEntered() {
        return radiusOfTheCircleEntered;
    }

    public void setRadiusOfTheCircleEntered(double radiusOfTheCircleEntered) {
        this.radiusOfTheCircleEntered = radiusOfTheCircleEntered;
    }

    double radiusOfTheCircleEntered = Math.sqrt(3)/6 * lengthOfTheBaseOfThePyramid;

    public double getLengthOfTheBaseOfThePyramid() {
        return lengthOfTheBaseOfThePyramid;
    }

    public void setLengthOfTheBaseOfThePyramid(double lengthOfTheBaseOfThePyramid) {
        this.lengthOfTheBaseOfThePyramid = lengthOfTheBaseOfThePyramid;
    }

    public VolumeBaseEquilateralTriangle(double height, double side) {
        super(height, side);
    }

    @Override
    public double getVolume() {
        return getHeight() * getLengthOfTheBaseOfThePyramid() * getLengthOfTheBaseOfThePyramid() * Math.sqrt(3);
    }

    @Override
    public double getAllSurfaceArea() {
        return 0;
    }
}
