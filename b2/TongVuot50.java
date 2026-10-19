package b2;

import java.util.Scanner;

public class TongVuot50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        while (true) {
            System.out.print("Nhap 1 so nguyen: ");
            tong += sc.nextInt();
            if (tong > 50) {
                break;
            }
        }
        System.out.println("Tong cac so da nhap: " + tong);
    }
}
