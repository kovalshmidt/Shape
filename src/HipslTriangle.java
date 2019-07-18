/**
 * Created Vitaliy
 */
public class HipslTriangle extends ShapesWithAngle {


    private double height, basis;

    public HipslTriangle(double height, double basis) {
        this.height = height;
        this.basis = basis;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBasis() {
        return basis;
    }

    public void setBasis(double basis) {
        this.basis = basis;
    }

    @Override
    public double getArea() {
        return basis * height * 0.5;
    }
}
