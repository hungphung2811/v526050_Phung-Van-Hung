package b2;

import java.util.Arrays;

public class TongHaiMang {
    static void inMangTong(int[] a, int[] b) {
        int len = Math.max(a.length, b.length);
        int[] tong = new int[len];
        for (int i = 0; i < len; i++) {
            int x = i < a.length ? a[i] : 0;
            int y = i < b.length ? b[i] : 0;
            tong[i] = x + y;
        }
        System.out.println(Arrays.toString(a) + " + " + Arrays.toString(b)
                + " = " + Arrays.toString(tong));
    }

    public static void main(String[] args) {
        inMangTong(new int[] {1, 2, 3}, new int[] {4, 5, 6});
        inMangTong(new int[] {1, 2, 3, 4, 5}, new int[] {10, 20});
        inMangTong(new int[] {7}, new int[] {1, 1, 1});
    }
}
