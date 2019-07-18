package volume;

import shapes.RectangularTriangle;

public class ValumeHips extends RectangularTriangle implements Volume{

    private double height;


    public ValumeHips(double height) {
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
        return height * getArea() ;
    }

    @Override
    public double getAllSurfaceArea() {
        return 0;
    }
}

