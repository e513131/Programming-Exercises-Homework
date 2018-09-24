
public class Main {
	public static void main(String[] args) {
//		int[] sortedArr = new int[] {1, 2, 3, 4, 3470, 9474, 10348};
//		int[] sortedArr = new int[] {1,3472,9827};
//		int[] sortedArr = new int[] {};
//		checkAdd(sortedArr);
//		System.out.print(checkAdd(sortedArr));
		
		int[] evenArr = new int[] {1,2,3,4,5,6};
//		print2(sumCombine(evenArr));
		
		print2(reverseArr(evenArr));
	}
	
	static void print2 (int[] arr) {
		int count = 0;
		System.out.print("[");
		while(count<arr.length-1) {
			System.out.print(arr[count]+" ");
			count++;
		}
		System.out.print(arr[count]+ "]");
	}
	
	static boolean checkAdd(int[] arr) {
		int i = 0;
		while(i<arr.length && arr[i]<3473) {
			for(int j=arr.length-1; j>i; j--) {
				if (arr[i]+arr[j]==3473)
					return true;
			}
			i++;
		}
		return false;
	}
	
	static int[] sumCombine(int[]arr) {
		int[] smallArr=new int[arr.length/2];
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) 
				smallArr[i/2]=arr[i]+arr[i+1];
		}
		return smallArr;
	}
	
	static int[] reverseArr(int[]arr) {
		int [] backwards = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			backwards[arr.length-1-i]=arr[i];
		}
		return backwards;
	}
	
}


// D: