/**
 * Created by Bohdan and MaximK
 */
public class ArbitraryTringle extends ShapesWithAngle {

    private double firstSide, secondSide, thirdSide;

    public ArbitraryTringle(double firstSide) {
        this.firstSide = firstSide;
        this.secondSide = 1.0;
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

    private double getFirstSide() {
        return firstSide;
    }

    private double getSecondSide() {
        return secondSide;
    }

    private double getThirdSide() {
        return thirdSide;
    }

    @Override
    public double getArea() {
        double p = (getFirstSide() + getSecondSide() + getThirdSide()) / 2;

        return Math.sqrt(p * (p - getFirstSide()) * (p - getSecondSide()) * (p - getThirdSide()));
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }
}
