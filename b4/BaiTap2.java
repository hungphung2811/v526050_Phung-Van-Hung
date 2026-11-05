package b4;

import java.util.ArrayList;
import java.util.List;

public class BaiTap2 {
    public static void main(String[] args) {
        List<Diem2D> ds = new ArrayList<>();
        ds.add(new Diem2D(0, 0));
        ds.add(new Diem2D(3, 4));
        ds.add(new Diem2D(6, 8));
        ds.add(new Diem3D(1, 2, 2));
        ds.add(new Diem3D(4, 6, 2));
        ds.add(new Diem3D(4, 6, 5));

        double tong2D = 0;
        double tong3D = 0;
        Diem2D truoc2D = null;
        Diem3D truoc3D = null;
        for (Diem2D d : ds) {
            if (d instanceof Diem3D) {
                Diem3D d3 = (Diem3D) d;
                if (truoc3D != null) {
                    tong3D += truoc3D.khoangCach(d3);
                }
                truoc3D = d3;
            } else {
                if (truoc2D != null) {
                    tong2D += truoc2D.khoangCach(d);
                }
                truoc2D = d;
            }
        }
        System.out.println("Tong khoang cach cac diem 2D (lien tiep): " + tong2D);
        System.out.println("Tong khoang cach cac diem 3D (lien tiep): " + tong3D);

        int n = ds.size();
        for (int i = 0; i < n; i++) {
            ds.add(ds.get(i).diemDoiXung());
        }
        System.out.println("Danh sach sau khi them cac diem doi xung:");
        for (Diem2D d : ds) {
            System.out.println(d.getClass().getSimpleName() + " " + d);
        }
    }
}
