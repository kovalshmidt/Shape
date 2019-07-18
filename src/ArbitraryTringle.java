public class ArbitraryTringle extends ShapesWithAngle {

    private double firstSide = 1.0, secondSide = 1.0, thirdSide = 1.0;

    public ArbitraryTringle() {

    }

    public ArbitraryTringle(double firstSide) {
        this.firstSide = firstSide;
    }

    public ArbitraryTringle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
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
