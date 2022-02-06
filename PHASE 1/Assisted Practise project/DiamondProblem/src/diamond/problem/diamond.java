package diamond.problem;

interface diamond0  
{  
public default void display()   
{  
System.out.println("diamond 0");  
}  
}  
interface diamond1  
{  
public default void display()   
{  
System.out.println("diamond 1");  
}  
}  
public class diamond implements diamond0, diamond1 
{  
public void display()   
{  
	diamond0.super.display();  
	diamond1.super.display();  
}  
public static void main(String args[])   
{  
	diamond obj = new diamond();  
obj.display();  
}  
}  
