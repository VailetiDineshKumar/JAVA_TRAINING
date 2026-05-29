import java.util.*;
class lcm{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int lcm = a>b ? a : b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }
}