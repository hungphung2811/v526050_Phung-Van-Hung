package b3;

public class Student {
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public Student(String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float diemTrungBinh() {
        return (diemToan + diemLy + diemHoa) / 3;
    }

    @Override
    public String toString() {
        return String.format(java.util.Locale.US, "%-20s Toan: %.1f  Ly: %.1f  Hoa: %.1f  TB: %.2f",
                hoTen, diemToan, diemLy, diemHoa, diemTrungBinh());
    }
}
