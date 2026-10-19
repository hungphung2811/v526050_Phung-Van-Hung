package b3;

public class Diem {
    private double x;
    private double y;

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double khoangCach(Diem d) {
        return Math.hypot(x - d.x, y - d.y);
    }
}
