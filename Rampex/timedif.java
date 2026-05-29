import java.util.*;
class timedif{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t1 = s.nextLine();
        String t2 = s.nextLine();
        String[] time1 = t1.split(":");
        String[] time2 = t2.split(":");
        int h1 = Integer.parseInt(time1[0]);
        int m1 = Integer.parseInt(time1[1]);
        int s1 = Integer.parseInt(time1[2]);
        int h2 = Integer.parseInt(time2[0]);
        int m2 = Integer.parseInt(time2[1]);
        int s2 = Integer.parseInt(time2[2]);
        int totalSeconds1 = h1 * 3600 + m1 * 60 + s1;
        int totalSeconds2 = h2 * 3600 + m2 * 60 + s2;
        int diff = Math.abs(totalSeconds2 - totalSeconds1);
        System.out.println(diff);
    }
}