import java.util.*;

class duck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sq = s.nextInt();

        int temp = sq;
        boolean isDuck = false;

        while (temp > 0) {
            if (temp % 10 == 0) {
                isDuck = true;
                break;
            }
            temp /= 10;
        }

        if (sq == 0 || isDuck)
            System.out.println("Duck Number");
        else
            System.out.println("Not a Duck Number");
    }
}
