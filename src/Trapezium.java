public class Trapezium extends ShapesWithAngle {

    private double height, middleLine;

    public Trapezium(double height, double middleLine) {
        this.height = height;
        this.middleLine = middleLine;
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

    @Override
    public double getArea(){
      return middleLine * height;
    }



}
