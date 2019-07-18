/**
 * created by Vika and Nazar
 */

public abstract  class Parallelogram extends ShapesWithAngle {

    private double height;
    private double side;

    public Parallelogram(double height, double side) {
        this.height = height;
        this.side = side;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){
        return getHeight() * getSide();
    }
}
