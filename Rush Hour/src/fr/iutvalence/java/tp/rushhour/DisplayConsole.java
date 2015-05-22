package fr.iutvalence.java.tp.rushhour;

/**
 * @author A. Combe, C. Jondet
 *
 */
public class DisplayConsole {


public String createGrid() {
        String grid = "";
        grid += "   1    2    3    4    5    6 \n  ";

        for (int compteurEtoile = 0; compteurEtoile < 29; compteurEtoile++) {
                grid += "*";
        }
                grid += "\n";
        for (int compteurVertical =1; compteurVertical <7; compteurVertical++){
        	
        	grid+= compteurVertical;
                for (int compteurHorizontal=1; compteurHorizontal<7;compteurHorizontal++)
                {
                	grid += " |  |";                	
                }
                grid+= "\n";
        
              
        }
        grid += "\n";
        
        return grid;
}

}
