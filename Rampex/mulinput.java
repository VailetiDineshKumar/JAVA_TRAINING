import java.util.*;
class mulinput{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String[] p = s1.split(",");
        String pn=p[0];
        double pr=Double.parseDouble(p[1]);
        int q = Integer.parseInt(p[2]);
        System.out.printf("%-20s %12.2f %8d", pn, pr, q);
    }
}