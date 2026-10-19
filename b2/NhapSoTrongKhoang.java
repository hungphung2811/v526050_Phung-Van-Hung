package b2;

import java.util.Scanner;

public class NhapSoTrongKhoang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Nhap 1 so nguyen trong khoang [0, 100]: ");
            n = sc.nextInt();
            if (n >= 0 && n <= 100) {
                break;
            }
            System.out.println("So ngoai khoang, moi nhap lai.");
        }
        System.out.println("So da nhap: " + n);
    }
}
