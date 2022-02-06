package OopsImplementation;

class Inheritacne1 {
    public void print_java()
    {
        System.out.println("java");
    }
}
 
class Inheritance2 extends Inheritacne1 {
    public void print_Simplilearn() 
    {
    	System.out.println("Simplilearn"); 
    }
}

public class Inheritance 
{
    public static void main(String[] args)
    {
    	Inheritance2 inherit = new Inheritance2();
    	inherit.print_java();
    	inherit.print_Simplilearn();
    	inherit.print_java();
    }
}
