import java.util.*;
class rps{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String s1= s.next();
        String s2 = s.next();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.equals(s2)){
            System.out.println("Draw");
        }
        else if((s1.equals("rock")&& s2.equals("scissors"))||(s1.equals("paper")&&s2.equals("rock")) || (s1.equals("scissors") && s2.equals("paper"))){
            System.out.println("Player 1 Wins");
        }
        else{
            System.out.println("Player 2 Wins");
        }
    }

}