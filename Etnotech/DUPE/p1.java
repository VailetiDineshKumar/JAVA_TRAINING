package DUPE;
import java.util.*;
public class p1{
    static  int OperationsBinaryString(String str)
    {
        int result= str.charAt(0)-'0';
        for(int i=1; i<str.length();i+=2){
            int value=str.charAt(i+1)-'0';
            char ch=str.charAt(i);
            if(ch=='A'){
                result&=value;
            }
            if(ch=='B'){
                result|=value;
            }
            if(ch=='C'){
                result^=value;
            }
            
        }
        return result;
    }
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary string:");
        String str= sc.nextLine();
        int result=OperationsBinaryString(str);
        System.out.println(result);
    }
}