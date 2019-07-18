package volume;

import shapes.RectangularTriangle;

public class VolumeBaseTrapezium extends RectangularTriangle implements Volume{

    private double height;

    public VolumeBaseTrapezium(double height){
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
        return height * getArea();
    }
}
