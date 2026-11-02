package b3_oop;

public class BaiTap1 {
    public static void main(String[] args) {
        PhanSo a = new PhanSo(1, 2);
        PhanSo b = new PhanSo(3, 4);
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + a.cong(b));
        System.out.println("a - b = " + a.tru(b));
        System.out.println("a * b = " + a.nhan(b));
        System.out.println("a / b = " + a.chia(b));
        System.out.println("So sanh a voi b = " + a.soSanh(b));
        System.out.println("Rut gon 6/8 = " + new PhanSo(6, 8).rutGon());

        PhanSo[] ds = {
            new PhanSo(1, 2), new PhanSo(3, 4), new PhanSo(6, 3),
            new PhanSo(-5, 7), new PhanSo(8, 4), new PhanSo(7, -3)
        };
        PhanSo max = ds[0];
        PhanSo tong = new PhanSo();
        int khongNguyen = 0;
        for (PhanSo p : ds) {
            System.out.println(p);
            if (p.soSanh(max) > 0) {
                max = p;
            }
            tong = tong.cong(p);
            if (!p.laSoNguyen()) {
                khongNguyen++;
            }
        }
        System.out.println("Phan so lon nhat: " + max);
        System.out.println("Tong cac phan so: " + tong);
        System.out.println("So phan so khong phai so nguyen: " + khongNguyen);
    }
}
