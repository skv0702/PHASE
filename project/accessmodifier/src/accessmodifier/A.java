package accessmodifier;

public class A {

	
		   protected void display() 
		    { 
		        System.out.println("Access Modifier for the private"); 
		    } 
		} 

		class B extends A {}  
		class C extends B {}

		class Main{
		     public static void main(String args[]) 
		   {   
		       B obj = new B();     //create object of class B   
		       obj.display();       //access class A protected method using obj
		       C cObj = new C();    //create object of class C
		       cObj.display ();     //access class A protected method using cObj
		   }   
		}
