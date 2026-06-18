package DUPE;
import java.util.*;
public class p7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int element=s.nextInt();
        int position=s.nextInt();
        int[] arr1 = new int[n+1];
        for(int i=0;i<n+1;i++){
            if(i<position){
                arr1[i]=arr[i];
            }
            else if(i==position){
                arr1[i]=element;
            }
            else{
                arr1[i]=arr[i-1];
            }
        }
        for(int i=0;i<n+1;i++){
            System.out.println(arr1[i]);
        }
    }
}
