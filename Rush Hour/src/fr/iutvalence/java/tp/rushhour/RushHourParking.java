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
	
	
	/**
	 * @param x horizontal position axis
	 * @param y vertical position axis
	 * @return true if the position (x,y) is empty, false is it's not.
	 * @throws OutOfRangeException if we ask for a position out of the parking range
	 */
	public boolean isEmpty(Position position) throws OutOfRangeException
	{
		if (position.getX()>6 || position.getY()>6) throw new OutOfRangeException();
		
		for(Vehicle vehicle:vehicles)
		 if (vehicle.isOn(position)) return false;
				
		return true;
	}
	

	//TODO VOIR LE PROBLEME DU NOMBRE DE VEHICLE + LE TABLEAU


	
}
