package accessmodifier;

 public class Public1 {
   
    public void display() {
        System.out.println("PUBLIC");
       
    }
}

 class Main {
    public static void main( String[] args ) {
       
    	Public1 a = new Public1();

    
        a.display();
    }
}