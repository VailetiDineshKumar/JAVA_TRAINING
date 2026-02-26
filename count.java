import java.util.Scanner;
import java.util.Arrays;
public class count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
            count =0;
        }
    }
}