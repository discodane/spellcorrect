package spell;

import spell.Trie.Node;


public class Trieimp implements Trie {

public void add(String word)
{}
	
	/**
	 * Searches the trie for the specified word
	 * 
	 * @param word The word being searched for
	 * 
	 * @return A reference to the trie node that represents the word,
	 * 			or null if the word is not in the trie
	 */
	public Node find(String word)
	{
		return Node j;
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
	public interface Node {
	
		/**
		 * Returns the frequency count for the word represented by the node
		 * 
		 * @return The frequency count for the word represented by the node
		 */
		public int getValue();
	}

}
