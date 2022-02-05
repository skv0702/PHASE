package String;

public class StringClass {

	public static void main(String[] args) {
		System.out.println ("All methods");
		



		String s1="Computer";
		String s2="Computer";
		System.out.println(s1.compareTo(s2));
		
		
		String s4="";
		System.out.println(s4.isEmpty());
				
		
		String sl=new String("Simplilearn");
		System.out.println(sl.length());

	
		String sub=new String("Hello World");
		System.out.println(sub.substring(2));

		
		String s6="ABCDE";
		String replace=s2.replace('d', 'l');
		System.out.println(replace);

		
		String x="java Simplilearn";
		String y="JaVa sImPlIeArN";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Simplilearn Java Classes");
		s.append("Thanks for Joining");
		System.out.println(s);

		//insert method
		s.insert(0, 'w');
		System.out.println(s);
		
		
		//toLowerCase
				String s5="Hello";
				System.out.println(s1.toLowerCase());

		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);

		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Implimenting String builder");
		StringBuilder sb1=new StringBuilder("Simplilearn");
		sb1.append("Classes");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Java"));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
		 StringBuffer sbr = new StringBuffer(str);
		 sbr.reverse();   
		    System.out.println(sbr);
		    StringBuilder sbl = new StringBuilder(str);
		    sbl.append("DEF");
		    System.out.println(sbl);
          
                     		
	}
}
