package Inner.Class;

public class InnerClass2 {

private String innerclass="2nd Demo of inner class  ";

 void display(){  
	 class IC{  
		 void msg(){
			 System.out.println(innerclass);
		 }  
  }  
  
  IC l=new IC();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	InnerClass2  ob=new InnerClass2 ();  
	ob.display();  
	}
}



