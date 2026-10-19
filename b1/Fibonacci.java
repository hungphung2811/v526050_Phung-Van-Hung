package b1;

public class Fibonacci {
    public static void main(String[] args) {
        long a = 0, b = 1;
        for (int i = 0; i < 20; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
