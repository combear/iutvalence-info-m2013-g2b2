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
	private final TypeOfCar size;
	
	
	/**Orientation of the vehicle*/
	private final boolean orientation;
	
	/**
	 * Constructor for a Car object used as the head of the car
	 * @param size : Size of the vehicle
	 * @param orientation : orientation of vehicle (Horizontal or vertical)
	 */
	public Vehicle(TypeOfCar size, boolean orientation)
	{ 
		this.size=size;
		this.orientation=orientation;
	}
	
}
