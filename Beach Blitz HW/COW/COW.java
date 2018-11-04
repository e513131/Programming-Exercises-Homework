import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class COW {
	public static void main(String args[]) throws IOException {
		
		Scanner s = new Scanner(new File("cow.in"));
		FileWriter fw = new FileWriter("cow.out");

		s.nextInt();
		String str = s.nextLine();
		str = s.nextLine();


		long output = cowCount2(str);
		
		fw.write(Long.toString(output));

		fw.flush();
		s.close();
		fw.close();

//		String str = "CCOOWW";
//		System.out.println(cowCount2(str));
	}
	
	static long cowCount(String cowcow) {
		long part=0;
		long total=0;

		for(int i=0; i<cowcow.length(); i++) {
			if(cowcow.charAt(i)=='C') {
				for(int j=i; j<cowcow.length(); j++) {
					if(cowcow.charAt(j)=='O') {
						part=lookFor('W', j, cowcow);
						total+=part;
					}
				}
			}	
		}
		return total;
	}
	
	
	static long lookFor(char letter, int idx, String cows) {
		long count=0;
		for(int i=idx; i<cows.length(); i++) {
			if(cows.charAt(i)==letter)
				count++;
		}
		return count;
	}
	
	static long cowCount2(String cowcow) {
		long c =0;
		long o=0;
		long w=0;
		
		for(int i=0; i<cowcow.length(); i++) {
			if(cowcow.charAt(i)=='C')
				c++;
			else if(cowcow.charAt(i)=='O')
				o+=c;
			else if(cowcow.charAt(i)=='W')
				w+=o;
		}
		return w;
	}
}