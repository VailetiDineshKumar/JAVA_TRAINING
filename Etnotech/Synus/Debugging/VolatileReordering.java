package Synus.Debugging;
import java.util.*;
public class VolatileReordering {
    private static  boolean ready = false;
    private static volatile int number = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            while (!ready) Thread.yield();
            System.out.println(number); 
        }).start();

        number = 42;
        ready = true; 
    }
}
