package Method;

public class Method {

    int sum = 0;
 
    public int addTwoInt(int a, int b)
    {
 
        sum = a + b;
 

        return sum;
    }
}
class method {
 
   
    public static void main(String[] args)
    {
    	Method add = new Method();
        int s = add.addTwoInt(1, 2);
 
   
        System.out.println("Ans is  :"
                           + s);
    }
}