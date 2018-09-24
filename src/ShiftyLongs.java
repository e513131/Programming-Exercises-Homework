import java.util.Arrays;

public class ShiftyLongs {
	public static void main(String[] args) {
		long[] evenArr = new long[] {1L,2L,3L,4L,5L,6L};
		int howMuchShifty = 3;
		System.out.println(Arrays.toString(evenArr));
		System.out.println(Arrays.toString(shifty(evenArr, howMuchShifty)));
	}
	
	static long[] shifty(long[] arr, int amount) {
		long [] shifted = new long[arr.length];
		for(int i = 0; i<arr.length; i++) {
			shifted[i] = arr[(i+amount)%arr.length];
		}
		return shifted;
	}
	
}
