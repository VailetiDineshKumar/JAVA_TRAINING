package DUPE;import java.util.*;


class Main{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            if(i!=n){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            for(int j=n-1;j>i;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        else{
            for(int j=1;j<=n*2-1;j++){
                System.out.print("* ");
            }
        }
        }
    }
}