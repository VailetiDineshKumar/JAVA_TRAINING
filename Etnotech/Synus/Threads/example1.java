package Synus.Threads;

public class example1 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is cooking");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new example1());
        t.run();   
    }
}
