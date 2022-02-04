package diffreturntype;

public class diffreturntype { 
 
	  int m1()
	  { 
	   System.out.println("m1 method"); 
	
	      return 20; 
	} 

	  float m2() 
	  { 
	    System.out.println("m2 method"); 
	      return 20.5f; 
	  } 
	  static char m3()
	  { 
	    System.out.println("m3 method"); 
	     return 'd'; 
	  }
	 	  
	public static void main(String[] args)
	 { 
	
		diffreturntype s = new diffreturntype();
	 
 
	      int x = s.m1(); 

	    System.out.println("Return value of m1()= " +x); 

	    float y = s.m2();
	    System.out.println("Return value of m2()= " +y); 


	    char ch = diffreturntype.m3(); 
	    System.out.println("Return value of m3()= " +ch); 
	  } 
	 }