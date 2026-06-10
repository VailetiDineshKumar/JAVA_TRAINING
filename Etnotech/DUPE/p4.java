import java.util.ArrayList;

class p4{
    public static void main(String[] args){
        ArrayList<String>  cars= new ArrayList<String>();
        cars.add("aaa");
        cars.add("bbb");
        cars.add("ccc");

        cars.add(0,"000");//insert a element in arraylist like adding at the index
        cars.set(0,"111");//insert a element at index by removing the present element
        cars.remove(0);//removing the element using index
        cars.remove("aaa");//removing the element using data
        System.out.println(cars);
    }
}