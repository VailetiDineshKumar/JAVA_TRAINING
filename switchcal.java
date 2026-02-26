import java.util.*;
class switchcal{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String s1=s.nextLine();
    String[] arr=s1.split(" ");
    int a=Integer.parseInt(arr[0]);
    int b=Integer.parseInt(arr[2]);
    String op=arr[1];
        switch(op){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if(b!=0){
                    System.out.println(a/b);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Select operator from +, -, *, /");
        }
    }
}