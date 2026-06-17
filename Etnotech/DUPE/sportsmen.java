package DUPE;

import java.util.*;

public class sportsmen{
    static String Name;
    static int age;
    static String Game;
    sportsmen(String Name, int age,String Game){
        sportsmen.Name=Name;
        sportsmen.age=age;
        sportsmen.Game=Game;
        display();
    }
    static void display(){
        System.out.println(Name+age+Game);

    }
    public static void main(String[] args) {
     sportsmen s = new sportsmen("DK", 20, "chess");   
    }
}