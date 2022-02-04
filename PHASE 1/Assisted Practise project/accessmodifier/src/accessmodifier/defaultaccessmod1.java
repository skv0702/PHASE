package accessmodifier;

class defaultaccessmod
{ 
  void display() 
     { 
         System.out.println("DEFAULT ACESS"); 
     } 
} 
public class defaultaccessmod1 {

	public static void main(String[] args) {
		//default
		System.out.println("MODIFIER");
		defaultaccessmod obj = new defaultaccessmod(); 		  
        obj.display(); 

	}
}
