import java.util.*;
class fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0, b = 1;
        if (n >= 1) {
            System.out.println(a);
        }
        if (n >= 2) {
            System.out.println(b);
        }
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}