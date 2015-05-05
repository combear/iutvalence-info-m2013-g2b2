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
	public Vehicle(VehicleType vehicleType, boolean orientation, int horizontalHeadPosition, int verticalHeadPosition)
	{ 
		this.vehicleType=vehicleType;
		this.orientation=orientation;
		this.horizontalHeadPosition=horizontalHeadPosition;
		this.verticalHeadPosition=verticalHeadPosition;
	}
	
	
	/**
	 * @param x horizontal position axis
	 * @param y vertical position axis
	 * @return true if the position (x,y) is empty, false is it's not.
	 * @throws OutOfRangeException if we ask for a position out of the parking range
	 */
	public boolean isEmpty(int x, int y) throws OutOfRangeException
	{
		if (x>5 || y>5) throw new OutOfRangeException();
		
		if (this.horizontalHeadPosition==x || this.verticalHeadPosition==y)
			return false;
		
		if (this.vehicleType==VehicleType.CAR && this.orientation==HORIZONTAL)
			if (this.verticalHeadPosition-1==y)
				return false;
		if (this.vehicleType==VehicleType.CAR && this.orientation==VERTICAL)
			if (this.horizontalHeadPosition-1==x)
				return false;
		if (this.vehicleType==VehicleType.TRUCK && this.orientation==HORIZONTAL)
			if (this.verticalHeadPosition-1==y && this.verticalHeadPosition-2==y)
				return false;
		if (this.vehicleType==VehicleType.TRUCK && this.orientation==VERTICAL)
			if (this.horizontalHeadPosition-1==x && this.horizontalHeadPosition-2==x)
				return false;
		
		return true;
		
	}
	
	
	
}
