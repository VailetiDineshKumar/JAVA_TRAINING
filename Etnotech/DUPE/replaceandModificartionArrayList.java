import java.util.ArrayList;
public class replaceandModificartionArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("car");
        list.add("bike");
        list.add("bus");

        System.out.println("ArrayList: " + list);
        list.set(1, "train"); // Replacing 'bike' with 'train'
        System.out.println("After replacing 'bike' with 'train': " + list);
        list.add(1, "plane"); // Adding 'plane' at index 1
        System.out.println("After adding 'plane' at index 1: " + list);
        list.replaceAll(item -> item.equals("bus") ? "ship" : item); // Replacing 'bus' with 'ship'
        System.out.println("After replacing 'bus' with 'ship': " + list);
        list.replaceAll(item -> "replaced_" + item); // Replacing each element with a modified version
        System.out.println("After replacing all elements: " + list);
    }
}
