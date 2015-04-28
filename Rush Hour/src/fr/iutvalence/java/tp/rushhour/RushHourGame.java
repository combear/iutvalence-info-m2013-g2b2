package fr.iutvalence.java.tp.rushhour;

/**
 * Rush Hour game
 * @author A. Combe, C. Jondet
 *
 */
public class RushHourGame
{
	/**
	 * parking where all vehicle are going to be added
	 */
	private RushHourParking parking;
	/**
	 * number of car in the game
	 */
	int numberOfCar;
	/**
	 * Array containing all the vehicle
	 */
	Vehicle[] vehicle;
	/**
	 * The car we need to free to win the game
	 */
	Vehicle vehicleToFree;


	/**
	 * Create a game of RushHour
	 * @param parking : game's parking
	 */
	public RushHourGame(RushHourParking parking)
	{
		 this.parking = parking;
		 this.vehicle = parking.getVehicle();
		 this.vehicleToFree = parking.getVehicleToFree();
		  
	}
	
	
	/**launch a RushHour's game*/
	public void play()
	{
		
		
	}
	
	//TODO 1 TABLEAU DE VOITURE, DONT DANS CE TABLEAU, NOTRE VOITURE A SORTIR
}
