import java.util.*;
class switchtrain{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        n = n % 8;
        switch(n){
            case 1: case 4:
                System.out.println("Lower");
                break;
            case 2: case 5:
                System.out.println("Middle");
                break;
            case 3: case 6:
                System.out.println("Upper");
                break;
            case 7:
                System.out.println("Side Lower");
                break;
            case 0:
                System.out.println("Side Upper");
        }
    }
}