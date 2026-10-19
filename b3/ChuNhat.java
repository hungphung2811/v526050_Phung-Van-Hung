package b3;

public class ChuNhat extends Hinh {
    private final double dai, rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public double chuVi() {
        return 2 * (dai + rong);
    }

    @Override
    public double dienTich() {
        return dai * rong;
    }
}
