package Synus.Debugging;
import java.util.concurrent.locks.*;

public class AdvancedDeadlock {
    private final ReentrantLock lockA = new ReentrantLock();
    private final ReentrantLock lockB = new ReentrantLock();

    public void method1() {
        lockA.lock();
        try {
            Thread.sleep(10);
            lockA.unlock(); 
        } catch (Exception e) {
            System.out.println("Exception"+e.getMessage());
        }
    }

    public void method2() {
        lockB.lock();
        try {
            Thread.sleep(10);
            lockB.unlock(); 
        } catch (Exception e) {
            System.out.println("Exception"+e.getMessage());
        }
    }

    public static void main(String[] args) {
        AdvancedDeadlock obj = new AdvancedDeadlock();
        new Thread(obj::method1).start();
        new Thread(obj::method2).start();
    }
}


