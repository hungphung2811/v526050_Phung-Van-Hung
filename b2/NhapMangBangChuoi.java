package b2;

import java.util.Scanner;

public class NhapMangBangChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cac so cach nhau boi dau cach: ");
        String line = sc.nextLine().trim();
        int soPhanTu = 0;
        long tong = 0;
        if (!line.isEmpty()) {
            for (String s : line.split("\\s+")) {
                tong += Integer.parseInt(s);
                soPhanTu++;
            }
        }
        System.out.println("So phan tu: " + soPhanTu + "; Tong: " + tong);
    }
}
