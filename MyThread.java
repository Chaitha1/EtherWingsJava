package javaPackage;

public class MyThread extends Thread {
	    public void run() {
	        for (int i = 0; i < 5; i++) {
	            System.out.println(Thread.currentThread().getId() + " Value: " + i);
	            try {
	                Thread.sleep(100); // Sleep for 500 milliseconds
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        MyThread t1 = new MyThread();
	       MyThread t2 = new MyThread();
	        
	        t1.start();
	       t2.start();
	    }
	}

