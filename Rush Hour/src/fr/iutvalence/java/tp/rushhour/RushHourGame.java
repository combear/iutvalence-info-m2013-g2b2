package fr.iutvalence.java.tp.rushhour;

// TODO detail comment (link to game rules)
/**
 * Rush Hour game
 * @author A. Combe, C. Jondet
 *
 */
public class RushHourGame
{
	/**
	 * parking where all vehicles are jammed
	 */
	private RushHourParking parking;
	
	/**
	 * Vehicles jammed on the parking
	 */
	Vehicle[] vehicle;
	
	/**
	 * The vehicle to release
	 */
	Vehicle vehicleToRelease;


	// TODO fix comment (tell how is the game once created)
	/**
	 * Create a game of RushHour
	 * @param parking : game's parking
	 */
	public RushHourGame(RushHourParking parking)
	{
		 this.parking = parking;
		 this.vehicle = parking.getVehicle();
		 this.vehicleToRelease = parking.getVehicleToFree();	  
	}
	
	
	/**launch a RushHour's game*/
	public void play()
	{
		
		
	}
	
	//TODO 1 TABLEAU DE VOITURE, DONT DANS CE TABLEAU, NOTRE VOITURE A SORTIR
}
