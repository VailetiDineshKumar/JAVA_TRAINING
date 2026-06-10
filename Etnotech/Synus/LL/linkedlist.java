package Synus.LL;
import java.util.LinkedList;
import java.util.List;
import java.util.*;
public class linkedlist {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            list.add(s.next());
        }
        System.out.println("LinkedList: " + list);
        list.remove("bike");
        System.out.println("After removing 'bike': " + list);
        System.out.println("Size of LinkedList: " + list.size());
        list.addLast("last_element");
        list.addFirst("First");
        list.add(1,"second");
        list.set(2,"third");
        System.out.println(list);
    }
}
