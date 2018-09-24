
import java.math.BigInteger;

public class Fibonacci {
	public static void main(String[] args) {
		//System.out.println(findFib(17418)); 
		System.out.println(findFib(3473));
	}
	
	static BigInteger findFib (int n) {
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);
		
		for(int i=2; i<=n; i++) {
			c=a.add(b);
			a=b;
			b=c;
		}
		return c;
//		if(n<=1) 
//			return n;
//		return findFib(n-1) + findFib(n-2);
	}
}

