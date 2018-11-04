import java.util.Scanner;

public class PowerSets {
	public static void main (String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		for(;;) {
//			String input = scan.nextLine();
//			System.out.println(input);
//		}
		
		int[] arr = {1, 2, 3};
		
		powerSets(arr, arr.length-1,"");
	}
	
	static void powerSets(int[]numbers, int idx, String str){
		if(idx==-1) {
			System.out.println(str);
		}
		else {
			powerSets(numbers,idx-1,str);
			powerSets(numbers,idx-1,str+numbers[idx]);
		}
	}
}
