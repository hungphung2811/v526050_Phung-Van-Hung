package b2;

import java.util.Arrays;
import java.util.Scanner;

public class HoVaTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine().trim();
        if (hoTen.isEmpty()) {
            System.out.println("Ho ten rong");
            return;
        }
        String[] parts = hoTen.split("\\s+");
        String ten = parts[parts.length - 1];
        String ho = String.join(" ", Arrays.copyOf(parts, parts.length - 1));
        System.out.println("Ho: \"" + ho + "\"");
        System.out.println("Ten: \"" + ten + "\"");
    }
}
