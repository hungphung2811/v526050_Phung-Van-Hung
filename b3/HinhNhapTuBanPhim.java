package b3;

import java.util.Locale;
import java.util.Scanner;

public class HinhNhapTuBanPhim {
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    static Diem nhapDiem(String ten) {
        System.out.print("Toa do " + ten + " (x y): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        return new Diem(x, y);
    }

    public static void main(String[] args) {
        System.out.print("Ban muon nhap bao nhieu hinh? ");
        int n = sc.nextInt();
        Hinh[] ds = new Hinh[n];

        for (int i = 0; i < n; i++) {
            System.out.println("--- Hinh " + (i + 1) + " ---");
            int loai;
            while (true) {
                System.out.print("Chon hinh (1. Tam Giac, 2. Chu Nhat, 3. Hinh Tron): ");
                loai = sc.nextInt();
                if (loai >= 1 && loai <= 3) {
                    break;
                }
                System.out.println("Lua chon khong hop le.");
            }
            switch (loai) {
                case 1 -> ds[i] = new TamGiac(nhapDiem("A"), nhapDiem("B"), nhapDiem("C"));
                case 2 -> {
                    System.out.print("Do dai 2 canh: ");
                    double d = sc.nextDouble();
                    double r = sc.nextDouble();
                    ds[i] = new ChuNhat(d, r);
                }
                default -> {
                    Diem o = nhapDiem("tam O");
                    System.out.print("Ban kinh: ");
                    ds[i] = new HinhTron(o, sc.nextDouble());
                }
            }
        }

        System.out.println("\nDanh sach hinh:");
        for (Hinh h : ds) {
            System.out.println(String.format(Locale.US, "%-10s Chu vi: %8.3f   Dien tich: %8.3f",
                    h.getClass().getSimpleName(), h.chuVi(), h.dienTich()));
        }
    }
}
