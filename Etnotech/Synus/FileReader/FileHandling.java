package Synus.FileReader;
import java.io.*;
import java.util.*;

public class FileHandling{
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("C:\\Users\\vdkdi\\OneDrive\\Desktop\\Java\\Etnotech\\synus\\FileReader\\file.txt");
            int c = fr.read();
            System.out.println((char) c);
            c=fr.read();
            System.out.println(c);
            while(c!=-1){
                System.out.println((char) c);
                c=fr.read();
            }
            fr.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found"+e.getMessage());
        }
        catch(IOException e){
            System.out.println("IO Execption"+e.getMessage());
        }
    }
}