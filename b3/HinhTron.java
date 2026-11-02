package b3;

public class HinhTron extends Hinh {
    private final Diem o;
    private final double banKinh;

    public HinhTron(Diem o, double banKinh) {
        this.o = o;
        this.banKinh = banKinh;
    }

    public void TinhTien(double number) {
        this.o.setX(this.o.getX() + number);
        this.o.setY(this.o.getY() + number);
    }

    @Override
    public double chuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron [o=" + o + ", banKinh=" + banKinh + ", chuVi()=" + chuVi() + ", dienTich()=" + dienTich()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }
}
