import java.util.Scanner;
public class evenoddarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int n =s.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        if(even!=0 && odd!=0){
            System.out.println("Mixed");
        }
        else if(even==0){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}