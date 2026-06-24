package Synus.Debugging;
import java.lang.reflect.*;

class Box<T> {
    T value;
    public void set(T value) { /* ... */
        this.value=value;
     }
    public T get(){ 
        System.out.println(value);
        return null;
     }
}

public class GenericsDebug {
    public static void main(String[] args) throws Exception {
        Box<Integer> intBox = new Box<>();
        Box<Integer> rawBox = intBox;
        rawBox.set(3); 
        rawBox.get();
        Method m = Box.class.getMethod("set", Object.class);
        m.invoke(intBox, "String"); 
    }
}
