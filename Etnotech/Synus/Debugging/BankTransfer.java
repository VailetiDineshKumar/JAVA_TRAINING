package Synus.Debugging;
import java.util.*;
public class BankTransfer {
	static final Object lockA = new Object(); 
	static final Object lockB = new Object(); 
 
	
	static void main(String[] args) throws InterruptedException {
    	synchronized (lockA) {
        	Thread.sleep(50);       	
        	synchronized (lockB) {  	
            	System.out.println("A→B done");
        	}
    	}
	}
}

