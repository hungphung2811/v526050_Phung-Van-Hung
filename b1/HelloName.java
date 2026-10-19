package b1;

public class HelloName {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Cach dung: java HelloName <name>");
            return;
        }
        System.out.println("Hello " + String.join(" ", args));
    }
}
