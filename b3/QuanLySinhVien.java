package b3;

import java.util.Locale;
import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Nhap so sinh vien: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        Student[] ds = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("--- Sinh vien " + (i + 1) + " ---");
            System.out.print("Ho ten: ");
            String ten = sc.nextLine().trim();
            System.out.print("Diem toan: ");
            float toan = sc.nextFloat();
            System.out.print("Diem ly: ");
            float ly = sc.nextFloat();
            System.out.print("Diem hoa: ");
            float hoa = sc.nextFloat();
            sc.nextLine();
            ds[i] = new Student(ten, toan, ly, hoa);
        }

        System.out.println("\nDanh sach sinh vien:");
        for (Student s : ds) {
            System.out.println(s);
        }

        System.out.println("\nSinh vien co diem trung binh > 5:");
        int dem = 0;
        for (Student s : ds) {
            if (s.diemTrungBinh() > 5) {
                System.out.println(s);
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("(khong co)");
        }
    }
}
