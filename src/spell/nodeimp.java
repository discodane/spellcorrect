package spell;

public class nodeimp implements Trie.Node {

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return count;
	}
	int count;
	String value;
	nodeimp[] alpha=new nodeimp[26];
	public nodeimp()
	{
		int i=0;
		alpha[i].value="a";
		i++;
		alpha[i].value="b";
		i++;
		alpha[i].value="c";
		i++;
		alpha[i].value="d";
		i++;
		alpha[i].value="e";
		i++;
		alpha[i].value="f";
		i++;
		alpha[i].value="g";
		i++;
		alpha[i].value="h";
		i++;
		alpha[i].value="i";
		i++;
		alpha[i].value="j";
		i++;
		alpha[i].value="k";
		i++;
		alpha[i].value="l";
		i++;
		alpha[i].value="m";
		i++;
		alpha[i].value="n";
		i++;
		alpha[i].value="o";
		i++;
		alpha[i].value="p";
		i++;
		alpha[i].value="q";
		i++;
		alpha[i].value="r";
		i++;
		alpha[i].value="s";
		i++;
		alpha[i].value="t";
		i++;
		alpha[i].value="u";
		i++;
		alpha[i].value="v";
		i++;
		alpha[i].value="w";
		i++;
		alpha[i].value="x";
		i++;
		alpha[i].value="y";
		i++;
		alpha[i].value="z";
		i++;
		
	}

}
