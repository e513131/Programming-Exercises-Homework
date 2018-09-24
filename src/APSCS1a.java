import java.util.Arrays;

public class APSCS1a  { //and 1b and 1c
	public static void main(String[] args) {
//		int[] arr = new int[] {1, 2, 3, 4, 5};
//		System.out.println(sumAll(arr));
		
		int[][] arr = new int[][] {{1,2,3,4},{1,2,3,4}};
		System.out.println(Arrays.toString(rowSums(arr)));
		
		System.out.println(isDiverse(arr));
	}
	
	static int sumAll(int[] arr) {
		int sum = 0; 
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	static int[] rowSums(int[][] arr2) {
		int[] sumArr = new int[arr2.length];
		
		for(int i=0; i<arr2.length; i++){
			int sum = 0;
			for(int j=0; j<arr2[0].length; j++) {
				sum+=arr2[i][j];
				sumArr[i]=sum;
			}
		}
		return sumArr;
	}
	
	static boolean isDiverse(int[][] mat) {
		
		int[] sums = rowSums(mat);
		
		for(int i=0; i<sums.length; i++) {
			for(int j=i+1; j<sums.length; j++) {
				if(sums[i]==sums[j])
					return false;
			}
		}
		return true;
	}
}
