package fr.iutvalence.java.tp.rushhour;

/**
 * 2 type of vehicle
 * @author A. Combe, C. Jondet
 */
public enum VehicleType
{
	/**Car*/
	CAR(2),
	
	/**Truck*/
	TRUCK(3);
	
	private final int length;

	private VehicleType(int length)
	{
		this.length = length;
	}
	
	
	public int getLength()
	{
		return this.length;
	}
	
}
