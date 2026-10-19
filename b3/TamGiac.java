package b3;

public class TamGiac extends Hinh {
    private final Diem a, b, c;

    public TamGiac(Diem a, Diem b, Diem c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double chuVi() {
        return a.khoangCach(b) + b.khoangCach(c) + c.khoangCach(a);
    }

    @Override
    public double dienTich() {
        double cross = (b.getX() - a.getX()) * (c.getY() - a.getY())
                - (c.getX() - a.getX()) * (b.getY() - a.getY());
        return Math.abs(cross) / 2;
    }
}
