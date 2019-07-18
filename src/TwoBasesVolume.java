/**
 * Created by Vitaliy Kovalevskyy
 */
public abstract class TwoBasesVolume implements Volume {

    private double height;

    public TwoBasesVolume(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract double getVolume();
}
