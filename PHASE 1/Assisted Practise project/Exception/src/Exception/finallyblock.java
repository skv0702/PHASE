package Exception;

public class finallyblock 
{
    public static void main(String[] args)
    {
        int a=45,b=45,c=0;
        try
        {
            c = a + b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + c);
        }
    }
}

