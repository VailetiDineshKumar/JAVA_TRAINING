import java.util.*;
class neon{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int sq = n*n;
        int sum=0;
        while(sq!=0){
            sum+=sq%10;
            sq/=10;
        }
        if(sum==n){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not a Neon Number");
        }
    }
}