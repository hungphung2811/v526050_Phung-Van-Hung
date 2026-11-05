package b4;

import java.util.Scanner;

public class Nhanvien extends Nguoi {
    private static final double LCB = 1_500_000;
    private static final double PHU_CAP_MOI_NAM = 200_000;

    private int snct;
    private double hsl;

    public Nhanvien() {
    }

    public Nhanvien(String hoTen, int tuoi, int snct, double hsl) {
        super(hoTen, tuoi);
        this.snct = snct;
        this.hsl = hsl;
    }

    public int getSnct() {
        return snct;
    }

    public void setSnct(int snct) {
        this.snct = snct;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public double tienLuong() {
        return LCB * hsl + PHU_CAP_MOI_NAM * snct;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("So nam cong tac: ");
        snct = Integer.parseInt(sc.nextLine().trim());
        System.out.print("He so luong: ");
        hsl = Double.parseDouble(sc.nextLine().trim());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" | SNCT: %d | HSL: %.2f | Tien luong: %,.0f", snct, hsl, tienLuong());
    }
}
