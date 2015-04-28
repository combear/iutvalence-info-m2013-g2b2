package fr.iutvalence.java.tp.rushhour;

/**
 * The application RushHour
 * @author A. Combe, C. Jondet
 *
 */
public class Main
{

	/**
	 * Application's mais: creates a new game and plys it
	 * @param args command-line arguments (unused)
	 */
	public static void main(String[] args)
	{
		RushHourParking parking = new RushHourParking();
		RushHourGame game = new RushHourGame(parking);
	}

}
