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
	
	
	// TODO fix comment: telle how is the parking once created
	/**
	 *
	 * Constructor initialisating, creating and filling an object*/
	public RushHourParking()
	{
		// TODO (think about it) where the vehicule come from?
		this.vehicles= new Vehicle[6];
		this.vehicleToRelease=this.addVehicles();
		
	}

	// TODO fix comment: not so technical
	/**
	 * Create and place all vehicles in the array
	 * @return the vehicle to free
	 */
	private Vehicle addVehicles()
	{
		Vehicle vehicleToFree = new Vehicle(TypeOfCar.CAR, Vehicle.HORIZONTAL);
		this.vehicles[0]= vehicleToFree;
		this.vehicles[1]= new Vehicle(TypeOfCar.TRUCK, Vehicle.VERTICAL);
		this.vehicles[2]= new Vehicle(TypeOfCar.TRUCK, Vehicle.VERTICAL);
		this.vehicles[3]= new Vehicle(TypeOfCar.TRUCK, Vehicle.HORIZONTAL);
		this.vehicles[4]= new Vehicle(TypeOfCar.TRUCK, Vehicle.HORIZONTAL);
		this.vehicles[5]= new Vehicle(TypeOfCar.CAR, Vehicle.VERTICAL);
		this.vehicles[6]= new Vehicle(TypeOfCar.CAR, Vehicle.VERTICAL);
		return vehicleToFree;
	}




	/**
	 * Used to get the Array of vehicle of a parking
	 * @return an array of vehicle
	 */
	public Vehicle[] getVehicle() {
		return this.vehicles;
	}




	/**
	 * Used to get the vehicle to free of a parking
	 * @return the vehicle to free
	 */
	public Vehicle getVehicleToFree() {
		return this.vehicleToRelease;
	}
		

	
}
