package fr.iutvalence.java.tp.rushhour;


/**
 *  This class represents the parking where a set of cars are jammed.
 *  
 * @author A. Combe, C. Jondet
 */
public class RushHourParking
{
	
	
	/**
	 * vehicles which are jammed on the parking
	 */
	private Vehicle[] vehicles;
	
	
	/**
	 * the vehicle to be released (already contained in vehicule's array)
	 */
	private Vehicle vehicleToRelease;
	
	
	
	/**
	 * Create a parking with a certain number of vehicles and the vehicle to release
	 * @param numberOfVehicles : total number of vehicles wanted in our parking
	 */
	public RushHourParking(Vehicle[] vehicles, Vehicle vehicleToRelease)
	{
		this.vehicles = vehicles;
		this.vehicleToRelease=vehicleToRelease;
		
	}

	

	//TODO VOIR LE PROBLEME DU NOMBRE DE VEHICLE + LE TABLEAU


	
}
