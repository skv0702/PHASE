package String;

public class StringTOBuffBuilder  {
	public static void main(String[] args)
{
   
    String str = "ABC";

  
    StringBuffer sbr = new StringBuffer(str);


    sbr.reverse();

    
    System.out.println(sbr);

    
    StringBuilder sbl = new StringBuilder(str);


    sbl.append("DEF");

    System.out.println(sbl);
}
}
