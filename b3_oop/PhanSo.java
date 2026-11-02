package b3_oop;

public class PhanSo {
    private int t;
    private int m;

    public PhanSo() {
        this(0, 1);
    }

    public PhanSo(int t, int m) {
        this.t = t;
        setM(m);
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        if (m == 0) {
            throw new IllegalArgumentException("Mau so phai khac 0");
        }
        this.m = m;
    }

    public PhanSo cong(PhanSo o) {
        return new PhanSo(t * o.m + o.t * m, m * o.m).rutGon();
    }

    public PhanSo tru(PhanSo o) {
        return new PhanSo(t * o.m - o.t * m, m * o.m).rutGon();
    }

    public PhanSo nhan(PhanSo o) {
        return new PhanSo(t * o.t, m * o.m).rutGon();
    }

    public PhanSo chia(PhanSo o) {
        if (o.t == 0) {
            throw new ArithmeticException("Khong the chia cho phan so 0");
        }
        return new PhanSo(t * o.m, m * o.t).rutGon();
    }

    public int soSanh(PhanSo o) {
        int dau = Integer.signum(m) * Integer.signum(o.m);
        return Long.compare((long) t * o.m * dau, (long) o.t * m * dau);
    }

    public PhanSo rutGon() {
        int g = ucln(Math.abs(t), Math.abs(m));
        int tu = t / g;
        int mau = m / g;
        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
        return new PhanSo(tu, mau);
    }

    public boolean laSoNguyen() {
        return t % m == 0;
    }

    private static int ucln(int a, int b) {
        return b == 0 ? (a == 0 ? 1 : a) : ucln(b, a % b);
    }

    @Override
    public String toString() {
        PhanSo p = rutGon();
        return p.m == 1 ? String.valueOf(p.t) : p.t + "/" + p.m;
    }
}
