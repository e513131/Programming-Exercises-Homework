import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] table = makeTable(11, 11);
		System.out.println('[');
		for(int[] arr : table)
			System.out.println(Arrays.toString(arr));
		System.out.println(']');
	}

	/*
	Challenge 1:
	
	Implement the method makeTable, so that it returns a 2d array that's a multiplication table with r rows and c columns,
	but every row is an even number and every column is odd.

	For example, makeTable(3, 4) should return:
  
  	    1   3   5   7
  	   {
	2  {2,  6,  10, 14},
	4  {4,  12, 20, 28},
	6  {6,  18, 30, 42}
	   }
	
	Note: The 1, 3, 5, 7 and 2, 4, 6 just show you what the product in each element should be, and are not part of the array.
	
	*/
	
	public static int[][] makeTable(int r, int c) {
		int[][] products = new int [r][c];
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<c; j++) {
				products[i][j]=((i+1)*2)*(j*2+1);
			}
		}
		return products;
	}
}