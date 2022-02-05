package TryCatchException;

public class ExceptionDemoTryCatch {  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=10;   
        }  
            
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("Can't Divisible by 10");  
    }  
      
}  