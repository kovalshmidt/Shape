package volume;

import shapes.Square;

/**
 * Created by Lyubchyk Manko
 */
public class VolumeBaseSquare extends Square  implements Volume{

    private double height;

    public VolumeBaseSquare(double side, double height){
        super(side);
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

    @Override
    public double getAllSurfaceArea() {
        return 0;
    }
}
