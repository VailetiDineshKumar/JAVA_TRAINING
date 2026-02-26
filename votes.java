import java.util.*;
class votes{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a=0,b=0,c=0;
        while(true){
            System.out.println("Enter Your Age: ");
            int age=s.nextInt();
            if(age>=18){
                System.out.println("Elect Your Candidate:");
                System.out.println("1.X");
                System.out.println("2.Y");
                System.out.println("3.Z");
                int c1=s.nextInt();
                switch(c1){
                    case 1:
                        a++;
                        System.out.println("1(vote goes to Party X)");
                         System.out.println("----------------------");
                        break;
                    case 2:
                        b++;
                        System.out.println("2(vote goes to Party Y)");
                        System.out.println("----------------------");
                        break;
                    case 3:
                        c++;
                        System.out.println("3(vote goes to Party Z)");
                        System.out.println("----------------------");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        System.out.println("----------------------");
                }
            }
            else if(age==-1){
                break;
            }
            else{
                System.out.println("Not Eligilble for vote");
                System.out.println("----------------------");
            }
        }
    
        if(a>b && a>c){
            System.out.println("X Wins");
        }
        else if(b>c){
            System.out.println("Y Wins");
        }
        else{
            System.out.println("Z Wins");
        }
    }
}