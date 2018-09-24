
//find the index of the first value that is greater than or equal to the value being searched
public class Main {
	public static void main (String[] args){
		double[] a = new double[] {1.3, 2.5, 3.7, 4.9, 5.2};
		double min = -2.3;
		double max = 3.9;
		
		print(a);
		System.out.println(countingBetween(a,min,max)+" numbers between "+ min+ " and "+max);
	}

	static int countingBetween(double arr[], double min, double max) {
		int count=0; 
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<max && arr[i]>min) 
				count++;
			if(arr[i]>max)
				break;
		}
		return count;
	}
	
	static void print (double[] arr) {
		int count = 0;
		System.out.print("[");
		while(count<arr.length-1) {
			System.out.print(arr[count]+" ");
			count++;
		}
		System.out.println(arr[count]+ "]");
	}

}

//import java.util.Arrays;
//
//public class Main {
//	public static void main(String[] args) {
//		double[] arr = new double[100000000];
//		Arrays.fill(arr, 100);
//		arr[0] = 7;
//		arr[1] = 8;
//		arr[2] = 9;
//		
//		System.out.println("Old method:\tNew method:");
//		for(int i = 0; i < 10; i++) {
//			long l = System.currentTimeMillis();
//			oldCountingBetween(arr, 1, 10);
//			System.out.print((System.currentTimeMillis() - l) + "ms\t\t");
//			
//			l = System.currentTimeMillis();
//			countingBetween(arr, 1, 10);
//			System.out.println((System.currentTimeMillis() - l) + "ms");
//		}
//	}
//	
//	static int countingBetween(double arr[], double min, double max) {
//		int count = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] < max && arr[i] > min)
//				count++;
//			if(arr[i] > max)
//				break;
//		}
//		return count;
//	}
//	
//	static int oldCountingBetween(double arr[], double min, double max) {
//		int count = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] < max && arr[i] > min)
//				count++;
//		}
//		return count;
//	}
//}