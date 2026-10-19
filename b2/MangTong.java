package b2;

import java.util.Arrays;
import java.util.Scanner;

public class MangTong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int tong = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
            tong += a[i];
        }
        System.out.println("Mang: " + Arrays.toString(a));
        System.out.println("Tong: " + tong);
    }
}
