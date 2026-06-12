package Own;
import java.util.*;
public class IBM1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr1 =new int[n];
        for(int i =0 ;i<n;i++){
            arr1[i]= s.nextInt();
        }
        for(int i=0;i<n;i++){
            int sum=0;
            int temp=arr1[i];
            while(temp>0){
                sum=sum+temp%10;
                temp/=10;
            }
            arr1[i]=sum;
        }
        int max=0;
        for(int n1 :arr1){
            long freq = (int) Arrays.stream(arr1)
                  .filter(x -> x == n1)
                  .count();
            max= (int) Math.max(max,freq);
        }
       System.out.println(max);
    
    }
}
