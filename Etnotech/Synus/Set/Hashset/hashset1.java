package Synus.Set.Hashset;

import java.util.*;

public class hashset1 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("my");
        set.add("name");
        set.remove("my");
        set.add("nnnnnnny");
        System.out.println(set); // Output: [Hello, World, nnnnnnny]
    }
}
