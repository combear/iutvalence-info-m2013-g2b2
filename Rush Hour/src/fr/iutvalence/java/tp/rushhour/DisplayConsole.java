package fr.iutvalence.java.tp.rushhour;

/**
 * @author A. Combe, C. Jondet
 *
 */
public class DisplayConsole
{

	public String createGrid()
	{
		String grid="";
		grid+="1  2  3  4  5  6\n";
		
		for(int compteurEtoile=0; compteurEtoile<26; compteurEtoile++)
		{
			grid+="*";
		}
		grid+="\n";
		return grid;
	}
	
	
	
	
	
}
