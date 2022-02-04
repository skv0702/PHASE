package accessmodifier;


public class Protected1 {
    
    protected void display() {
        System.out.println("PROTECTED");
    }
}

class Protect extends Protected1 {
    public static void main(String[] args) {

        
    	Protect dog = new Protect();
         
        dog.display();
    }
}