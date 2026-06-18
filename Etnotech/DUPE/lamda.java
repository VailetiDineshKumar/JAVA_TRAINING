package DUPE;
import java.util.*;
interface Addable{
    int add(int a,int b);
    
}
public class lamda {
    public static void main(String[] args) {
        Addable add1=(a,b)->(a+b);
        System.out.println(add1.add(10,20));
    }
}
