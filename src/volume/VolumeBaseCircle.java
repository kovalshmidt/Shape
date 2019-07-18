package volume;

import shapes.Circle;

public class VolumeBaseCircle extends Circle implements Volume {

    public VolumeBaseCircle(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return 1.333 * Math.PI * getRadius() * getRadius() * getRadius();
    }
}
