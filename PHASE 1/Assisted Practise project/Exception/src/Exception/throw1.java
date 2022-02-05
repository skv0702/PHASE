package Exception;

public class throw1 
{
    public static void main(String[] args)
    {

        int a=10,b=0,c;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                c = a / b;
                System.out.print("The result is : " + c);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }

        System.out.print("\nprogram get terminated");
    }
}

