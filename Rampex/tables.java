import java.util.*;
class tables{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i =0;i<=b;i++)
        {
            System.out.printf("%d * %d = %d\n",a,i,a*i);
        }
    }
}