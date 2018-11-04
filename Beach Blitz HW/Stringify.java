import java.util.Arrays;

public class Stringify {
	public static void main (String[] args) {
		char[] charArr = {'a', 's', 'd', 'f', 'i', 'n', 'g'};
		String str = "ping";
		
		stringify(charArr);
		arrayify(str);
		//System.out.println(str.substring(str.length()-3, str.length()));
	}
	
	static void stringify(char[] charArr) {
		StringBuilder str = new StringBuilder();
		
		if(charArr[charArr.length-1]=='g' && charArr[charArr.length-2]=='n' && charArr[charArr.length-3]=='i') {
			System.out.println("THERE IS AN 'ING'");
		}
		else {
			for(int i=0; i<charArr.length; i++) {
				str.append(charArr[i]);
			}
		}
		
		System.out.println(str);
	}
	
	static void arrayify (String str) {

		char[] arrayified = new char[str.length()];
		
		if(str.substring(str.length()-3, str.length()).equals("ing")) {
			System.out.println("THERE IS AN 'ING'");
		}
		else {
			
			for(int i=0; i<str.length(); i++) {
				arrayified[i]=str.charAt(i);
			}
			System.out.println(Arrays.toString(arrayified));
		}
	}
}
