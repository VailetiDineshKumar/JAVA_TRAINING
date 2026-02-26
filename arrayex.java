import java.util.*;
class arrayex{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int sum=0;
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
            sum+=arr[i];
        }
        System.out.println("Sum: "+sum);
        System.out.println("Even Count: "+even);
        System.out.println("Odd count: "+odd);
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}