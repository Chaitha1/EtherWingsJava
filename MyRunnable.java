package javaPackage;

public class MyRunnable implements Runnable {
	    public void run() {
	        for (int i = 0; i < 5; i++) {
	            System.out.println(Thread.currentThread().getId() + " Value: " + i);
	            try {
	                Thread.sleep(500); // Sleep for 500 milliseconds
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        MyRunnable myRunnable = new MyRunnable();
	        Thread t1 = new Thread(myRunnable);
	        Thread t2 = new Thread(myRunnable);
	        
	        t1.start();
	        t2.start();
	    }
	}

