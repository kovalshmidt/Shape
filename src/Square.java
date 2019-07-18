/**
 * Created by Lyubchyk Mannko
 */

public class Square extends ShapesWithAngle {

   private double a;

    public Square() {
        this.a = 1.0;
    }
    public Square(double a) {
    this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }
}
