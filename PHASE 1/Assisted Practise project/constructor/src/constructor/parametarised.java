package constructor;

public class parametarised {

	  String languages;

	  
	  parametarised(String lang) {
	    languages = lang;
	    System.out.println(languages + " Programming Language");
	  }

	  public static void main(String[] args) {

	
		  parametarised obj1 = new parametarised("Java");
		  parametarised obj2 = new parametarised("Python");
		  parametarised obj3 = new parametarised("C");
	  }
	}