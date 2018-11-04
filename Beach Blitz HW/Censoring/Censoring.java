import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Censoring {
	public static void main (String[] args) throws IOException {
		Scanner s = new Scanner(new File("censor.in"));
		FileWriter fw = new FileWriter("censor.out");

		String str1= s.nextLine();
		String str2 = s.nextLine();
//		String str1 = "aabcabcbcac";
//		String str2 = "abca";

		String output = remove(str1, str2);
//		System.out.println(output);
		
		fw.write(output);

		fw.flush();
		s.close();
		fw.close();
		
	}
	
	static String remove(String original, String takeOut) {
		while(original.indexOf(takeOut)>0) {
			original=original.replaceFirst(takeOut, "");
		}
		return original;
	}
	
}
