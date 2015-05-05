package fr.iutvalence.java.tp.rushhour;

/**
 * The application RushHour
 * @author A. Combe, C. Jondet
 *
 */
public class Main
{
	/**
	 * Application's main: creates a new game and plays it
	 * @param args command-line arguments (unused)
	 */
	public static void main(String[] args)
	{
		Vehicle[] vehicles = new Vehicle[7];
		Vehicle vehicleToFree = new Vehicle(VehicleType.CAR, Vehicle.HORIZONTAL);
		vehicles[0]= vehicleToFree;
		vehicles[1]= new Vehicle(VehicleType.TRUCK, Vehicle.VERTICAL);
		vehicles[2]= new Vehicle(VehicleType.TRUCK, Vehicle.VERTICAL);
		vehicles[3]= new Vehicle(VehicleType.TRUCK, Vehicle.HORIZONTAL);
		vehicles[4]= new Vehicle(VehicleType.TRUCK, Vehicle.HORIZONTAL);
		vehicles[5]= new Vehicle(VehicleType.CAR, Vehicle.VERTICAL);
		vehicles[6]= new Vehicle(VehicleType.CAR, Vehicle.VERTICAL);
		
		RushHourParking parking = new RushHourParking(vehicles, vehicleToFree);
		RushHourGame game = new RushHourGame(parking);
	}

}
