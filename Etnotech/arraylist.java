import java.util.ArrayList;
public class arraylist {
public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("car");
        list.add("bike");
        list.add("bus");

        System.out.println("ArrayList: " + list);
        list.remove("bike");
        System.out.println("After removing 'bike': " + list);
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Does the ArrayList contain 'car'? " + list.contains("car"));
        System.out.println("first index element: " + list.get(0));
    }
}
