/**
 * Created by Bohdan Bozhyk and MaximK
 */
package volume;

import shapes.ArbitraryTringle;

public class VolumeBaseArbitraryTringle extends ArbitraryTringle implements Volume {

    private double height;

    public VolumeBaseArbitraryTringle(double firstSide) {
        super(firstSide);
        height = 1.0;
    }

    public VolumeBaseArbitraryTringle(double firstSide, double secondSide) {
        super(firstSide, secondSide);
        height = 1.0;
    }

    public VolumeBaseArbitraryTringle(double firstSide, double secondSide, double thirdSide) {
        super(firstSide, secondSide, thirdSide);
        height = 1.0;
    }

    public VolumeBaseArbitraryTringle(double firstSide, double secondSide, double thirdSide, double height) {
        super(firstSide, secondSide, thirdSide);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getVolume() {
        return (getArea() * getHeight()) / 3;
    }

    @Override
    public double getAllSurfaceArea() {
        return 0;
    }
}
