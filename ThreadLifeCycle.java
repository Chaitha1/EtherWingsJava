package javaPackage;

public class ThreadLifeCycle extends Thread {
	    public void run() {
	        System.out.println(Thread.currentThread().getName() + " is in state: " + Thread.currentThread().getState());
	        
	        try {
	            // Thread enters Timed Waiting state
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        synchronized (this) {
	            // Thread enters Blocked state
	            System.out.println(Thread.currentThread().getName() + " is in state: " + Thread.currentThread().getState());
	            
	            try {// Thread will be terminated directly
	                // Thread enters Waiting state
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        System.out.println(Thread.currentThread().getName() + " is in state: " + Thread.currentThread().getState());
	    }

	    public static void main(String[] args) {
	        ThreadLifeCycle t1 = new ThreadLifeCycle();
	        ThreadLifeCycle t2 = new ThreadLifeCycle();
	        
	        // Thread enters New state
	        System.out.println(t1.getName() + " is in state: " + t1.getState());
	        System.out.println(t2.getName() + " is in state: " + t2.getState());

	        // Start the thread - Thread enters Runnable state
	        t1.start();
	        t2.start();
	        
	        // Main thread waits to ensure the child threads have started
	        try {
	            Thread.sleep(200);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        synchronized (t1) {
	            // Notify t1 to exit Waiting state
	            t1.notify();
	        }

	        synchronized (t2) {
	            // Notify t2 to exit Waiting state
	            t2.notify();
	        }

	        // Main thread waits for child threads to complete
	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Threads are in Terminated state
	        System.out.println(t1.getName() + " is in state: " + t1.getState());
	        System.out.println(t2.getName() + " is in state: " + t2.getState());
	    }
	}

