package Exception;

public class Throws2Demo {
    void Add() throws ArithmeticException
    {
        int a=45,b=45,c;
        c = a+b;
        System.out.print("\nThe result is : " + c);
    }
     public static void main(String[] args)
    {
    	 Throws2Demo ex = new Throws2Demo();
         try
        {
           ex.Add();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }
        System.out.print("\nprogram terminated");
    }
}

