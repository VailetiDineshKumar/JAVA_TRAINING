import java.util.*;
class diagonalsum{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int r=s.nextInt();
        int c = s.nextInt();
        int arr[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<r;i++){
            sum+=arr[i][r-1-i];   
        }
        System.out.println(sum);
    }
}