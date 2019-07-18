package volume;

import shapes.Parallelogram;

public class VolumeBaseParallelogram extends Parallelogram implements Volume {

    public VolumeBaseParallelogram(double height, double side) {
        super(height, side);
    }

    @Override
    public double getVolume() {
        return getHeight() * getArea();
    }
}
