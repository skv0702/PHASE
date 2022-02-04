package constructor;

public class constructor {
	  private String name;


	  constructor() {
	    System.out.println("Constructor Called:");
	    name = "my learning";
	  }

	  public static void main(String[] args) {

	    
		  constructor obj = new constructor();
	    System.out.println("The name is " + obj.name);
	  }
	}