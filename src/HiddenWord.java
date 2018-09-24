
public class HiddenWord {
	String Word;
	
	public HiddenWord(String Word) {
		this.Word=Word;
	}
	
	public String getHint(String Guess) {
		char[] original = Word.toCharArray();
		char[] guess = Guess.toCharArray();
		char[] hint = new char[Word.length()];
		
		for(int i=0; i<Word.length(); i++) {
			if(original[i]==guess[i])
				hint[i]=original[i];
			else {
				int j=0;
				while(j<Word.length() && original[j] != guess[i]) 
					j++;
				if (j>Word.length())
					hint[i] = '*';
				else
					hint[i] = '+';
			}

		}
		return String.valueOf(hint);
	}
}