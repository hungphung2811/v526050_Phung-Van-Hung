package b3;

import java.util.Locale;

public class HinhCoDinh {
    public static void main(String[] args) {
        Hinh[] ds = {
            new TamGiac(new Diem(0, 0), new Diem(4, 0), new Diem(0, 3)),
            new TamGiac(new Diem(1, 1), new Diem(5, 1), new Diem(3, 4)),
            new ChuNhat(3, 5),
            new ChuNhat(2.5, 4),
            new HinhTron(new Diem(0, 0), 1),
            new HinhTron(new Diem(2, 3), 2.5),
        };
        for (Hinh h : ds) {
            System.out.println(String.format(Locale.US, "%-10s Chu vi: %8.3f   Dien tich: %8.3f",
                    h.getClass().getSimpleName(), h.chuVi(), h.dienTich()));
        }
    }
}
