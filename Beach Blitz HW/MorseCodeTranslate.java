import java.util.Dictionary;
import java.util.Hashtable;

public class MorseCodeTranslate {
	public static void main (String args[]) {
		Dictionary<String, String> dict = new Hashtable<String, String>();

		String[] englishAlph = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","/"," "};
		String[] morseAlph = {".-", "-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-..-","--.."," ", "/"};

		for(int i=0; i< englishAlph.length; i++) {
			dict.put(englishAlph[i], morseAlph[i]);
			dict.put(morseAlph[i], englishAlph[i]);
		}

		String morse = ".- -... -.-. / -.. .";
		//toEnglish(morse, dict);
		toMorse("dfa df a", dict);
		//System.out.println(dict.get("a"));
	}
	
	static void toEnglish(String morseStuff, Dictionary<String, String> dict) {
		String[] splitted=morseStuff.split(" ");
		
		for(int i=0; i<splitted.length; i++) {
			System.out.print(dict.get(splitted[i]));
		}
		System.out.println();
	}
	
	static void toMorse(String englishStuff, Dictionary<String, String> dict) {
		
		for(int i=0; i<englishStuff.length(); i++) {
			System.out.print(dict.get(Character.toString(englishStuff.charAt(i)))+" ");
		}
		System.out.println();
	}

}
