package Method;

public class Callmethod {

int val=5;

int operation(int val) {
	val =val*10/100;
	return(val);
}

public static void main(String args[]) {
	Callmethod d = new Callmethod();
	System.out.println("result showing in before "+d.val);
	d.operation(50);
	System.out.println("result showing after "+d.val);
	}
}
