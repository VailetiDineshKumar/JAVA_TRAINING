import java.util.*;
class quadrant {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(a==0 && b==0)
        {
            System.out.println("Origin");
        }
        else if(a==0){
            System.out.println("On Y-axis");
        }
        else if(b==0)
        {
            System.out.println("On X-axis");
        }
        else if(a>0 && b>0){
            System.out.println("Quadrant I");
        }
        else if (a<0 && b>0){
            System.out.println("Quadrant II");
        }
        else if(a<0 && b<0)
        {
            System.out.println("Quadrant III");
        }
        else{
            System.out.println("Quadrant IV");
        }
    }
}