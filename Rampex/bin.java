import java.util.*;
class bin{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int bit4=(int)((n>>4)&1);
        int bit16=(int)((n>>16)&1);
        int bit32=(int)((n>>32)&1);
        System.out.println("Bit 4: "+bit4);
        System.out.println("Bit 16: "+bit16);
        System.out.println("Bit 32: "+bit32);
    }
}