package b2;

import java.util.Scanner;

public class MangMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n (n > 0): ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("n phai lon hon 0");
            return;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            max = Math.max(max, sc.nextInt());
        }
        System.out.println("Phan tu lon nhat: " + max);
    }
}
