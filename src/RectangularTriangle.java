/**
 * Created by Petro
 */
public class RectangularTriangle extends ShapesWithAngle {

    private double catheter1, catheter2;

    public RectangularTriangle(double catheter1, double catheter2) {
        this.catheter1 = catheter1;
        this.catheter2 = catheter2;
    }

    public double getCatheter1() {
        return catheter1;
    }

    public void setCatheter1(double catheter1) {
        this.catheter1 = catheter1;
    }

    public double getCatheter2() {
        return catheter2;
    }

    public void setCatheter2(double catheter2) {
        this.catheter2 = catheter2;
    }

    @Override
    public double getArea() {
        return 0.5 * catheter1 * catheter2;
    }

}
