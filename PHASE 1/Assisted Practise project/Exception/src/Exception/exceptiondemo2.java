package Exception;


class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 
public class exceptiondemo2 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("Cought"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Exception"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
