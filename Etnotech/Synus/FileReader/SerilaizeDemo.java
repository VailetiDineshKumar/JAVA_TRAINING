package Synus.FileReader;
import java.util.*;

import javax.naming.event.ObjectChangeListener;

import java.io.*;

class Student implements Serializable{

    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class SerilaizeDemo {
    public static void main(String[] args) throws Exception {
        Student s = new Student(101,"DK" );
        FileOutputStream fos = new FileOutputStream("Student.ser");
        System.out.println(fos);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println(oos);
    }
}
