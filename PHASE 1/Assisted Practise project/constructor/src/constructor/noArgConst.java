package constructor;

public class noArgConst {

	  int i;

	 
	  private noArgConst() {
	    i = 5;
	    System.out.println("Constructor is called");
	  }

	  public static void main(String[] args) {

	  
		  noArgConst obj = new noArgConst();
	    System.out.println("Value of i: " + obj.i);
	  }
	}
