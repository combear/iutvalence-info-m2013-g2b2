package fr.iutvalence.java.tp.rushhour;

/**
 * Class vehicle
 * @author A. Combe, C. Jondet
 */
public class Vehicle
{
	/**vehicle horizontal*/
	public static final boolean HORIZONTAL=false;
	
	/**vehicle vertical*/
	public static final boolean VERTICAL=true;

	/** Size of the vehicle*/
	private final VehicleType vehicleType;
	
	
	/**Orientation of the vehicle*/
	private final boolean orientation;
	
	/** Head position for horizontal axis */
	private int horizontalHeadPosition;
	
	/** Head position for vertical axis */
	private int verticalHeadPosition;
	

	
	/**
	 * Constructor for a Car object used as the head of the car
	 * @param vehicleType : Size of the vehicle
	 * @param orientation : orientation of vehicle (Horizontal or vertical)
	 */
	public Vehicle(VehicleType vehicleType, boolean orientation)
	{ 
		this.vehicleType=vehicleType;
		this.orientation=orientation;
	}
	
}
