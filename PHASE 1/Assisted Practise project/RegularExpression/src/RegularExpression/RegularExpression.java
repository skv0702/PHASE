package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {

		String pattern = "[A-Z]";
		String check = "Welcome To SimpliLearn";
		Pattern pat1 = Pattern.compile(pattern);
		Matcher mat1 = pat1.matcher(check);
		
		while (mat1.find())
	      	System.out.println( check.substring( mat1.start(),  mat1.end() ) );
		}
	}



