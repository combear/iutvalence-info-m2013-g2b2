package fr.iutvalence.java.tp.rushhour;

public class Main
{

	/**
	 * Point d'entrée de l'application Rush Hour
	 * @param args
	 */
	public static void main(String[] args)
	{
		RushHourParking parking = new RushHourParking();
		RushHourGame game = new RushHourGame(parking);
	}

}
