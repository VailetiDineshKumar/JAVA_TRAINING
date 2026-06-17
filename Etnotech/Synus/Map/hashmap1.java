package Synus.Map;
import java.util.*;
public class hashmap1 {
    public static void main(String[] args) {
        HashMap<String,String> hash = new HashMap<>();
        hash.putIfAbsent("tree","bluemoon lilly");
        hash.putIfAbsent("Bird", "Nightangel");
        hash.putIfAbsent("Animal", "Dragon");
        hash.putIfAbsent("Map", "Pandora");
        System.out.println(hash.get("tree"));
        hash.remove("tree");
        System.out.println(hash+" "+ hash.containsKey("tree")+" "+hash.containsValue("Dragon"));
        System.out.println(hash.values());
        System.out.println(hash.keySet());   
        for(Map.Entry<String,String> entry: hash.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
