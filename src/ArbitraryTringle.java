/**
 * Created by Bohdan and MaximK
 */
public class ArbitraryTringle extends ShapesWithAngle {

    private double firstSide, secondSide, thirdSide;

    public ArbitraryTringle(double firstSide) {
        this.firstSide = firstSide;
        this.secondSide = 1.00;
        this.thirdSide = 1.0;
    }

    public ArbitraryTringle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = 1.0;
    }

    public ArbitraryTringle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    @Override
    public double getArea() {
        double p = (getFirstSide() + getSecondSide() + getThirdSide()) / 2;

        return Math.sqrt(p * (p - getFirstSide()) * (p - getSecondSide()) * (p - getThirdSide()));
    }
}
