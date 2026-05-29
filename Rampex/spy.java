import java.util.*;
class spy{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sq=s.nextInt();

        int sum=0;
        int p=1;
        while(sq!=0){
            sum+=sq%10;
            p*=sq%10;
            sq/=10;
        }
        if(sum==p){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not a Spy Number");
        }
    }
}