package p1;
//import java.util.*;
public class Source2 {
	public String handleException(Activity a) {
		String string;
		try {
		if (a.string1.equals(null) || a.string2.equals(null))
		throw new NullPointerException("Null values found");
		if (!(a.operator.equals("+")) && !(a.operator.equals("-")))
		throw new Exception("Default exception"+a.operator);
		}
		catch (NullPointerException ex) {
		string= "Null values found";
		System.out.println(string);
		return string;
		}
		catch (Exception e) {
		string= "Default Exception"+a.operator;
		System.out.println(string);
		return string;
		}
		return "No Exception Found";
		}
		public String doOperation(Activity a){
		//String string = a.operator;
		String result= new String();
		switch (a.operator) {
		case "+":{result=a.string1.concat(a.string2);
		System.out.println(result);
		return result;
		}
		case "-":{ String regex=a.string2;
		result=a.string1.replaceAll(regex, "");
		System.out.println(result);
		return result;
		}
		}
		return result ;
		}
		public static void main(String args[] ) throws Exception {
		Source2 source2=new Source2();
		Activity activity = new Activity("Helloworld", "world", "+");
		source2.handleException(activity);
		source2.doOperation(activity);
		}
		}
