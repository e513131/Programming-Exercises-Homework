import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class markov {
	static Scanner in = new Scanner(System.in);
	static Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	
	public static void main(String args[]) {
		for(;;) {
			String[] input = in.nextLine().split(" ");
			for(int i=0; i<input.length; i++) {
				if(!map.containsKey(input[i]))
					map.put(input[i], new ArrayList<String>());
				if(i!=input.length-1)
					map.get(input[i]).add(input[i+1]);
				else
					map.get(input[i]).add(null);
			}
			map.forEach((s, l) -> System.out.println(s + "\t" + l));
			
		}
	}
}
