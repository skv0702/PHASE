package Inner.Class;

public class InnerClass  {

	 private String msg="This is a "; 
	 
	 class InCl{  
	  void InnerClass(){System.out.println(msg+", Inner Class");}  
	 }  


	public static void main(String[] args) {

		InnerClass obj=new InnerClass();
		InnerClass.InCl ic=obj.new InCl();  
		ic.InnerClass();  
	}
}

