package volume;

import javafx.scene.shape.TriangleMesh;
import shapes.RectangularTriangle;

public class VolumeBaseRectangularTriangle extends RectangularTriangle implements Volume {

    private double height;

    public VolumeBaseRectangularTriangle(double catheter1, double catheter2,
                                         double hypotenuse, double height) {
        super(catheter1, catheter2, hypotenuse);
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
