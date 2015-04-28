package fr.iutvalence.java.tp.rushhour;

/**
 * Rush Hour game. The aim of the game is to release a vehicle which is jammed on a parking.
 * http://en.wikipedia.org/wiki/Rush_Hour_%28board_game%29
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


	/**
	 * Create a parking which is a set oh vehicle including the one to release
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
	
}
