package Synus.LL;
import java.util.*;
public class ex {
    public static void main(String[] args) {
        // Queue<Integer> list = new LinkedList<>();
        // list.add(10);
        // list.add(20);
        // list.add(20);
        // list.add(40);
        // list.add(50);
        // TreeSet<Integer> set = new TreeSet<>(list);
        // list.clear();
        // System.out.println(list);
        // list.addAll(set);
        // System.out.println(list);
        Queue<Integer> queue = new LinkedList<>();
        for(int i=101;i<=110;i++){
            queue.add(i);
        }
        System.out.println(queue);
        ArrayList<Integer> list = new ArrayList<>(queue);
        System.out.println(list);
        for(int i=201;i<=205;i++){
            queue.add(i);
        }
        System.out.println(queue);
        queue.removeIf(n-> !list.contains(n));
        System.out.println(queue);
    }
}
