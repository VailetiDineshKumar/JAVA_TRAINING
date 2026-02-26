import java.util.*;
class fact{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p=1;
        if(n==0 || n==1){
            System.out.println(1);
        }
        else{
        for(int i=1;i<=n;i++)
        {
            p*=i;
        }
        System.out.println(p);
        }
}
}