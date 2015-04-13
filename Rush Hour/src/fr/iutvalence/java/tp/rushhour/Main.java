package fr.iutvalence.java.tp.rushhour;

/**
 * The application RushHour
 * @author A. Combe, C. Jondet
 *
 */
public class Main
{

	/**
	 * Where the application start
	 * @param args
	 */
	public static void main(String[] args)
	{
		RushHourParking parking = new RushHourParking();
		RushHourGame game = new RushHourGame(parking);
	}

}
