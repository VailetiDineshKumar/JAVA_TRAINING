import java.util.*;
class terGrade{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        char grade=(n>=90)?'A':(
            (n>=80)?'B':(
                (n>=70)?'C':(
                    (n>=60)?'D':(
                        (n>=50)?'E':'F'))));
        System.out.println(grade);
    }
}