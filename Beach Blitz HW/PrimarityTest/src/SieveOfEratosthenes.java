
public class SieveOfEratosthenes {
	public static void main(String[] args) {
		int max = 513;
		
		findPrimes(max);
	}
	
	static void findPrimes (int max) {
		if(max%2==0 && max!=2)
			max--;
		boolean[] prime = new boolean[max/2];
		
		for(int i=3; i*i<=max; i+=2) {
			if(prime[i]==false) {
				for(int j=(int)(1.5*i-1.5); j<=(max-3)/2; j+=i) {
					prime[j]=true;
				}
				
			}
		}

		
		if(max<=2) {
			System.out.println("2, ");
		}
		else {
			System.out.print("2, ");
			
			for(int i=0; i<prime.length; i++) {
				
				if(prime[i]==false) {
					System.out.print((2*i+3) + ", ");
				}	
			}
		}
	
	}
	
}

/*Write a program that interactively (use Scanner) generates and prints the array of all prime numbers less than some value
 *  using the Sieve of Eratosthenes algorithm.
 *  When the user enters a number via scanner, the program prints out the array.
 *  Bonus: optimize the program to run faster in whatever way you can!
*/
