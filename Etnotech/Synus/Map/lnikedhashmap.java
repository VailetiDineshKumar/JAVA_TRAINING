package Synus.Map;

import java.util.*;

public class lnikedhashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> arr = new HashMap<>();
        arr.put("One",1);
        arr.put("Two",2);
        arr.put("Three",3);
        System.out.println(arr);
        LinkedHashMap<String,Integer> arr1 = new LinkedHashMap<>(arr);
        arr1.put("Even",4);
        System.out.println(arr1);
    }
}
