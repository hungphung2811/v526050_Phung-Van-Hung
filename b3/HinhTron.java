package b3;

public class HinhTron extends Hinh {
    private final Diem o;
    private final double banKinh;

    public HinhTron(Diem o, double banKinh) {
        this.o = o;
        this.banKinh = banKinh;
    }

    @Override
    public double chuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
