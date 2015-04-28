package fr.iutvalence.java.tp.rushhour;

/**
 * The application RushHour
 * @author A. Combe, C. Jondet
 *
 */
public class Main
{

	/**
	 * Application's main: creates a new game and plays it
	 * @param args command-line arguments (unused)
	 */
	public static void main(String[] args)
	{
		RushHourParking parking = new RushHourParking(6);
		RushHourGame game = new RushHourGame(parking);
	}

}
