package fr.iutvalence.java.tp.rushhour;


/**
 *  Parking representation containing a list of cars previously initialized .
 * @author A. Combe, C. Jondet
 *
 */
public class RushHourParking
{
	
	
	/**
	 * vehicles which are jammed on the parking
	 */
	private Vehicle[] vehicles;
	private Vehicle vehicleToFree;
	
	
	
	/**
	 * Constructor initialisating, creating and filling an object
	 */
	public RushHourParking()
	{
		this.vehicles= new Vehicle[6];
		this.vehicleToFree=this.addCars();
		
	}

	
	

	/**
	 * Create and place all vehicles in the array
	 * @return the vehicle to free
	 */
	private Vehicle addCars()
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
		

	
}
