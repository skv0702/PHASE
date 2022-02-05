package Thread.runnable;

public class ThreadRunnable implements Runnable  
{    
public void run()  
{    
System.out.println("Now the thread is running ...");    
}    
    
// main method  
public static void main(String argvs[])  
{   
// creating an object   
Runnable r1 = new ThreadRunnable();   
    
Thread th1 = new Thread(r1, "My new thread");    
   
th1.start();   
    
String str = th1.getName();  
System.out.println(str);  
}    
}    
