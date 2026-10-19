package b3;

public class DuongThang {
    private Diem a;
    private Diem b;

    public DuongThang(Diem a, Diem b) {
        this.a = a;
        this.b = b;
    }

    public Diem getA() {
        return a;
    }

    public Diem getB() {
        return b;
    }

    public double doDai() {
        return a.khoangCach(b);
    }

    public static void main(String[] args) {
        DuongThang d = new DuongThang(new Diem(0, 0), new Diem(3, 4));
        System.out.println("Do dai duong thang AB = " + d.doDai());
    }
}
