package b2;

import java.util.Scanner;

public class TimChiSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        System.out.print("Nhap so can tim: ");
        int x = sc.nextInt();

        boolean timThay = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.println("Chi so: " + i);
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay " + x + " trong mang");
        }
    }
}
