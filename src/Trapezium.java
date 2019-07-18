/**
 * created Petya and Vitalik
 */
public class Trapezium extends ShapesWithAngle {

    private double height, middleLine, side1, side2;

    public Trapezium(double height, double middleLine) {
        this.height = height;
        this.middleLine = middleLine;
        this.side1 =side1;
        this.side2 =side2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMiddleLine() {
        return middleLine;
    }

    public void setMiddleLine(double middleLine) {
        this.middleLine = middleLine;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double getArea(){
      return middleLine * height;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + middleLine*2;
    }


}
