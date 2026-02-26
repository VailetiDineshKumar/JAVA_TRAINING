import java.util.*;
class st{
    public static void main(String[] args) {
        // String s = "Hello";
        // StringBuilder sb = new StringBuilder(s);
        // // sb.insert(1,"hi");
        // // System.out.println(sb.length());
        // sb.delete(1,3);
        // System.out.println(sb);
        Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // StringBuilder sb = new StringBuilder();
        // for(int i=1;i<=n;i++){
        //     sb.append(i);
        // }
        // System.out.println(sb);
        String str = s.nextLine();
        // for(int i=str.length()-1;i>=0;i--){
        //     System.out.print(str.charAt(i));
        // }
        // String vowels = "aeiouAEIOU";
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(vowels.indexOf(ch)==-1){
        //         System.out.print(ch);
        //     }
        // }
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(vowels.indexOf(ch)==-1){
        //         sb.append(ch);
        //     }
        // }
        // System.out.println(sb);
        StringBuilder sb = new StringBuilder(str.toLowerCase());
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(i%2==0){
                char upperCh = Character.toUpperCase(ch);
                sb.setCharAt(i, upperCh);
            }
        }
        System.out.println(sb);
    }
}