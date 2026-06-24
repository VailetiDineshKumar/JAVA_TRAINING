package Synus.Debugging;
import java.util.*;

public class ThreadLocalLeak {
    private static final ThreadLocal<List<byte[]>> threadLocal = new ThreadLocal<>();
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try{
                threadLocal.set(new ArrayList<>());
                for (int j = 0; j < 10000; j++) {
                    threadLocal.get().add(new byte[1024]);              
                 }
                }
                finally{
                    threadLocal.remove();
                }

            }).start();
        }
    }
}
