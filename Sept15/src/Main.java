
public class Main {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3, 4};
		int[] b = new int[] {5, 6, 7, 8};
		
//		int[] vector = sum(a, b);
//		print(vector);
		
//		int[] newVector =oneEach(a,b);
//		print(newVector);
//		
//		System.out.println(dotProduct(a,b));
		
		int[] twoArrs =twoArrsBam(a,b);
		print2(twoArrs);
	}
	
	static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
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
		
	static int[] sum(int[] a, int[] b) {
		int[] hello = new int[a.length];
		for(int i = 0; i<a.length; i++) {
			hello[i]=a[i]+b[i];
		}
		return hello;
	}
	
	static int[] oneEach(int[] a, int[] b) {
		int[]newOne=new int[a.length];
		for(int i = 0; i<a.length; i++) {
			if(i%2==0) {
				newOne[i]=a[i];
			}
			else {
				newOne[i]=b[i];
			}
		}
		return newOne;
	}
	
	static int dotProduct(int[]a, int[]b) {
		int[] dot=new int[a.length];
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			dot[i]=a[i]*b[i];
			sum=dot[i]+sum;
		}
	return sum;	
	}
	
	static int[] twoArrsBam (int[]a, int[]b) {
		int[]newArr=new int[a.length*2];
		for(int i=0; i<a.length*2; i++) {
			if(i>=0 && i<=a.length-1) {
				newArr[i]=a[i];
				newArr[i+a.length]=b[i];
			}
		}
		return newArr;
	}
}
