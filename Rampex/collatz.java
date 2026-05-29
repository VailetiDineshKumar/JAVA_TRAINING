import java.util.*;
class collatz{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count=1;
        while(n!=1){
            System.out.println("Step: "+count);
            if(n%2==0)
            {
                n/=2;
                System.out.println(n);
            }
            else{
                n=3*n+1;
                System.out.println(n);
            }
            count++;
        }
        System.out.println("No.of steps: "+(count-1));
    }
}