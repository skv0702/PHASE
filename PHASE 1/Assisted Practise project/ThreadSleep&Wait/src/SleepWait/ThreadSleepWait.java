package SleepWait;

public class ThreadSleepWait {
	   
	private static Object LOCK = new Object();
	 
	public static void main(String[] args)
	  throws InterruptedException {
	  
	    Thread.sleep(1000);
	    System.out.println("thread" + Thread.currentThread().getName() +
	  	      "' is woken after sleeping for 1 second");
	  
	    synchronized (LOCK)
	    {
	        LOCK.wait(2000);
	       
	        System.out.println("object" + LOCK + "' is woken after" +
	          " waiting for 1 second");
	    }
	}
	}
