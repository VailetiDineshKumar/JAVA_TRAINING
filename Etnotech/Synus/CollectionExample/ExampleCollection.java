package Synus.CollectionExample;
import java.util.*;
public class ExampleCollection {
    public static void main(String[] args) {
        // Example of using an ArrayList
       System.out.println("Set programs - HashSet , TreeSet , LinkedHashSet");
       
       Set<Integer> RollNo = new HashSet<>();
       RollNo.add(1);
       RollNo.add(2);   
       RollNo.add(3);
       System.out.println("This is for Set ");
       System.out.println("==============HashSet==============");
       HashSet<Integer> hashset = new HashSet<>();
       hashset.add(101);
       hashset.add(102);
       hashset.add(103);
        System.out.println("HashSet is for maintaining unique elements and does not maintain any order.");
        System.out.println(hashset.contains(103));
        System.out.println("The hashset numbers are: " + hashset);
        System.out.println("The size of the hashset is: " + hashset.size());
        System.out.println("==============TreeSet==============");
        TreeSet<Integer> treeset = new TreeSet<>();
        for(int num: hashset) {
            treeset.add(num+100);
        }
        System.out.println("TreeSet is for maintaining unique elements and sorts them in natural order.");
        System.out.println(treeset.contains(202));
        System.out.println("The treeset numbers are: " + treeset);
        System.out.println("The size of the treeset is: " + treeset.size());
        LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
        linkedhashset.add(301); 
        linkedhashset.add(302);
        linkedhashset.add(303);
        System.out.println("LinkedHashSet is for maintaining unique elements and preserves the insertion order.");
        System.out.println(linkedhashset.contains(302));
        System.out.println("The linkedhashset numbers are: " + linkedhashset);
        System.out.println("The size of the linkedhashset is: " + linkedhashset.size());
        NavigableSet<Integer> navigableset = new TreeSet<>(linkedhashset);
        System.out.println("NavigableSet is an interface that extends SortedSet and provides navigation methods for traversing the set in both directions.");
        System.out.println("The navigableset numbers are: " + navigableset);
         
    }
}
