package b2;

import java.util.Calendar;
import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int namSinh;
        while (true) {
            System.out.print("Nhap nam sinh [1900, 2010]: ");
            namSinh = sc.nextInt();
            if (namSinh >= 1900 && namSinh <= 2010) {
                break;
            }
            System.out.println("Nam sinh khong hop le, moi nhap lai.");
        }
        int namHienTai = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Tuoi: " + (namHienTai - namSinh));
    }
}
