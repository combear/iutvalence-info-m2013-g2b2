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
		Vehicle vehicleToFree = new Vehicle(VehicleType.CAR, Vehicle.HORIZONTAL,3,3);
		vehicles[0]= vehicleToFree;
		vehicles[1]= new Vehicle(VehicleType.TRUCK, Vehicle.VERTICAL,1,1);
		vehicles[2]= new Vehicle(VehicleType.TRUCK, Vehicle.VERTICAL,1,4);
		vehicles[3]= new Vehicle(VehicleType.TRUCK, Vehicle.HORIZONTAL,6,3);
		vehicles[4]= new Vehicle(VehicleType.TRUCK, Vehicle.HORIZONTAL,4,4);
		vehicles[5]= new Vehicle(VehicleType.CAR, Vehicle.VERTICAL,4,3);
		vehicles[6]= new Vehicle(VehicleType.CAR, Vehicle.VERTICAL,5,6);
		
		RushHourParking parking = new RushHourParking(vehicles, vehicleToFree);
		RushHourGame game = new RushHourGame(parking);
		game.play();
	}

}
