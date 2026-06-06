import java.util.*;
class fibonacci {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
              int a = 0, b = 1, f=0, c;
            while(a<=n) { 
                c = a + b;
                if(n==a){
                    f=1;
                    break;   
                }
                a = b;
                b = c;
            }
            if(f==1){
                System.out.println("Fibonacci");
            }
            else{
                System.out.println("Not a Fibonacci");
            }
        }
    }
}


