import java.util.Scanner;
class amstrong{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int sum = 0;
        int digits = 0;
        while(temp != 0){
            digits++;
            temp /= 10;
        }
        temp = n;
        while(temp != 0){
            int r = temp % 10;
            sum += Math.pow(r, digits);
            temp /= 10;
        }
        if(sum == n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}