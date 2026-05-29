import java.util.*;
class switchop{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        String s1 = s.next();
        s1=s1.toUpperCase();
        switch(s1){
            case "AND":
                System.out.println(a&b);
                break;
            case "OR":
                System.out.println(a|b);
                break;
            case "XOR":
                System.out.println(a^b);
                break;
            case "NAND":
                System.out.println((~(a&b)));
                break;
            case "NOR":
                System.out.println((~(a|b)));
                break;
            case "XNOR":
                System.out.println((~(a^b)));
                break;
            default:
                System.out.println("Enter valid operator");
                break;
        }
    }
}