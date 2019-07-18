/**
 * Created Vitaliy
 */
public class HipslTriangle extends ShapesWithAngle {


    private double height, basis, side;

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

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return basis * height * 0.5;

    }

    @Override
    public double getPerimeter() {
        return side + side + side;
    }
}
