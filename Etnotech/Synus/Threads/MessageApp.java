package Synus.Threads;

import java.io.IOException;

class messageSender extends Thread{
    messageSender(String name){
        super(name);
    }
    @Override
    public void run(){
        try{
            for(int i=0;i<2;i++){
                System.out.println("Thread "+i+" says hello to "+getName());
                Thread.sleep(1000);
            }
        }
     catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class MessageApp {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new messageSender("DK"));
        Thread t2 = new Thread(new messageSender("ABC"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        t2.start();
        System.out.println(t1.getState());
    }
}
