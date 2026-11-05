package b4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BaiTapNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so nhan vien n (n > 0): ");
            n = Integer.parseInt(sc.nextLine().trim());
        } while (n <= 0);

        List<Nhanvien> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Nhan vien thu " + i + ":");
            Nhanvien nv = new Nhanvien();
            nv.nhap(sc);
            ds.add(nv);
        }

        Nhanvien max = ds.get(0);
        for (Nhanvien nv : ds) {
            if (nv.getSnct() > max.getSnct()) {
                max = nv;
            }
        }
        System.out.println("Nhan vien co so nam cong tac nhieu nhat:");
        max.xuat();
        System.out.println();

        ds.sort(Comparator.comparingDouble(Nhanvien::tienLuong).reversed());
        System.out.println("Danh sach nhan vien theo luong giam dan:");
        for (Nhanvien nv : ds) {
            nv.xuat();
            System.out.println();
        }
        sc.close();
    }
}
