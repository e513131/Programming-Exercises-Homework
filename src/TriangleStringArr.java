import java.util.Arrays;

public class TriangleStringArr {
	
	public static String[] spellNumber = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

	public static void main(String[] args) {
		int triangle = 0;
		makeTriangle(triangle);
	}
	
	static void makeTriangle (int number) {
		if(number==0)
			System.out.println("ZERO");
		else if(number<=9) {
			theTriangles(number);
		}
		else {
			System.out.println(separate(number));
		}
	}
	
	static void theTriangles (int number) {
		//String[] stringArr= new String[(number*(number+1)/2)];
		for(int i=1; i<=number; i++) { 
			for(int j=1; j<=i; j++) { 
				System.out.print(spellNumber[j]+" ");
			}
			System.out.println();
		}
	}
	
	static String separate(int number) {
		int digit = 0;
		String findLength=Integer.toString(number);
		int[] arr = new int[findLength.length()];
		int idx = arr.length-1;
		while(number>0) {
			digit=number%10;
			//System.out.println(spellNumber[digit]);
			arr[idx--] = digit;
			number=number/10;
		}
		
		String combined = "";
		for(int i = 0; i<arr.length; i++) {
			combined+=spellNumber[arr[i]];
		}
		return combined;
	}
	
}
