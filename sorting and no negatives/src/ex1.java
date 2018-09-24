import java.io.Console;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello world");
		
		int[] arr = {-1,4,4,1,7,4,8,3,-3,5,-17,38};
		
		print(arr);
		
		//print(removeNeg(arr));
		
		//print(sort(arr));	
		 
		//System.out.print(numberOfPositiveItems(arr));
		print(sort(removeNeg(arr)));
	}
	
	static int numberOfPositiveItems(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=0) {
				count++;
			}
		}	
		return count;
	}
	
	static int[] removeNeg(int[] arr) {
		
		int[] arr2 = new int[numberOfPositiveItems(arr)];
		// copy from arr to arr2 positive numbers;
		int j = 0;
		for(int k=0; k<arr.length; k++) {
			if(arr[k]>0) {
				arr2[j]=arr[k];
				j++;
			}
			
		}
		return arr2;
	}
	
	static int[] sort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int j = i;
			while(j>0 && arr[j]<arr[j-1]) {
				int extra = arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=extra;
				j--;
			}
		}
		return arr;
	}
	
	static void print(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
