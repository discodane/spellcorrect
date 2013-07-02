package spell;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import spell.SpellCorrector.NoSimilarWordFoundException;

/**
 * A simple main class for running the spelling corrector
 */
public class Main {
	
	/**
	 * Give the dictionary file name as the first argument and the word to correct
	 * as the second argument.
	 */
	public static void main(String[] args) throws FileNotFoundException, NoSimilarWordFoundException, IOException {
		
		String dictionaryFileName = args[0];
		String inputWord = args[1];
		File file=new File(dictionaryFileName);
		Scanner di=new Scanner(file);
		Trieimp sir=new Trieimp(di);
		
		/**
		 * Create an instance of your corrector here
		 */
		//SpellCorrector corrector = null;
		
		//corrector.useDictionary(dictionaryFileName);
		//String suggestion = corrector.suggestSimilarWord(inputWord);
		
		//System.out.println("Suggestion is: " + suggestion);
	}

}
