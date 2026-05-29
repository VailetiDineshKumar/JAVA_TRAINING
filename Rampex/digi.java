import java.util.*;
class digi{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i;
        for( i=0;n!=0;i++){
            n/=10;
        }
        System.out.println(i);
    }
}