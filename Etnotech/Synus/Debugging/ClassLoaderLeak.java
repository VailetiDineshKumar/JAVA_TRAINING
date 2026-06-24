package Synus.Debugging;
import java.net.URLClassLoader;
import java.util.*;
public class ClassLoaderLeak {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 50; i++) {
            ClassLoader loader = new URLClassLoader(new java.net.URL[] {new java.io.File(".").toURI().toURL()});
            Class<?> clazz = loader.loadClass("java.lang.String");   
            System.out.println(clazz);         
        }
    }
}



