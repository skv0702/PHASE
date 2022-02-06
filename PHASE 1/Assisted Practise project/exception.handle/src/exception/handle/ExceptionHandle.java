package exception.handle;

class ExceptionHandle{
	   public static void main(String args[]){
		try{
			System.out.println("This will execute under try block");
			throw new Exception1("this block throw exception");
		}
		catch(Exception1 exp){
			System.out.println("This will excute catch block") ;
			System.out.println(exp) ;
		}
	   }
	}

class Exception1 extends Exception{
	   String str1;
	   Exception1(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("Exception Handled "+str1) ;
	   }
	}
	


