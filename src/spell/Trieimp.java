package spell;

import java.util.Scanner;

public class Trieimp implements Trie {
	public Trieimp(Scanner di) {
		while(di.hasNext())
		{
			String current=di.next();
			current.toLowerCase();
			add(current);
		}
		// TODO Auto-generated constructor stub
	}

	/**
	 * Adds the specified word to the trie (if necessary) and increments the word's frequency count
	 * 
	 * @param word The word being added to the trie
	 */

public void add(String word)
{
	
}
	
	/**
	 * Searches the trie for the specified word
	 * 
	 * @param word The word being searched for
	 * 
	 * @return A reference to the trie node that represents the word,
	 * 			or null if the word is not in the trie
	 */
	public spell.Trie.Node find(String word)
	{
		spell.Trie.Node j= new nodeimp();
		return j;
	}
	
	/**
	 * Returns the number of unique words in the trie
	 * 
	 * @return The number of unique words in the trie
	 */
	public int getWordCount()
	{
		return 0;
	}
	
	/**
	 * Returns the number of nodes in the trie
	 * 
	 * @return The number of nodes in the trie
	 */
	public int getNodeCount()
	{
		return 0;
	}
	
	/**
	 * The toString specification is as follows:
	 * For each word, in alphabetical order:
	 * <word> <count>\n
	 */
	@Override
	public String toString()
	{
		return "";
	}
	
	@Override
	public int hashCode()
	{
		return 0;
	}
	
	@Override
	public boolean equals(Object o)
	{
		return false;
	}

	/**
	 * Your trie node class should implement the Trie.Node interface
	 */
	public Node root=(Node) new nodeimp();
	
	public interface Node {
	
		/**
		 * Returns the frequency count for the word represented by the node
		 * 
		 * @return The frequency count for the word represented by the node
		 */
		public int getValue();
	}

}
